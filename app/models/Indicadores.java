package models;


import com.avaje.ebean.Model;

import java.util.Date;

public class Indicadores extends Model{

    public Date fechai;
    public Date fechar;
    public Date fecham;
    public double score_obtenido;
    public double score_base;
    public long diasm;
    public long diasr;
    public double Isc;


    //Guarda el arreglo de valores
    public String valores;

    //Valor de la
    public String score;

    public String scoreReal;

    public double porcCumplimiento;

    public double porcCumpI;

    public double porcCumpF;


    public Object[] Indicadores (Date fechaI, Date fechaR, Date fechaM, double scoreI, double score_baseI){


        fechai = fechaI;
        fechar=fechaR;
        fecham=fechaM;
        score_obtenido=scoreI;
        score_base=score_baseI;
        /*String [] fecha_inicial = fechai.toString().split("-");
        int diai= Integer.parseInt(fecha_inicial[2]);
        int mesi= Integer.parseInt(fecha_inicial[1]);

        String [] fecha_solicitud = fechar.toString().split("-");
        int diar= Integer.parseInt(fecha_solicitud[2]);
        int mesr= Integer.parseInt(fecha_solicitud[1]);

        String [] fecha_material = fecham.toString().split("-");
        String diam= fecha_material[2];
        String mesm= fecha_material[1];*/
        int a =0;
        if(fechai.getMonth() == 0){
            a = 31;
        }
        if(fechai.getMonth() == 1){
            a = 28;
        }
        Isc = (score_obtenido/score_base)*100;
        long difr = fechai.getTime()- fechar.getTime();
        //long diasr=0;
        if(difr> 0){
        diasr =(difr/(1000*3600*24));
        }
        else {
            diasr = a + (difr/(1000*3600*24));
        }
        //long diasm =0;
        long difm = fechai.getTime()-fecham.getTime();
        if(difm > 0){
            diasm= (difm/(1000*3600*24));
        }
        else{
            diasm = a+ (difm/(1000*3600*24));
        }
        Object[] Indicadores1 = {diasm,diasr,Isc};
        return  Indicadores1;
    }

    public Indicadores(){

    }

    public Indicadores(String valores, String score, String scoreReal, double porcCumplimiento, double porcCumpI,double porcCumpF){
        this.porcCumpI = porcCumpI;
        this.porcCumpF = porcCumpF;
        this.valores = valores;
        this.score = score;
        this.scoreReal = scoreReal;
        this.porcCumplimiento = porcCumplimiento;
    }
    public void setScore(String score){this.score = score;}

   /*public long getDiasm(){return  diasm;}
    public long getDiasr(){return  diasr;}
    public double getIsc(){return Isc;}
    public int getFallos(){return fallos;}
    public double getIfs(){return Ifs;}

    public void setDiasm(long diasm){this.diasm = diasm;}
    public void setDiasr(long diasr){this.diasr = diasr;}
    public void setIsc(double Isc){this.Isc = Isc;}
    public void setFallos(int fallos){this.fallos=fallos;}
    public void setIfs(double Ifs){this.Ifs = Ifs;}*/



}
