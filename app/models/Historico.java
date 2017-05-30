package models;

import com.avaje.ebean.Model;
import com.avaje.ebeaninternal.server.lib.util.Str;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historico")
public class Historico extends Model {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public long id;

    public String sitio;

    public String responsable;

    public String linea;

    public double scoreo;

    public String codigoItem;

    public String porcItem;

    public String ifs;

    public int no_fallidos;

    public int no_total;

    public Date fechareg;

    public String causa;

    public Historico (String SitioI, String ResponsableI, String lineaI, double scoreoI, String codigoI, String porcI, String ifsI, int fallidos, int total, Date fecharegI , String causaI){

        sitio = SitioI;
        responsable = ResponsableI;
        linea = lineaI;
        scoreo = scoreoI;
        codigoItem = codigoI;
        porcItem = porcI;
        ifs = ifsI;
        no_fallidos = fallidos;
        no_total = total;
        fechareg = fecharegI;
        causa = causaI;
    }

    public String getSitio(){return sitio;}
    public void setSitio(String sitio){this.sitio = sitio;}

    public String getResponsable(){return responsable;}
    public void setResponsable(String responsable){this.responsable = responsable;}

    public String getLinea(){return linea;}
    public void setLinea(String linea){this.linea = linea;}

    public double getScoreo(){return scoreo;}
    public void setScoreo(double scoreo){this.scoreo = scoreo;}

    public String getCodigoItem (){return codigoItem;}
    public void setCodigoItem(String codigoItem){this.codigoItem=codigoItem;}

    public String getPorcItem(){return porcItem;}
    public void setPorcItem(String porcItem){this.porcItem=porcItem;}

    public String getIfs(){return ifs;}
    public void setIfs(String ifs){this.ifs = ifs;}

    public int getNo_fallidos(){return no_fallidos;}
    public void setNo_fallidos(int no_fallidos){this.no_fallidos = no_fallidos;}

    public int getNo_total(){return no_total;}
    public void setNo_total(int no_total){this.no_total = no_total;}

    public Date getFechareg(){return fechareg;}
    public void setFechareg(Date fechareg){this.fechareg = fechareg;}

    public String getCausa(){return causa;}
    public void setCausa(String causa){this.causa=causa;}

    public static Model.Finder<Long, Historico> finderHistorico = new Model.Finder<>(Historico.class);

}
