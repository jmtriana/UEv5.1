package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;


public class Microondas extends Model{

    private static Microondas instance = null;

    public final static String TAG = "Microondas";

    public ArrayList<Item> itemsMicro;
    public ArrayList<Item> itemsHSEm;
    public ArrayList<Item> itemsMarquillasmw;
    public ArrayList<Item> itemsTierramw;
    public ArrayList<Item> itemsPanoramicamw;

    public Microondas(){

        itemsMicro = new ArrayList<>();
        itemsHSEm = new ArrayList<>();
        itemsMarquillasmw = new ArrayList<>();
        itemsTierramw = new ArrayList<>();
        itemsPanoramicamw = new ArrayList<>();

        Item x = null;

        //Primero: HSE

        Item item0mw = new Item("HSE",0,"","Microondas","");
        itemsMicro.add(item0mw);
        itemsHSEm.add(item0mw);
        x = Item.finderItems.where().like("descripcion", item0mw.descripcion).findUnique();
        if(x == null){
            item0mw.save();
        }
        Item item1mw = new Item(" Toda la documentacion legal como documentos de EPS, ARP, carnet de la empresa y certificado de huawei deben se portado por el cooperador.",1,"","Microondas","24.1.061");
        itemsMicro.add(item1mw);
        itemsHSEm.add(item1mw);
        x = Item.finderItems.where().like("descripcion", item1mw.descripcion).findUnique();
        if(x == null){
            item1mw.save();
        }
        Item item2mw = new Item("Elementos de seguridad industrial y herramientas adecuadas para la instalacion deben ser llevadas por cada uno de los integrantes de la cuadrilla.",1,"","Microondas","24.1.062");
        itemsMicro.add(item2mw);
        itemsHSEm.add(item2mw);
        x = Item.finderItems.where().like("descripcion", item2mw.descripcion).findUnique();
        if(x == null){
            item2mw.save();
        }

        // Fin HSE
        // Segundo: Marquillas

        Item item3mw = new Item("Marquillas",0,"","Microondas","");
        itemsMicro.add(item3mw);
        itemsMarquillasmw.add(item3mw);
        x = Item.finderItems.where().like("descripcion", item3mw.descripcion).findUnique();
        if(x == null){
            item3mw.save();
        }
        Item item4mw = new Item("La configuracion de la RTN es realizada correctamente y deacuerdo a los requerimienos de diseño. La marquilla debe ser laminada y sujeta a los tornillos del anclaje del radio.",0.5,"","Microondas","2.1.016");
        itemsMicro.add(item4mw);
        itemsMarquillasmw.add(item4mw);
        x = Item.finderItems.where().like("descripcion", item4mw.descripcion).findUnique();
        if(x == null){
            item4mw.save();
        }
        Item item5mw = new Item(" La marquilla que identifica el enlace en la parte superior debe ser acrílica y diligenciada según formato estándar ",1,"","Microondas","2.1.017");
        itemsMicro.add(item5mw);
        itemsMarquillasmw.add(item5mw);
        x = Item.finderItems.where().like("descripcion", item5mw.descripcion).findUnique();
        if(x == null){
            item5mw.save();
        }
        Item item6mw = new Item("Los cables IF, tanto main como stand by, deben ser marquillados según estándar ",0.5,"","Microondas","2.1.018");
        itemsMicro.add(item6mw);
        itemsMarquillasmw.add(item6mw);
        x = Item.finderItems.where().like("descripcion", item6mw.descripcion).findUnique();
        if(x == null){
            item6mw.save();
        }
        Item item7mw = new Item("Los cables de poder y tierra deben ser marquillados tanto para main como para Stand By",1,"","Microondas","3.2.022");
        itemsMicro.add(item7mw);
        itemsMarquillasmw.add(item7mw);
        x = Item.finderItems.where().like("descripcion", item7mw.descripcion).findUnique();
        if(x == null){
            item7mw.save();
        }
        Item item8mw = new Item(" Todas las marquillas deben ser instaladas, cable DC, cable de tierras, antenas, cable de alarma, cable de transmision, cable coaxial (jumpers) deben ser marquillados a ambos lados es decir del puerto que salen y en el puerto al que entran. ",0.5,"","Microondas","7.1.013");
        itemsMicro.add(item8mw);
        itemsMarquillasmw.add(item8mw);
        x = Item.finderItems.where().like("descripcion", item8mw.descripcion).findUnique();
        if(x == null){
            item8mw.save();
        }
        Item item9mw = new Item("Las marquillas para sitios outdoor deben tener recubrimiento impermeabilizante o debe ser plastica preferiblemente, todas las marquillas indoor y outdoor deben ser instaladas en la misma forma para facil lectura.",1,"","Microondas","7.1.014");
        itemsMicro.add(item9mw);
        itemsMarquillasmw.add(item9mw);
        x = Item.finderItems.where().like("descripcion", item9mw.descripcion).findUnique();
        if(x == null){
            item9mw.save();
        }

        //Fin Marquillas
        //Tercero: Conexion a tierra

        Item item10mw = new Item("Conexiones a tierra", 0,"","Microondas","");
        itemsMicro.add(item10mw);
        itemsTierramw.add(item10mw);
        x = Item.finderItems.where().like("descripcion", item10mw.descripcion).findUnique();
        if(x == null){
            item10mw.save();
        }
        Item item11mw = new Item("Todas las medidas anticorrosivas y de impermeabilizacion deben ser adoptadas para equipos y racks outdoor, se incluyen conectores y jumper de antenas. ",4,"","Microondas","1.1.001");
        itemsMicro.add(item11mw);
        itemsTierramw.add(item11mw);
        x = Item.finderItems.where().like("descripcion", item11mw.descripcion).findUnique();
        if(x == null){
            item11mw.save();
        }
        Item item12mw = new Item(" La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente. ",4,"","Microondas","3.1.005");
        itemsMicro.add(item12mw);
        itemsTierramw.add(item12mw);
        x = Item.finderItems.where().like("descripcion", item12mw.descripcion).findUnique();
        if(x == null){
            item12mw.save();
        }
        Item item13mw = new Item("Cables de poder y tierras deben ser conectados correcta y firmemente.",3,"","Microondas","3.2.004");
        itemsMicro.add(item13mw);
        itemsTierramw.add(item13mw);
        x = Item.finderItems.where().like("descripcion", item13mw.descripcion).findUnique();
        if(x == null){
            item13mw.save();
        }
        Item item14mw = new Item(" La organización del cable de poder y de tierras debe realizarse según el diseño de documento de ingeniería.",0.5,"","Microndas","3.2.025");
        itemsMicro.add(item14mw);
        itemsTierramw.add(item14mw);
        x = Item.finderItems.where().like("descripcion", item14mw.descripcion).findUnique();
        if(x == null){
            item14mw.save();
        }

        // Fin Tierras
        // Cuarto: Panoramicas

        Item item15mw = new Item("Panorámicas",0,"","Microondas","");
        itemsMicro.add(item15mw);
        itemsPanoramicamw.add(item15mw);
        x = Item.finderItems.where().like("descripcion", item15mw.descripcion).findUnique();
        if(x == null){
            item15mw.save();
        }
        Item item16mw = new Item("El brazo anti torsión se úbica al extremo opuesto del punto de  anclaje a mastil y el angúlo entre la dirección y el brazo debe ser menor a 35°",2,"","Microondas","1.1.015");
        itemsMicro.add(item16mw);
        itemsPanoramicamw.add(item16mw);
        x = Item.finderItems.where().like("descripcion", item16mw.descripcion).findUnique();
        if(x == null){
            item16mw.save();
        }
        Item item17mw = new Item("Las partes de soporte del rack y BBU  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.Todas las partes de aislamineto del rack deben ser instaladas como lo son arandelas o placas de impermeabilización.     ",1.5,"","Microondas","1.1.003");
        itemsMicro.add(item17mw);
        itemsPanoramicamw.add(item17mw);
        x = Item.finderItems.where().like("descripcion", item17mw.descripcion).findUnique();
        if(x == null){
            item17mw.save();
        }

        //Fin Panoramicas
    }

    public ArrayList<Item> retornaItems(String mw){
        if(mw.equals("instmw")){
            return itemsHSEm;
        }else if(mw.equals("instmw1")){
            return itemsMarquillasmw;
        }else if(mw.equals("instmw2")){
            return itemsTierramw;
        }else if (mw.equals("instmw3")){
            return itemsPanoramicamw;
        }
        return null;
    }
    public static Microondas getInstance (){
        if(instance==null ){
            instance = new Microondas();
        }
        return instance;
    }
}