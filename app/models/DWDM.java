package models;

import com.amazonaws.services.apigateway.model.Model;
import play.data.validation.Constraints;

import javax.persistence.OneToMany;
import java.util.ArrayList;

public class DWDM extends Model{

    public double standar_time_dwdm;
    public int fallos_dwdm;
    public Item itemsDwdm;

    private static DWDM instance = null;

    public final static String TAG = "DWDM";

    public ArrayList<Item> itemsDWDM;
    public ArrayList<Item> itemsHSEd;
    public ArrayList<Item> itemsRack;
    public ArrayList<Item> itemsEquip;
    public ArrayList<Item> itemsCables;
    public ArrayList<Item> itemsEnergy;
    public ArrayList<Item> itemsCyE;
    public ArrayList<Item> itemsLabelsD;

    public DWDM(){
        standar_time_dwdm = 0;
        fallos_dwdm = 0;

        itemsDWDM = new ArrayList<>();
        itemsHSEd = new ArrayList<>();
        itemsRack = new ArrayList<>();
        itemsEquip = new ArrayList<>();
        itemsCables = new ArrayList<>();
        itemsEnergy = new ArrayList<>();
        itemsCyE = new ArrayList<>();
        itemsLabelsD = new ArrayList<>();

        Item x = null;

        // Primer Encabezado HSE

        Item item0dw = new Item("HSE y adicionales",0,"","dwdm","");
        itemsDWDM.add(item0dw);
        itemsHSEd.add(item0dw);
        x = Item.finderItems.where().like("descripcion",item0dw.descripcion).findUnique();
        if(x == null){
            item0dw.save();
        }
        Item item1dw = new Item(" Toda la documentacion legal como documentos de EPS, ARP, carnet de la empresa y certificado de huawei deben se portado por el cooperador.",1,"","dwdm","24.1.061");
        itemsDWDM.add(item1dw);
        itemsHSEd.add(item1dw);
        x = Item.finderItems.where().like("descripcion",item1dw.descripcion).findUnique();
        if(x == null){
            item1dw.save();
        }
        Item item2dw = new Item("Elementos de seguridad industrial y herramientas adecuadas para la instalacion deben ser llevadas por cada uno de los integrantes de la cuadrilla.",1,"","dwdm","24.1.062");
        itemsDWDM.add(item2dw);
        itemsHSEd.add(item2dw);
        x = Item.finderItems.where().like("descripcion",item2dw.descripcion).findUnique();
        if(x == null){
            item2dw.save();
        }
        Item item3dw = new Item(" El cuarto de equipos debe estar limpio y organizado, las partes sobrantes deben quedar organizadas registradas y entregadas al cliente.",0.2,"","dwdm","19.1.005");
        itemsDWDM.add(item3dw);
        itemsHSEd.add(item3dw);
        x = Item.finderItems.where().like("descripcion",item3dw.descripcion).findUnique();
        if(x == null){
            item3dw.save();
        }
        Item item4dw = new Item("Los sobrante de los amarres, tuercas, tornillos y otros elementos  no deben existir dentro, bajo o sobre el rack. ",0.5,"","dwdm","1.1.009");
        itemsDWDM.add(item4dw);
        itemsHSEd.add(item4dw);
        x = Item.finderItems.where().like("descripcion",item4dw.descripcion).findUnique();
        if(x == null){
            item4dw.save();
        }

        //Segundo encabezado: Instalacion gabinete

        Item item5dw = new Item("Instalación Gabinete",0,"","dwdm","");
        itemsDWDM.add(item5dw);
        itemsRack.add(item5dw);
        x = Item.finderItems.where().like("descripcion",item5dw.descripcion).findUnique();
        if(x == null){
            item5dw.save();
        }
        Item item6dw = new Item("Todas las medidas anticorrosivas y de impermeabilizacion deben ser adoptadas para equipos y racks.",4,"","dwdm","1.1.001");
        itemsDWDM.add(item6dw);
        itemsRack.add(item6dw);
        x = Item.finderItems.where().like("descripcion",item6dw.descripcion).findUnique();
        if(x == null){
            item6dw.save();
        }
        Item item7dw = new Item(" Las partes de soporte del rack  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.Todas las partes de aislamineto del rack deben ser instaladas como lo son arandelas o placas de impermeabilización.",1.5,"","dwdm","1.1.003");
        itemsDWDM.add(item7dw);
        itemsRack.add(item7dw);
        x = Item.finderItems.where().like("descripcion",item7dw.descripcion).findUnique();
        if(x == null){
            item7dw.save();
        }
        Item item8dw = new Item(" El rack debe ser instalado de acuerdo a la posición indicada en el documento de ingeniería.",0.5,"","dwdm","1.1.008");
        itemsDWDM.add(item8dw);
        itemsRack.add(item8dw);
        x = Item.finderItems.where().like("descripcion",item8dw.descripcion).findUnique();
        if(x == null){
            item8dw.save();
        }
        Item item9dw = new Item("Las caras del rack deben estar alineadas con la fila de racks correspondientes.",0.2,"","dwdm","1.1.010");
        itemsDWDM.add(item9dw);
        itemsRack.add(item9dw);
        x = Item.finderItems.where().like("descripcion",item9dw.descripcion).findUnique();
        if(x == null){
            item9dw.save();
        }
        Item item10dw = new Item("La manila antiestatica debe ser insertada en el orificio del equipo correspondiente.",0.2,"","dwdm","1.1.011");
        itemsDWDM.add(item10dw);
        itemsRack.add(item10dw);
        x = Item.finderItems.where().like("descripcion",item10dw.descripcion).findUnique();
        if(x == null){
            item10dw.save();
        }
        Item item11dw = new Item("Todos los paneles falsos del equipo deben ser ubicados en sus slots correspondientes.",0.2,"","dwdm","1.1.012");
        itemsDWDM.add(item11dw);
        itemsRack.add(item11dw);
        x = Item.finderItems.where().like("descripcion",item11dw.descripcion).findUnique();
        if(x == null){
            item11dw.save();
        }
        Item item12dw = new Item("El rack debe estar sin ningun golpe o daño en su estructura.",1.5,"","dwdm","1.1.013");
        itemsDWDM.add(item12dw);
        itemsRack.add(item12dw);
        x = Item.finderItems.where().like("descripcion",item12dw.descripcion).findUnique();
        if(x == null){
            item12dw.save();
        }
        Item item13dw = new Item("La resistencia entre el punto de tierra y los pernos de fijacion debe ser minimo de 5MΩ",6,"","dwdm","6.1.007");
        itemsDWDM.add(item13dw);
        itemsRack.add(item13dw);
        x = Item.finderItems.where().like("descripcion",item13dw.descripcion).findUnique();
        if(x == null){
            item13dw.save();
        }

        //Tercer Encabezado: Instalacion Equipos

        Item item14dw = new Item("Instalación Equipos",0,"","dwdm","");
        itemsDWDM.add(item14dw);
        itemsEquip.add(item14dw);
        x = Item.finderItems.where().like("descripcion",item14dw.descripcion).findUnique();
        if(x == null){
            item14dw.save();
        }
        Item item15dw = new Item("Las partes de soporte del ATN, ODF, DDF y PATCH PANEL  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.",1.5,"","dwdm","1.1.004");
        itemsDWDM.add(item15dw);
        itemsEquip.add(item15dw);
        x = Item.finderItems.where().like("descripcion",item15dw.descripcion).findUnique();
        if(x == null){
            item15dw.save();
        }

        // Cuarto Encabezado: Instalacion de cables

        Item item16dw = new Item("Instalacion de cables",0,"","dwdm","");
        itemsDWDM.add(item16dw);
        itemsCables.add(item16dw);
        x = Item.finderItems.where().like("descripcion",item16dw.descripcion).findUnique();
        if(x == null){
            item16dw.save();
        }
        Item item17dw = new Item("No existe daño o ruptura en el conector del cable suscriptor.",2,"","dwdm","4.1.001");
        itemsDWDM.add(item17dw);
        itemsCables.add(item17dw);
        x = Item.finderItems.where().like("descripcion",item17dw.descripcion).findUnique();
        if(x == null){
            item17dw.save();
        }
        Item item18dw = new Item("La forma y organización del cable dentro del rack debe ser correcta y como se especifico en el documento de diseño del sitio.  ",0.5,"","dwdm","4.1.009");
        itemsDWDM.add(item18dw);
        itemsCables.add(item18dw);
        x = Item.finderItems.where().like("descripcion",item18dw.descripcion).findUnique();
        if(x == null){
            item18dw.save();
        }
        Item item19dw = new Item("El cableado debe ser amarrado de forma uniforme y por capas, el amarrado debe ser limpio y los amarres blancos deben asegurar hacia un mismo lado. los cortes de sobrante del amarre no deben tener puntas o filos que puedan afectar elementos de la instalación o a los mismos instaladores.",0.5,"","dwdm","4.1.014");
        itemsDWDM.add(item19dw);
        itemsCables.add(item19dw);
        x = Item.finderItems.where().like("descripcion",item19dw.descripcion).findUnique();
        if(x == null){
            item19dw.save();
        }
        Item item20dw = new Item(" La fibra optica debe ser protegida por espiral plastica al interior del rack y amarrada con velcro.",0.5,"","dwdm","5.1.009");
        itemsDWDM.add(item20dw);
        itemsCables.add(item20dw);
        x = Item.finderItems.where().like("descripcion",item20dw.descripcion).findUnique();
        if(x == null){
            item20dw.save();
        }

        //Quinto encabezado: Cable de energia

        Item item21dw = new Item("Cable de energía",0,"","dwdm","");
        itemsDWDM.add(item21dw);
        itemsEnergy.add(item21dw);
        x = Item.finderItems.where().like("descripcion",item21dw.descripcion).findUnique();
        if(x == null){
            item21dw.save();
        }
        Item item22dw = new Item("La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente.",4,"","dwdm","3.1.005");
        itemsDWDM.add(item22dw);
        itemsEnergy.add(item22dw);
        x = Item.finderItems.where().like("descripcion",item22dw.descripcion).findUnique();
        if(x == null){
            item22dw.save();
        }
        Item item23dw = new Item(" Cables de poder y tierras deben ser conectados correcta y firmemente.",3,"","dwdm","3.2.004");
        itemsDWDM.add(item23dw);
        itemsEnergy.add(item23dw);
        x = Item.finderItems.where().like("descripcion",item23dw.descripcion).findUnique();
        if(x == null){
            item23dw.save();
        }
        Item item24dw = new Item("La organización del cable de poder y de tierras debe realizarse según el diseño de documento de ingeniería.",0.5,"","dwdm","3.2.025");
        itemsDWDM.add(item24dw);
        itemsEnergy.add(item24dw);
        x = Item.finderItems.where().like("descripcion",item24dw.descripcion).findUnique();
        if(x == null){
            item24dw.save();
        }
        Item item25dw = new Item("Los cables de poder no se deben cruzar entre si ni con cables existentes. El tendido debe realizarse segun los requerimientos de diseño. Si son figurados en paralelo, debe existir como minimo 3 cm de espaciamiento entre ellos.",0.5,"","dwdm","3.2.044");
        itemsDWDM.add(item25dw);
        itemsEnergy.add(item25dw);
        x = Item.finderItems.where().like("descripcion",item25dw.descripcion).findUnique();
        if(x == null){
            item25dw.save();
        }

        // Sexto Encabezado: Canaleta y Escalerilla

        Item item26dw = new Item("Canaleta y Escalerilla",0,"","dwdm","");
        itemsDWDM.add(item26dw);
        itemsCyE.add(item26dw);
        x = Item.finderItems.where().like("descripcion",item26dw.descripcion).findUnique();
        if(x == null){
            item26dw.save();
        }
        Item item27dw = new Item("La escalerilla debe ser instalada adecuadamente con los accesorios necesarios para garantizar la fijación de la misma. Debe quedar a nivel y aterrizada a barraje de sitio.",1,"","dwdm","10.0.001");
        itemsDWDM.add(item27dw);
        itemsCyE.add(item27dw);
        x = Item.finderItems.where().like("descripcion",item27dw.descripcion).findUnique();
        if(x == null){
            item27dw.save();
        }
        Item item28dw = new Item("La escalerilla debe ser instalada adecuadamente con los accesorios necesarios garantizando la fijacion de la misma.Debe quedar a nivel y aterrizada al barraje del sitio.",1,"","dwdm","10.0.002");
        itemsDWDM.add(item28dw);
        itemsCyE.add(item28dw);
        x = Item.finderItems.where().like("descripcion",item28dw.descripcion).findUnique();
        if(x == null){
            item28dw.save();
        }

        //Marquillas

        Item item29dw = new Item("Marquillas",0,"","dwdm","");
        itemsDWDM.add(item29dw);
        itemsLabelsD.add(item29dw);
        x = Item.finderItems.where().like("descripcion",item29dw.descripcion).findUnique();
        if(x == null){
            item29dw.save();
        }
        Item item30dw = new Item("El ODF, DDF y PATCH PANEL deben ser identificados con sus respectivas marquillas ",0.5,"","dwdm","2.1.019");
        itemsDWDM.add(item30dw);
        itemsLabelsD.add(item30dw);
        x = Item.finderItems.where().like("descripcion",item30dw.descripcion).findUnique();
        if(x == null){
            item30dw.save();
        }
        Item item31dw = new Item(" Los cables de poder y tierra deben ser marquillados",1,"","dwdm","3.2.022");
        itemsDWDM.add(item31dw);
        itemsLabelsD.add(item31dw);
        x = Item.finderItems.where().like("descripcion",item31dw.descripcion).findUnique();
        if(x == null){
            item31dw.save();
        }
        Item item32dw = new Item("Todas las marquillas deben ser instaladas, cable DC, cable de tierras, cable de alarma y cable de transmision, deben ser marquillados a ambos lados es decir del puerto que salen y en el puerto al que entran.",0.5,"","dwdm","7.1.013");
        itemsDWDM.add(item32dw);
        itemsLabelsD.add(item32dw);
        x = Item.finderItems.where().like("descripcion",item32dw.descripcion).findUnique();
        if(x == null){
            item32dw.save();
        }
        Item item33dw = new Item("Las marquillas para sitios outdoor deben tener recubrimiento impermeabilizante o debe ser plastica preferiblemente, todas las marquillas indoor y outdoor deben ser instaladas en la misma forma para facil lectura.",1,"","dwdm","7.1.014");
        itemsDWDM.add(item33dw);
        itemsLabelsD.add(item33dw);
        x = Item.finderItems.where().like("descripcion",item33dw.descripcion).findUnique();
        if(x == null){
            item33dw.save();
        }

    }

    public ArrayList<Item> retornadwdm(String dw){
        if(dw.equals("dw")){
            return itemsHSEd;
        }else if(dw.equals("dw1")){
            return itemsRack;
        }else if(dw.equals("dw2")){
            return itemsEquip;
        }else if(dw.equals("dw3")){
            return itemsCables;
        }else if(dw.equals("dw4")){
            return itemsEnergy;
        }else if(dw.equals("dw5")){
            return itemsCyE;
        }else if(dw.equals("dw6")){
            return itemsLabelsD;
        }
        return null;
    }
    public static DWDM getInstance (){
        if(instance==null ){
            instance = new DWDM();
        }
        return instance;
    }

}