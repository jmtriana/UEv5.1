package models;

import java.util.Date;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "principal")
public class Generales extends Model{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public long id;

    @NotNull
    @Constraints.Required
    public Date fechai;

    @NotNull
    @Constraints.Required
    public Date fechaf;

    @NotNull
    @Constraints.Required
    public String responsable;

    @NotNull
    @Constraints.Required
    public String nombre_proyecto;

    @NotNull
    @Constraints.Required
    public String codigo_proyecto;

    public String tec;

    public String actividad;

    public long promedio_dias;

    public Generales(Date fechaiI, Date fechafF, String responsableI, String nombre_proyectoI, String codigo_proyectoI ,String tecI, String actividadI, long promedio_dias1){
        fechai = fechaiI;
        fechaf= fechafF;
        responsable=responsableI;
        nombre_proyecto=nombre_proyectoI;
        codigo_proyecto=codigo_proyectoI;
        tec = tecI;
        actividad = actividadI;
        promedio_dias = promedio_dias1;
    }

    public Date getFechaI(){
        return fechai;
    }

    public Date getFechaF(){
        return fechaf;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public String getCodigo_proyecto(){ return codigo_proyecto;}

    public void setFechai(Date fechai) {
        this.fechai = fechai;
    }

    public void setFechaf(Date fechaf) {
        this.fechaf = fechaf;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public void setCodigo_proyecto(String codigo_proyecto){this.codigo_proyecto = codigo_proyecto;}

    public String getActividad(){return actividad;}
    public void setActividad(String actividad){this.actividad = actividad;}

    public long getPromedio_dias(){return promedio_dias;}
    public void setPromedio_dias(long promedio_dias){this.promedio_dias = promedio_dias;}



   public static Model.Finder<Long, Generales> finderGenerales = new Model.Finder<>(Generales.class);

}