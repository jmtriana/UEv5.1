package controllers;


import com.avaje.ebean.Model;
import views.html.*;
import com.google.common.collect.Lists;
import models.*;
import org.apache.http.impl.conn.Wire;
import play.data.Form;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Int;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class GeneralesController extends Controller {

    public String [] header_mw1 = new String[4];
    public String [] header_dwdm1 = new String[7];
    public String linea = "";
    public String[] selecwl = new String[11];
    public String[] selecwl1 = new String[11];
    public Object[] vector_indice = new Object[5];
    public String[] partesInicial = new String[3];
    public String[] partesRequest = new String[3];
    public String[] partesMaterial = new String[3];
    public String[] partesFinal = new String[3];
    //Indicadores[] vector;
    public Indicadores indic = new Indicadores("","","", 0.0,0.0,0.0);

    public Result primerMensaje() {
        Date fechai = new Date();
        Date fechaf = new Date();
        String responsable = "admin";
        String nombre = "prueba";

        //Generales  = new Generales(fechai, fechaf, responsable, nombre, "ok","wl");

        return ok();
    }

    public Result tabla() {

            if(linea.equals("dwdm")){
             System.out.println("Ingreso a tabla dwdm");
             ArrayList<Item> c = new ArrayList<>();
             ArrayList<Item> SelectedDWDM = new ArrayList<>();
             DWDM dwdm = DWDM.getInstance();
             for(int k=0; k<header_dwdm1.length; k++){
                 c = dwdm.retornadwdm(header_dwdm1[k].toString());
                 SelectedDWDM.addAll(c);
             }
                Item [] res2 = arrayListToArray(SelectedDWDM);
                return ok(views.html.table.render(res2,indic));
            }

            if(linea.equals("microondas")){
                System.out.println("Entro a tabla microondas");
                ArrayList<Item> b = new ArrayList<>();
                ArrayList<Item> SelectedItems = new ArrayList<>();
                Microondas microondas = Microondas.getInstance();
                for(int j=0; j < header_mw1.length; j++){
                    b = microondas.retornaItems(header_mw1[j].toString());
                    SelectedItems.addAll(b);
                }
                Item [] res1 = arrayListToArray(SelectedItems);
                return ok(views.html.table.render(res1,indic));
            }

            ArrayList<Item> a = new ArrayList<>();
            ArrayList<Item> salidaItems = new ArrayList<>();
            Wireless wireless = Wireless.getInstance();
            System.out.println("selecw11 size: " + selecwl1.length);
            for (int i = 0; i < selecwl1.length; i++) {
                System.out.println("Current i: " + i);
                a = wireless.tomaItems(selecwl1[i].toString());
                System.out.println("Encabezado: " + a.get(0).descripcion);
                salidaItems.addAll(a);
                System.out.println("Size of a: " + a.size());
                System.out.println("Size of salidaItems: " + salidaItems.size());
            }
            Item[] res = arrayListToArray(salidaItems);
            return ok(views.html.table.render(res,indic));

        /*if(linea.equals("microondas")){
            ArrayList<Item> b = new ArrayList<>();
            ArrayList<Item> seleccionados = new ArrayList<>();
            Microondas micro = Microondas.getInstance();
            for(int j=0;j < header_mw.length;j++){
                b = micro.retornaItems(header_mw[j].toString());
                seleccionados.addAll(b);
            }
            Item [] res1 = arrayListToArray(seleccionados);
            return ok(views.html.table.render(res1,indic));
        }
        return null;*/
    }

    public Item[] arrayListToArray(ArrayList<Item> array) {

        Item[] result = new Item[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }

        return result;
    }

    public Result graficosIndicadores() {

        String [] arr = {};
        Generales[] aHistorico = listToArray(Generales.finderGenerales.orderBy().desc("id").findList());

        Form<Historico> formHistorico = Form.form(Historico.class);
        return ok(views.html.graficos.render(formHistorico,vector_indice, arr, indic.score, indic.scoreReal,aHistorico));
    }


    public Result createProject() {
        Form<Generales> formGeneral = Form.form(Generales.class);
        return ok(views.html.general.render(formGeneral, indic));
    }

    public Result postCreateProject() throws Exception {
        Form<Generales> formGeneral = Form.form(Generales.class).bindFromRequest();

        if (request().method().equals("POST")) {

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//=============================================== CAPTURA VARIABLES ========================================

            String nombrePr = formGeneral.field("nombre_proyecto").value(); // Captura Site
            String code = formGeneral.field("codigo_proyecto").value(); // Code
            String responsable = formGeneral.field("responsable").value(); // Responsable
            /*String fallos = formGeneral.field("fallos").value(); //Fallos reportados
            String fallosres = formGeneral.field("fallosres").value(); // Fallos resueltos
            int fallos_num = Integer.parseInt(fallos); //Fallos reportados numero
            int fallosres_num = Integer.parseInt(fallosres); // Fallos resueltos numero*/

            //Fechas
            String fechai = formGeneral.field("fechai").value();
            System.out.println("fechaInicial: " + fechai);
            String fechaf = formGeneral.field("fechaf").value();
            System.out.println("fechaFinal: " + fechaf);
            Date fechaInicial = formatter.parse(fechai); // Fecha Inicial
            Date fechaFinal = formatter.parse(fechaf); // Fecha Final
            partesInicial = fechai.split("-");
            partesFinal = fechaf.split("-");
            //fin fechas , inicio linea
            String tec = formGeneral.field("tec").value(); //linea
            System.out.println("Linea " + tec);
            // checkbox tabla wl
            String selected = formGeneral.field("inst").value();
            String selected2 = formGeneral.field("inst2").value();
            String selected3 = formGeneral.field("inst3").value();
            String selected4 = formGeneral.field("inst4").value();
            String selected5 = formGeneral.field("inst5").value();
            String selected6 = formGeneral.field("inst6").value();
            String selected7 = formGeneral.field("inst7").value();
            String selected8 = formGeneral.field("inst8").value();
            String selected9 = formGeneral.field("inst9").value();
            String selected10 = formGeneral.field("inst10").value();
            String selected11 = formGeneral.field("inst11").value();
            // cheackbox tabla mw
            String mw0 = formGeneral.field("instmw").value();
            String mw1 = formGeneral.field("instmw1").value();
            String mw2 = formGeneral.field("instmw2").value();
            String mw3 = formGeneral.field("instmw3").value();
            String [] header_mw = new String [4];
            header_mw[0]=mw0;
            header_mw[1]=mw1;
            header_mw[2]=mw2;
            header_mw[3]=mw3;
            header_mw1 = RemoveNull(header_mw);
            //cheackbox tabla dwdm
            String dw0 = formGeneral.field("dw").value();
            String dw1 = formGeneral.field("dw1").value();
            String dw2 = formGeneral.field("dw2").value();
            String dw3 = formGeneral.field("dw3").value();
            String dw4 = formGeneral.field("dw4").value();
            String dw5 = formGeneral.field("dw5").value();
            String dw6 = formGeneral.field("dw6").value();
            String [] header_dwdm = new String[7];
            header_dwdm[0] = dw0;
            header_dwdm[1] = dw1;
            header_dwdm[2] = dw2;
            header_dwdm[3] = dw3;
            header_dwdm[4] = dw4;
            header_dwdm[5] = dw5;
            header_dwdm[6] = dw6;
            header_dwdm1 = RemoveNull(header_dwdm);
            System.out.println(Arrays.toString(header_dwdm1));
            //checkbox dw actividad
            String [] act_dwdm = new String[2];
            act_dwdm[0] = formGeneral.field("dw_act").value();
            act_dwdm[1] = formGeneral.field("dw_act1").value();
            act_dwdm= RemoveNull(act_dwdm);
            System.out.println(Arrays.toString(act_dwdm));
            //checkbox mw actividad
            String sel_mw = formGeneral.field("mw").value();
            String sel_mw1 = formGeneral.field("mw1").value();
            String sel_mw2 = formGeneral.field("mw2").value();
            String sel_mw3 = formGeneral.field("mw3").value();
            String [] act_mw = new String[4];
            act_mw[0]=sel_mw;
            act_mw[1]=sel_mw1;
            act_mw[2]=sel_mw2;
            act_mw[3]=sel_mw3;
            act_mw = RemoveNull(act_mw);
            System.out.println(Arrays.toString(header_mw1));
            System.out.println(Arrays.toString(act_mw));
            //Checkbox wl actividad
            String sel_wl1 = formGeneral.field("wl1").value();
            String sel_wl2 = formGeneral.field("wl2").value();
            String sel_wl6 = formGeneral.field("wl6").value();

            String [] act_wl = new String[3];
            String actividad_seleccionada="";
            act_wl[0]=sel_wl1;
            act_wl[1]=sel_wl2;
            act_wl[2]=sel_wl6;



            selecwl[0] = selected;
            selecwl[1] = selected2;
            selecwl[2] = selected3;
            selecwl[3] = selected4;
            selecwl[4] = selected5;
            selecwl[5] = selected6;
            selecwl[6] = selected7;
            selecwl[7] = selected8;
            selecwl[8] = selected9;
            selecwl[9] = selected10;
            selecwl[10] = selected11;


            //selecwl ={selected,selected2,selected3,selected4,selected5,selected6,selected7,selected8,selected9,selected10,selected11};
            int op=0;
            System.out.println(Arrays.toString(selecwl));
            act_wl= RemoveNull(act_wl);
            System.out.println(Arrays.toString(act_wl));

            // FIN CAPTURA
// ==================================================== CONDICIONES FECHA =========================================


            if (Integer.parseInt(partesFinal[1]) == Integer.parseInt(partesInicial[1])) { // Condicion fecha final respecto inicial
                if (Integer.parseInt(partesFinal[2]) >= Integer.parseInt(partesInicial[2])) {
                    System.out.println("ok finalizacion");
                } else {
                    System.out.println("error, la fecha de finalización no puede estar antes de iniciar.");
                    formGeneral.reject("fechaf", "Error, esta fecha no puede ir antes de iniciar la actividad");
                }

            }

            int dias_mes = 0;
            long prom_dias=0;
            if(fechaInicial.getMonth()==0){dias_mes=31;}
            else if (fechaInicial.getMonth()==1){dias_mes=28;}
            else if (fechaInicial.getMonth()==2){dias_mes=31;}
            else if (fechaInicial.getMonth()==3){dias_mes=30;}
            else if (fechaInicial.getMonth()==4){dias_mes=31;}
            else if (fechaInicial.getMonth()==5){dias_mes=30;}
            else if (fechaInicial.getMonth()==6){dias_mes=31;}
            else if (fechaInicial.getMonth()==7){dias_mes=31;}
            else if (fechaInicial.getMonth()==8){dias_mes=30;}
            else if (fechaInicial.getMonth()==9){dias_mes=31;}
            else if (fechaInicial.getMonth()==10){dias_mes=30;}
            else {dias_mes=31;}

            long diferencia=0;
            diferencia = fechaFinal.getTime()-fechaInicial.getTime();
            System.out.println("mes actual: "+fechaInicial.getMonth());
            System.out.println("diferencia: "+diferencia);

            if(diferencia> 0){
                prom_dias = (diferencia/(1000*3600*24));
            } else {
                prom_dias = dias_mes + (diferencia/(1000*3600*24));
            }
            System.out.println("promedio: "+prom_dias);


// FIN CONDICIONES FECHA
//==================================================== CONDICIONES LINEA SELECCIONADA

            linea = "";
            if (tec != null) {
                if (tec.equals("dwdm")) {
                    linea = "dwdm";
                    op=1;
                } else if (tec.equals("microondas")) {
                    linea = "microondas";
                    op=2;
                } else if (tec.equals("wireless")) {
                    linea = "wireless";
                    op=3;
                } else if (tec.equals("access")) {
                    linea = "access";
                    op=4;
                    return ok(views.html.error.render("La linea "+linea+" aun no se encuentra disponible"));
                }
            }
// FIN CONDICIONES LINEA SELECCIONADA

//==================================================== CALCULO INDICADORES DE FECHA


String tiempo_req="";
String tiempo_mat="";
String tiempo_act="";
int mw_act=0;
int wl_temp_act=0;
System.out.println("op: "+op);
switch (op){
    case 1: //=======================================Caso dwdm
        if(act_dwdm[0].equals("dw_act")){
            actividad_seleccionada="opticas";
        }else if(act_dwdm[0].equals("dw_act1")){
            actividad_seleccionada="datacom";
        }else{
            actividad_seleccionada="-";
        }
        System.out.println("dwdm: "+actividad_seleccionada);
    break;
    case 2: //=======================================Caso microondas
        if(act_mw[0].equals("mw")){
            actividad_seleccionada="Antena 0.3/0.6";
        }else if(act_mw[0].equals("mw1")){
            actividad_seleccionada="Antena 0.9/1.2";
        }else if(act_mw[0].equals("mw2")){
            actividad_seleccionada="Antena 1.8/2.4";
        }else if(act_mw[0].equals("mw3")){
            actividad_seleccionada="Antena 3.0/3.7";
        }else{
            actividad_seleccionada="Otro";
        }
        System.out.println("Actividad: "+actividad_seleccionada);
    break;
    case 3: //========================================Caso Wireless
System.out.println("Entro a caso wl");
    // Actividad a bd
        if(act_wl[0].equals("wl1")){
            actividad_seleccionada = "Nueva";
        }else if(act_wl[0].equals("wl2")){
            actividad_seleccionada = "Swap";
        }else{
            actividad_seleccionada = "Otro";
        }
        //Tiempos de actividad seleccionada
        /*
        if(act_wl[0].equals("wl1")){
        wl_temp_act = 1;
        }
        if(act_wl[0].equals("wl2")){ //falta
            wl_temp_act=2;
            System.out.println("tiempo wl"+wl_temp_act);
        } else if(act_wl[0].equals("wl3")){
            wl_temp_act=1;
        } else if(act_wl[0].equals("wl4")){ //falta
            wl_temp_act=3;
        } else if(act_wl[0].equals("wl5")){ //falta
            wl_temp_act=4;
        } else if (act_wl[0].equals("wl6")){
            wl_temp_act=5;
        }else if(act_wl[0].equals("wl7")){
            wl_temp_act=1;
        }*/

        //==========
    break;
    case 4:
    break;
    default:
        break;

} // Cierre Switch



// FIN INDICADORES DE TIEMPO


// ====================================================HEADRES SELECCIONADOS

            selecwl1 = RemoveNull(selecwl);
            System.out.println(Arrays.toString(selecwl1));
// FIN HEADERS

            //if(selecwl == null) {
            //    verActividades();
            // }

// ====================================================== INDICADORES

/*double score_ = 0.5;
            double score_re = 1;

            Indicadores calcular = new Indicadores();
            vector_indice = calcular.Indicadores(fechaInicial, fechaRequest, fechaMaterial, score_, score_re);
            System.out.println("Indicadores" + Arrays.toString(vector_indice));*/


// FIN INDICADORES

            if (nombrePr.isEmpty()) {
                formGeneral.reject("nombre_proyecto", "Por favor ingrese el site name del proyecto.");
            }
            if (fechai.isEmpty()) {
                formGeneral.reject("fechai", "Por favor ingrese una fecha válida.");
            }
            if (fechaf.isEmpty()) {
                formGeneral.reject("fechaf", "Por favor ingrese una fecha válida.");
            }
            if (responsable.isEmpty()) {
                formGeneral.reject("nombre_proyecto", "Por favor ingrese un responsable.");
            }
            if (code.isEmpty()) {
                formGeneral.reject("codigo_proyecto", "Por favor ingrese el código.");
            }

            if (formGeneral.hasErrors()) {
                System.out.println("Entró a errores");
                System.out.println(formGeneral.errors().toString());
                //return badRequest(views.html.general.render(formGeneral, indic));
                return ErrorPage();
            } else {



                Generales nuevo = new Generales(fechaInicial, fechaFinal, responsable, nombrePr, code, linea,actividad_seleccionada,prom_dias); // Info base de datos
                nuevo.save();

                return tabla();
                //Wireless tabla = new Wireless(selected);
                // Indicadores calculo = new Indicadores(fechaInicial,fechaRequest,fechaMaterial,);
            }
        } else {
            return redirect(routes.HomeController.index());
        }
    }

    public Generales[] listToArray(List<Generales> array) {

        Generales[] result = new Generales[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }

        return result;
    }
    public Historico[] listToArrayh(List<Historico> arrayh) {

        Historico[] result = new Historico[arrayh.size()];
        for (int i = 0; i < arrayh.size(); i++) {
            result[i] = arrayh.get(i);
        }

        return result;
    }

    public Result seeActivities(){
        Generales[] array = listToArray(Generales.finderGenerales.all());
        Generales[] datos_wl = listToArray(Generales.finderGenerales.where().like("tec","wireless").findList());
        Historico[] general = listToArrayh(Historico.finderHistorico.all());
        Historico[] linea_wl = listToArrayh(Historico.finderHistorico.where().like("linea","wireless").findList());
        Historico[] linea_mw = listToArrayh(Historico.finderHistorico.where().like("linea","microondas").findList());
        Historico[] linea_dw = listToArrayh(Historico.finderHistorico.where().like("linea","dwdm").findList());
        int sitios_ok = Historico.finderHistorico.where().like("ifs","1").findList().size();

        int total_reg = Historico.finderHistorico.all().size();
        int total_wl = Historico.finderHistorico.where().like("linea","wireless").findRowCount();
        //long prom_indice = Historico.finderHistorico.
        System.out.println("historico"+total_reg);
        System.out.println("wireless"+total_wl);
        return ok(views.html.resumen.render(array,datos_wl,total_reg,total_wl,general,linea_wl,linea_mw,linea_dw,sitios_ok));
    }

   public String[] RemoveNull (String x[]){
        x = Arrays.stream(x).filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        return  x;
   }

   public void prueba(){


       //Generales.finderGenerales.setQuery("SELECT count (*) FROM principal WHERE a_tiempo = 1");
       //int sirve = Integer.parseInt(Generales.finderGenerales.query().toString());
       /*System.out.println("BD datos:"+Generales.finderGenerales.where().like("a_tiempo","1").findList().size());
       int sirve = Generales.finderGenerales.where().like("a_tiempo","1").findList().size()*100; //Buenos mat/req
       int sirve_mat = Generales.finderGenerales.where().like("a_tiempo_material","1").findList().size()*100; //Buenos ini_mat
       int sirve_act= Generales.finderGenerales.where().like("a_tiempo_actividad","1").findList().size()*100; //Buenos fin_ini
       int total = Generales.finderGenerales.all().size();
       double div=sirve/total;
       double div_mat=sirve_mat/total;
       double div_act=sirve_act/total;


       System.out.println("sirve: "+sirve);
       System.out.println("sirveMat: "+sirve_mat);
       System.out.println("total: "+total);
       System.out.println("porc: "+ div);
       System.out.println("porc: "+ div_mat);*/

       indic.porcCumplimiento = 1;
       indic.porcCumpI= 1;
       indic.porcCumpF= 1;

   }
   public long tiempos (Date fechaini, Date fechafin){

      int dias_mes_i=0;int a=Integer.parseInt(partesInicial[1]);

       //========================================= Mes Inicial
       if(a==1){
           dias_mes_i=31;
       }else if(a==2){
           dias_mes_i=28;
       }else if(a==3){
           dias_mes_i=31;
       }

       long dif_fin;
       long diasf_i;

       dif_fin=fechafin.getTime()-fechaini.getTime();

       //=========================================== Dias final a inicial
       if(dif_fin>0){
           diasf_i=(dif_fin/(1000*3600*24));
       }else if(dif_fin==0) {
           diasf_i=1;
       }else{
           diasf_i=dias_mes_i+(dif_fin/(1000*3600*24));
       }
       //===========================================

       long tempos=diasf_i;

       return tempos;
   }

   public Result postHistorico() throws ParseException {
       Form<Historico> formHistorico = Form.form(Historico.class).bindFromRequest();
       System.out.println("Entro a POST");
       if(request().method().equals("POST")){
           String aaaa = "";
           String site_name_2 = formHistorico.field("site2").value().toString();
           String responsable_2 = formHistorico.field("resp").value().toString();
           String tecnologia_2 = formHistorico.field("tec").value().toString();
           String ifs = formHistorico.field("ifs").value().toString();
           String score = formHistorico.field("score").value().toString();
           double scoren = Double.parseDouble(score);
           String codigo = formHistorico.field("codigo").value().toString();
           String porc = formHistorico.field("porc").value().toString();
           //double porcn = Double.parseDouble(porc);
           String[] codigos = codigo.split(",");
           String[] porcentajes = porc.split(",");
           String fallidos = formHistorico.field("nfallidos").value().toString();
           int nfallidos = Integer.parseInt(fallidos);
           String totales = formHistorico.field("ntotal").value().toString();
           int ntotal = Integer.parseInt(totales);
           String fecha = formHistorico.field("date").value().toString();
           DateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
           Date fechareg = formato.parse(fecha);
           String causa = formHistorico.field("causas").value().toString();
           System.out.println("Site 2: "+site_name_2);
           System.out.println("Responsable: "+responsable_2);
           System.out.println("Tec: "+tecnologia_2);
           System.out.println("Score: "+score);
           System.out.println("Codigo: "+codigo);
           System.out.println("Codigo Split: "+ Arrays.toString(codigos));
           System.out.println("porc: "+porc);
           System.out.println("Porcentaje Split: "+ Arrays.toString(porcentajes));
           System.out.println("ifs: "+ifs);
           System.out.println("Fecha: "+fecha);
           System.out.println("causa: "+causa);

           if(ifs.equals("SI")){
            aaaa = "1";
            System.out.println("nuevo ifs: "+aaaa);
           }else{
            aaaa = "0";
            System.out.println("nuevo ifs: "+aaaa);
           }

           Historico guardarData = new Historico(site_name_2,responsable_2,tecnologia_2,scoren,codigo,porc,aaaa,nfallidos,ntotal,fechareg, causa);
           guardarData.save();

           if(formHistorico.hasErrors()){
               return ErrorPage();
           }

       }else{
           return redirect(routes.HomeController.index());
       }
       return seeActivities();
   }

   public Result ErrorPage(){
       String mensaje = "Se ha presentado un error en el formulario, vuelve a la pagina anterior";
      return ok(views.html.error.render(mensaje));
   }



}

