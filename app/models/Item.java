package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item extends Model{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public long id;

    @Lob
    @Constraints.Required
    public String descripcion;

    @Constraints.Required
    public double score;

    @Constraints.Required
    public double porcentaje;

    @Constraints.Required
    public double score_real;

    @Constraints.Required
    public boolean seleccionado;

    @Constraints.Required
    public String encabezado;

    public String tecn;

    public String code;

    public Item(String descripcion, double score, String encabezado, String tecn, String code){
        this.descripcion = descripcion;
        this.score = score;
        score_real = 0;
        porcentaje = 0;
        seleccionado = true;
        this.encabezado = encabezado;
        this.tecn = tecn;
        this.code=code;
    }

    public long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getScore() {
        return score;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double getScore_real() {
        return score_real;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void setScore_real(double score_real) {
        this.score_real = score_real;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public void setCode(String code){this.code=code;}

    public String getCode(){return code;}


    public static Model.Finder<Long, Item> finderItems = new Model.Finder<>(Item.class);


}
