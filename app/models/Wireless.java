package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import java.util.ArrayList;

import static play.mvc.Results.ok;

public class Wireless extends Model {
    private static Wireless instance = null;

    public double standar_time_wl=847*(1/60);
    public int fallos_wl=0;
    public ArrayList<Item> itemsWireless;
    public ArrayList<Item> itemsIntalaccionBBU;
    public ArrayList<Item> itemsGeneralHardware;
    public ArrayList<Item> itemsEquipmentPower;
    public ArrayList<Item> itemsGHQuality;
    public ArrayList<Item> itemsGHQStandart;
    public ArrayList<Item> itemsSignalCables;
    public ArrayList<Item> itemsFibersCommon;
    public ArrayList<Item> itemsBSProducts;
    public ArrayList<Item> itemsAntenna;
    public ArrayList<Item> itemsSiteClean;
    public ArrayList<Item> itemsFInspection;
    public ArrayList<Item> itemsHSE;
    public ArrayList<Item> itemsSiteStatus;
    public ArrayList<Item> itemsInternalEquip;
    public ArrayList<Item> itemsPowerandGrounding;
    public ArrayList<Item> itemsFiber;
    public ArrayList<Item> itemsTransmision;
    public ArrayList<Item> itemsTower;
    public ArrayList<Item> itemsLabel;

    public Wireless (){

        itemsWireless = new ArrayList<>();

        //Tabla 1
        itemsIntalaccionBBU = new ArrayList<>();
        itemsGeneralHardware = new ArrayList<>();
        itemsEquipmentPower = new ArrayList<>();
        itemsGHQuality = new ArrayList<>();
        itemsGHQStandart = new ArrayList<>();
        itemsSignalCables = new ArrayList<>();
        itemsFibersCommon = new ArrayList<>();
        itemsBSProducts = new ArrayList<>();
        itemsAntenna = new ArrayList<>();
        itemsSiteClean = new ArrayList<>();
        itemsFInspection = new ArrayList<>();

        //Tabla ISDP
        itemsHSE = new ArrayList<>();
        itemsSiteStatus = new ArrayList<>();
        itemsInternalEquip = new ArrayList<>();
        itemsPowerandGrounding = new ArrayList<>();
        itemsFiber = new ArrayList<>();
        itemsTransmision = new ArrayList<>();
        itemsTower = new ArrayList<>();
        itemsLabel = new ArrayList<>();

        Item x = null;

        //Primera HSE

        Item item0wl = new Item("HSE",0,"","wireless","");
        itemsWireless.add(item0wl);
        itemsHSE.add(item0wl);
        x = Item.finderItems.where().like("descripcion", item0wl.descripcion).findUnique();
        if(x == null){
            item0wl.save();
        }
        Item item1 = new Item("Todas las medidas anticorrosivas y de impermeabilizacion deben ser adoptadas para equipos y racks outdoor, se incluyen conectores, jumper de antenas y equipos de tilt electrico remoto",4.0,"","wireless","1.1.001");
        Item item1wl = new Item(" Toda la documentacion legal como documentos de EPS, ARP, carnet de la empresa y certificado de huawei deben se portado por el cooperador.",1.0, "","wireless", "24.1.061");
        itemsWireless.add(item1wl);
        itemsIntalaccionBBU.add(item1);
        itemsHSE.add(item1wl);
        x = Item.finderItems.where().like("descripcion", item1wl.descripcion).findUnique();
        if(x == null){
            item1wl.save();
        }
        Item item2 = new Item("Las partes de soporte del rack y BBU  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.Todas las partes de aislamineto del rack deben ser instaladas como lo son arandelas o placas de impermeabilización. ",1.5,"","wireless","1.1.003");
        Item item2wl = new Item(" Elementos de seguridad industrial y herramientas adecuadas para la instalacion deben ser llevadas por cada uno de los integrantes de la cuadrilla.",1.0,"","wireless","24.1.062");
        itemsWireless.add(item2wl);
        itemsIntalaccionBBU.add(item2);
        itemsHSE.add(item2wl);
        x = Item.finderItems.where().like("descripcion", item2wl.descripcion).findUnique();
        if(x == null){
            item2wl.save();
        }

        // Final HSE
        // Segundo Estado del Sitio

        Item item3 = new Item("El rack, BBU, RRU y equipos RET  deben ser instalado de acuerdo a la posición indicada en el documento de ingeniería.",0.5,"","wireless","1.1.008");
        Item item3wl = new Item("Estado del Sitio",0,"","wireless","");
        itemsWireless.add(item3wl);
        itemsIntalaccionBBU.add(item3);
        itemsSiteStatus.add(item3wl);
        x = Item.finderItems.where().like("descripcion", item3wl.descripcion).findUnique();
        if(x == null){
            item3wl.save();
        }
        Item item4 = new Item(" Los sobrante de los amarres, tuercas, tornillos y otros elementos  no deben existir dentro, bajo o sobre el rack. ",0.5,"","wireless","1.1.009");
        Item item4wl = new Item("El cuarto de equipos debe estar limpio y organizado, las partes sobrantes deben quedar organizadas registradas y entregadas al cliente.",0.2,"","wireless","19.1.005");
        itemsWireless.add(item4wl);
        itemsIntalaccionBBU.add(item4);
        itemsSiteStatus.add(item4wl);
        x = Item.finderItems.where().like("descripcion", item4wl.descripcion).findUnique();
        if(x == null){
            item4wl.save();
        }
        Item item5 = new Item("Las caras del rack deben estar alineadas con la fila de racks correspondientes.",0.2,"","wireless","1.1.010");
        Item item5wl = new Item("Los sobrante de los amarres, tuercas, tornillos y otros elementos  no deben existir dentro, bajo o sobre el rack.",0.5,"","wireless","1.1.009");
        itemsWireless.add(item5wl);
        itemsIntalaccionBBU.add(item5);
        itemsSiteStatus.add(item5wl);
        x = Item.finderItems.where().like("descripcion", item5wl.descripcion).findUnique();
        if(x == null){
            item5wl.save();
        }

        //Final Estado del sitio
        //Tercero: Equipos internos

        Item item6 = new Item("la manila antiestatica debe ser insertada en el orificio del equipo correspondiente.",0.2,"","wireless","1.1.011");
        Item item6wl = new Item("Equipos internos",0,"","wireless","");
        itemsWireless.add(item6wl);
        itemsIntalaccionBBU.add(item6);
        itemsInternalEquip.add(item6wl);
        x = Item.finderItems.where().like("descripcion", item6wl.descripcion).findUnique();
        if(x == null){
            item6wl.save();
        }
        Item item7 = new Item("todos los paneles falsos del equipo deben ser ubicados en sus slots correspondientes.",0.2,"","wireless","1.1.012");
        Item item7wl = new Item(" Las partes de soporte del rack y BBU  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.Todas las partes de aislamineto del rack deben ser instaladas como lo son arandelas o placas de impermeabilización.",1.5,"","wireless","1.1.003");
        itemsWireless.add(item7wl);
        itemsIntalaccionBBU.add(item7);
        itemsInternalEquip.add(item7wl);
        x = Item.finderItems.where().like("descripcion", item7wl.descripcion).findUnique();
        if(x == null){
            item7wl.save();
        }
        Item item8 = new Item("El rack, BBU and RRU  debe estar sin ningun golpe o daño en su estructura.",1.5,"","wireless","1.1.013");
        Item item8wl = new Item("El rack, BBU,  deben ser instalado de acuerdo a la posición indicada en el documento de ingeniería.", 0.5,"","wireless","1.1.008");
        itemsWireless.add(item8wl);
        itemsIntalaccionBBU.add(item8);
        itemsInternalEquip.add(item8wl);
        x = Item.finderItems.where().like("descripcion", item8wl.descripcion).findUnique();
        if(x == null){
            item8wl.save();
        }
        Item item9 = new Item(" Los puertos de la RRU deben estar apuntado hacia la torre para facilitar el proceso de Operacion y mantenimiento.",2.0,"","wireless","1.1.014");
        Item item9wl = new Item("La manila antiestatica debe ser insertada en el orificio del equipo correspondiente.",0.2, "","wireless","1.1.011");
        itemsWireless.add(item9wl);
        itemsIntalaccionBBU.add(item9);
        itemsInternalEquip.add(item9wl);
        x = Item.finderItems.where().like("descripcion", item9wl.descripcion).findUnique();
        if(x == null){
            item9wl.save();
        }
        Item item10 = new Item("General hardware quality standard  Installation of Terminals and so on",0.0,"","wireless","");
        Item item10wl = new Item(" Todos los paneles falsos del equipo deben ser ubicados en sus slots correspondientes.",0.2,"","wireless","1.1.012");
        itemsWireless.add(item10wl);
        itemsGeneralHardware.add(item10);
        itemsInternalEquip.add(item10wl);
        x = Item.finderItems.where().like("descripcion", item10wl.descripcion).findUnique();
        if(x == null){
            item10wl.save();
        }
        Item item11 = new Item("La instalacion y conexión del cable de alarma debe ser correcta y confiable. ",2.0,"","wireless","2.1.004");
        Item item11wl = new Item("El rack, BBU and RRU  debe estar sin ningun golpe o daño en su estructura.",1.5,"","wireless","1.1.013");
        itemsWireless.add(item11wl);
        itemsGeneralHardware.add(item11);
        itemsInternalEquip.add(item11wl);
        x = Item.finderItems.where().like("descripcion", item11wl.descripcion).findUnique();
        if(x == null){
            item11wl.save();
        }

        //Fin Equipos internos
        //Cuarto: Cables de poder y tierras

        Item item12 = new Item(" La configuracion de la BBU 3900 es realizada correctamente y deacuerdo a los requerimienos de diseño. Debe ser marquillada si el cliente asi lo requiere.",0.5,"","wireless","2.1.016");
        Item item12wl = new Item("Cables de poder y tierras",0.0,"","wireless","");
        itemsWireless.add(item12wl);
        itemsGeneralHardware.add(item12);
        itemsPowerandGrounding.add(item12wl);
        x = Item.finderItems.where().like("descripcion", item12wl.descripcion).findUnique();
        if(x == null){
            item12wl.save();
        }
        Item item13 = new Item("El remanente de cable de DC, cable AC, y tierras debe ser cortado de manera que las conexiones a sus respectivos puntos y el tendido de cable sea realizado sobre los elementos diseñados para este fin (escalerillas, canaletas, corazas, etc.) ",0.5 ,"","wireless","2.1.021");
        Item item13wl = new Item("El remanente de cable de DC, cable AC, y tierras debe ser cortado de manera que las conexiones a sus respectivos puntos y el tendido de cable sea realizado sobre los elementos diseñados para este fin (escalerillas, canaletas, corazas, etc.) ",0.5,"","wireless","2.1.021");
        itemsWireless.add(item13wl);
        itemsGeneralHardware.add(item13);
        itemsPowerandGrounding.add(item13wl);
        x = Item.finderItems.where().like("descripcion", item13wl.descripcion).findUnique();
        if(x == null){
            item13wl.save();
        }
        Item item14 = new Item("Equipment Power and Grounding Cable Common：",0.0,"","wireless","");
        Item item14wl = new Item(" La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente. Debe existir 1 posicion para conexión a tierra cerca al Rack para aterrizar la BBU y 1 para el cable DC de cada RRU instalada. ",4.0,"","wireless","3.1.005");
        itemsWireless.add(item14wl);
        itemsEquipmentPower.add(item14);
        itemsPowerandGrounding.add(item14wl);
        x = Item.finderItems.where().like("descripcion", item14wl.descripcion).findUnique();
        if(x == null){
            item14wl.save();
        }
        Item item15 = new Item(" La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente. Debe existir 1 posicion para conexión a tierra cerca al Rack para aterrizar la BBU y 1 para el cable DC de cada RRU instalada. ",4,"","wireless","3.1.005");
        Item item15wl = new Item("Cables de poder y tierras deben ser conectados correcta y firmemente.",3.0, "","wireless","3.2.004");
        itemsWireless.add(item15wl);
        itemsEquipmentPower.add(item15);
        itemsPowerandGrounding.add(item15wl);
        x = Item.finderItems.where().like("descripcion", item15wl.descripcion).findUnique();
        if(x == null){
            item15wl.save();
        }
        Item item16 = new Item("La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente. Deben existir 4 posiciones para conexión a tierra cerca al Rack.(Conexion del rack, conexion del cable DC de las tres RRU). ",1.0,"","wireless","3.2.050");
        Item item16wl = new Item("Cuando las terminales de cobre son insertadas en las puntas de los cables, ellas deben ser soldadas o ponchadas con la herramienta correcta.",3.0,"","wireless","3.2.005");
        itemsWireless.add(item16wl);
        itemsEquipmentPower.add(item16);
        itemsPowerandGrounding.add(item16wl);
        x = Item.finderItems.where().like("descripcion", item16wl.descripcion).findUnique();
        if(x == null){
            item16wl.save();
        }
        Item item17 = new Item("General hardware quality standard   Power and Grouding",0.0 ,"","wireless","");
        Item item17wl = new Item("La organización del cable de poder y de tierras debe realizarse según el diseño de documento de ingeniería.",0.5,"","wireless","3.2.025");
        itemsWireless.add(item17wl);
        itemsGHQuality.add(item17);
        itemsPowerandGrounding.add(item17wl);
        x = Item.finderItems.where().like("descripcion", item17wl.descripcion).findUnique();
        if(x == null){
            item17wl.save();
        }
        Item item18 = new Item("Cables de poder y tierras deben ser conectados correcta y firmemente.",3 ,"","wireless","3.2.004");
        Item item18wl = new Item("No debe existir cable de cobre desnudo en las terminales de poder y de tierra, estas deben estar protegidas con termoencogible en cada una de las terminales.",0.5,"","wireless","3.2.026");
        itemsWireless.add(item18wl);
        itemsGHQuality.add(item18);
        itemsPowerandGrounding.add(item18wl);
        x = Item.finderItems.where().like("descripcion", item18wl.descripcion).findUnique();
        if(x == null){
            item18wl.save();
        }
        Item item19 = new Item("Cuando las terminales de cobre son insertadas en las puntas de los cables, ellas deben ser soldadas o ponchadas con la herramienta correcta.",3.0 , "","wireless","3.2.005");
        Item item19wl = new Item("Los cables de poder, transmision y feeder no se deben cruzar entre si ni con cables existentes. El tendido debe realizarse segun los requerimientos de diseño. Si son figurados en paralelo, debe existir como minimo 3 cm de espaciamiento entre ellos.",0.5,"","wireless","3.2.044");
        itemsWireless.add(item19wl);
        itemsGHQuality.add(item19);
        itemsPowerandGrounding.add(item19wl);
        x = Item.finderItems.where().like("descripcion", item19wl.descripcion).findUnique();
        if(x == null){
            item19wl.save();
        }

        //Fin Cables de poder
        // Quinto: Fibra Optica

        Item item20 = new Item("Los cables de poder y de tierra deben ser fabricados sin ningun tipo de empalme o conexión.",1.0,"","wireless","3.2.017");
        Item item20wl = new Item("Fibra Optica",0.0,"","wireless","");
        itemsWireless.add(item20wl);
        itemsGHQuality.add(item20);
        itemsFiber.add(item20wl);
        x = Item.finderItems.where().like("descripcion", item20wl.descripcion).findUnique();
        if(x == null){
            item20wl.save();
        }
        Item item21 = new Item("El cable de señal debe ser tendido separadamente del cable de poder.",1.0 ,"","wireless","3.2.019");
        Item item21wl = new Item("Los conectores de fibra que no son usados al igual que los puertos en el equipo deben ser protegidos con sus respectivos protectores.",0.3,"","wireless","4.1.020");
        itemsWireless.add(item21wl);
        itemsGHQuality.add(item21);
        itemsFiber.add(item21wl);
        x = Item.finderItems.where().like("descripcion", item21wl.descripcion).findUnique();
        if(x == null){
            item21wl.save();
        }
        Item item22 = new Item(" Todos los equipos que cuenten con chasis metálico deben ser conectados a la tierra del sitio.",1.0 ,"","wireless","3.2.020");
        Item item22wl = new Item("La fibra optica debe ser protegida por espiral plastica al interior del rack y amarrada con velcro.",0.5,"","wireless","5.1.009");
        itemsWireless.add(item22wl);
        itemsGHQuality.add(item2);
        itemsFiber.add(item22wl);
        x = Item.finderItems.where().like("descripcion", item22wl.descripcion).findUnique();
        if(x == null){
            item22wl.save();
        }
        Item item23 = new Item("Los cables de poder y tierra deben ser marquillados según formato estándar acordado.",1.0 ,"","wireless","3.2.022");
        Item item23wl = new Item("La instalacion de cables de forma horizontal debe ser realizada sobre las respectivas barras para organizacion de cable, si el cable es tendido verticalmente se debe realizar por las paredes del rack.",0.5,"","wireless","8.1.009");
        itemsWireless.add(item23wl);
        itemsGHQuality.add(item23);
        itemsFiber.add(item23wl);
        x = Item.finderItems.where().like("descripcion", item23wl.descripcion).findUnique();
        if(x == null){
            item23wl.save();
        }

        // Fin Fibra
        // Sexto: Transmision y alarmas

        Item item24 = new Item(" La organización del cable de poder y de tierras debe realizarse según el diseño de documento de ingeniería.",0.5 ,"","wireless","3.2.025");
        Item item24wl = new Item("Transmisión y alarmas",0.0,"","wireless","");
        itemsWireless.add(item24wl);
        itemsGHQuality.add(item24);
        itemsTransmision.add(item24wl);
        x = Item.finderItems.where().like("descripcion", item24wl.descripcion).findUnique();
        if(x == null){
            item24wl.save();
        }
        Item item25 = new Item("No debe existir cable de cobre desnudo en las terminales de poder y de tierra, estas deben estar protegidas con termoencogible en cada una de las terminales.",0.5,"","wireless","3.2.026");
        Item item25wl = new Item("La instalacion y conexión del cable de alarma debe ser correcta y confiable.",2.0,"","wireless","2.1.004");
        itemsWireless.add(item25wl);
        itemsGHQuality.add(item25);
        itemsTransmision.add(item25wl);
        x = Item.finderItems.where().like("descripcion", item25wl.descripcion).findUnique();
        if(x == null){
            item25wl.save();
        }
        Item item26 = new Item("General hardware quality standard   Base Station",0.0 ,"","wireless","");
        Item item26wl = new Item(" Cada cable de señal E1, UTP, JUMPERS, deben ser realizados con las herramientas adecuadas y haber pasado las pruebas de continuidad.",2.0,"","wireless","4.1.004");
        itemsWireless.add(item26wl);
        itemsGHQStandart.add(item26);
        itemsTransmision.add(item26wl);
        x = Item.finderItems.where().like("descripcion", item26wl.descripcion).findUnique();
        if(x == null){
            item26wl.save();
        }
        Item item27 = new Item("los cables de poder, transmision y feeder no se deben cruzar entre si ni con cables existentes. El tendido debe realizarse segun los requerimientos de diseño. Si son figurados en paralelo, debe existir como minimo 3 cm de espaciamiento entre ellos",0.5,"","wireless","3.2.044");
        Item item27wl = new Item(" No existe daño o ruptura en el conector del cable de señal.",2.0,"","wireless","4.1.001");
        itemsWireless.add(item27wl);
        itemsGHQStandart.add(item27);
        itemsTransmision.add(item27wl);
        x = Item.finderItems.where().like("descripcion", item27wl.descripcion).findUnique();
        if(x == null){
            item27wl.save();
        }
        Item item28 = new Item("El cable de AC , DC,transmisión, alarmas y fibra optica deben ser protegidos por coraza americana desde que sale del rack hasta que llega al punto de conexión. Las corazas deben contar con terminales de conexion y acople en cada una de sus lados. Aplica para sitios donde los recorridos de cable son outdoor.",1.0 ,"","wireless","3.2.049");
        Item item28wl = new Item("La forma y organización del cable dentro del rack debe ser correcta y como se especifico en el documento de diseño del sitio.",0.5,"","wireless","4.1.009");
        itemsWireless.add(item28wl);
        itemsGHQStandart.add(item28);
        itemsTransmision.add(item28wl);
        x = Item.finderItems.where().like("descripcion", item28wl.descripcion).findUnique();
        if(x == null){
            item28wl.save();
        }

        // Fin transmision y alarmas
        // Septimo: Sectores en torre

        Item item29 = new Item("Signal Cables",0.0,"","wireless","");
        Item item29wl = new Item("Sectores en torre (Generales)",0.0,"","wireless","");
        itemsWireless.add(item29wl);
        itemsSignalCables.add(item29);
        itemsTower.add(item29wl);
        x = Item.finderItems.where().like("descripcion", item29wl.descripcion).findUnique();
        if(x == null){
            item29wl.save();
        }
        Item item30 = new Item("No existe daño o ruptura en el conector del cable de señal.",2.0,"","wireless","4.1.001");
        Item item30wl = new Item("Todas las medidas anticorrosivas y de impermeabilizacion deben ser adoptadas para equipos y racks outdoor, se incluyen conectores, jumper de antenas y equipos de tilt electrico remoto.",4,"","wireless","1.1.001");
        itemsWireless.add(item30wl);
        itemsSignalCables.add(item30);
        itemsTower.add(item30wl);
        x = Item.finderItems.where().like("descripcion", item30wl.descripcion).findUnique();
        if(x == null){
            item30wl.save();
        }
        Item item31 = new Item("Cada cable de señal E1, UTP, JUMPERS, deben ser realizados con las herramientas adecuadas y haber pasado las pruebas de continuidad",2.0,"","wireless","4.1.004");
        Item item31wl = new Item("Los puertos de la RRU deben estar apuntado hacia la torre para facilitar el proceso de Operacion y mantenimiento.",2.0,"","wireless","1.1.014");
        itemsWireless.add(item31wl);
        itemsSignalCables.add(item31);
        itemsTower.add(item31wl);
        x = Item.finderItems.where().like("descripcion", item31wl.descripcion).findUnique();
        if(x == null){
            item31wl.save();
        }
        Item item32 = new Item("Para todos los tipos de conectores para cable, deben estar limpios antes de la instalación. Deben ser limpiados de acuerdo a los manuales de instalación del conector.",2.0,"","wireless","4.1.006");
        Item item32wl = new Item("El cable de señal debe ser tendido separadamente del cable de poder.",1.0,"","wirelss","3.2.019");
        itemsWireless.add(item32wl);
        itemsSignalCables.add(item32);
        itemsTower.add(item32wl);
        x = Item.finderItems.where().like("descripcion", item32wl.descripcion).findUnique();
        if(x == null){
            item32wl.save();
        }
        Item item33 = new Item("La forma y organización del cable dentro del rack debe ser correcta y como se especifico en el documento de diseño del sitio.  ",0.5,"","wireless","4.1.009");
        Item item33wl = new Item("Todos los equipos que cuenten con chasis metálico deben ser conectados a la tierra del sitio.",1.0,"","wireless","3.2.020");
        itemsWireless.add(item33wl);
        itemsSignalCables.add(item33);
        itemsTower.add(item33wl);
        x = Item.finderItems.where().like("descripcion", item33wl.descripcion).findUnique();
        if(x == null){
            item33wl.save();
        }
        Item item34 = new Item(" cuando los cables de señal deban ser doblados, esta curva debe ser suave, se debe tener cuidado con las esquinas y bordes de elementos de la instalación que pueden lastimar el cable de alguna forma.",0.5,"","wireless","4.1.011");
        Item item34wl = new Item("El cable de AC , DC,transmisión, alarmas y fibra optica deben ser protegidos por coraza americana desde que sale del rack hasta que llega al punto de conexión. Las corazas deben contar con terminales de conexion y acople en cada una de sus lados. Aplica para sitios donde los recorridos de cable son outdoor.",1.0,"","wireless","3.2.049");
        itemsWireless.add(item34wl);
        itemsSignalCables.add(item34);
        itemsTower.add(item34wl);
        x = Item.finderItems.where().like("descripcion", item34wl.descripcion).findUnique();
        if(x == null){
            item34wl.save();
        }
        Item item35 = new Item("El cableado debe ser amarrado de forma uniforme y por capas, el amarrado debe ser limpio y los amarres deben asegurar hacia un mismo lado. los cortes de sobrante del amarre no deben tener puntas o filos que puedan afectar elementos de la instalación o a los mismos instaladores.",0.5,"","wireless","4.1.014");
        Item item35wl = new Item("cuando los cables de señal deban ser doblados, esta curva debe ser suave, se debe tener cuidado con las esquinas y bordes de elementos de la instalación que pueden lastimar el cable de alguna forma.",0.5,"","wireless","4.1.011");
        itemsWireless.add(item35wl);
        itemsSignalCables.add(item35);
        itemsTower.add(item35wl);
        x = Item.finderItems.where().like("descripcion", item35wl.descripcion).findUnique();
        if(x == null){
            item35wl.save();
        }
        Item item36 = new Item(" Los conectores de fibra que no son usados al igual que los puertos en el equipo deben ser protegidos con sus respectivos protectores.",0.3,"","wireless","4.1.020");
        Item item36wl = new Item("El radio de doblado de un cable coaxial no debe ser menor a 4 cm de diametro.",0.2,"","wireless","4.1.022");
        itemsWireless.add(item36wl);
        itemsSignalCables.add(item36);
        itemsTower.add(item36wl);
        x = Item.finderItems.where().like("descripcion", item36wl.descripcion).findUnique();
        if(x == null){
            item36wl.save();
        }
        Item item37 = new Item(" El radio de doblado de un cable coaxial no debe ser menor a 4 cm de diametro.",0.2, "","wireless","4.1.022");
        Item item37wl = new Item("El cable debe doblarse formando una curva o gota despues de que este salga del rack, cambie de direccion de horizontal a vertical y despues de conectarse a la antena.",2.0,"","wireless","4.1.026");
        itemsWireless.add(item37wl);
        itemsSignalCables.add(item37);
        itemsTower.add(item37wl);
        x = Item.finderItems.where().like("descripcion", item37wl.descripcion).findUnique();
        if(x == null){
            item37wl.save();
        }
        Item item38 = new Item("Los cortes de la chaqueta que se realicen del lado del MDF o DDF, deben estar cubiertos con termoencogible.",0.2,"","wireless","4.1.023");
        Item item38wl = new Item(" El remanente de fibra optica debe ser organizado sobre la escalerilla horizontal justo despues de la salida del rack  3 rollos de cable de fibra deben ser realizados por sector uno despues de otro, debidamente marcados con cinta de colores y con un diametro no menor a 15 cm.",0.5,"","wireless","5.1.010");
        itemsWireless.add(item38wl);
        itemsSignalCables.add(item38);
        itemsTower.add(item38wl);
        x = Item.finderItems.where().like("descripcion", item38wl.descripcion).findUnique();
        if(x == null){
            item38wl.save();
        }
        Item item39 = new Item("El cable debe doblarse formando una curva o gota despues de que este salga del rack, cambie de direccion de horizontal a vertical y despues de conectarse a la antena.",2.0,"","wireless","4.1.023");
        Item item39wl = new Item("Las medidas de impermeabilizacion deben ser aplicados sobre conectores que no se van a usar como los que si se usaran. Las conexiones a las antenas, RRU, terminales de coraza americana, conector de DC del lado de la RRU si lo requiere, debe contar con la debida impermeabilización.",1.0,"","wireless","8.1.006");
        itemsWireless.add(item39wl);
        itemsSignalCables.add(item39);
        itemsTower.add(item39wl);
        x = Item.finderItems.where().like("descripcion", item39wl.descripcion).findUnique();
        if(x == null){
            item39wl.save();
        }
        Item item40 = new Item("Fibers: Common",0.0,"","wireless","");
        Item item40wl = new Item("La conexión entre el soporte de la antena y la torre debe ser confiable y firme. El soporte de la RRU debe ser confiable y firme y se debe posicionar según lo requiera el survey back to back, instalación en línea o instalación de la RRU independiente.",3.0,"","wireless","9.1.007");
        itemsWireless.add(item40wl);
        itemsFibersCommon.add(item40);
        itemsTower.add(item40wl);
        x = Item.finderItems.where().like("descripcion", item40wl.descripcion).findUnique();
        if(x == null){
            item40wl.save();
        }
        Item item41 = new Item("La fibra optica debe ser protegida por espiral plastica al interior del rack y amarrada con velcro.",0.5,"","wireless","5.1.009");
        Item item41wl = new Item("Los conectores de RF deben ser realizados correctamente y siguiendo el proceso de fabricación, de manera que el VSWR sea normal para la operción del sistema.",2.0, "","wireless","9.1.008");
        itemsWireless.add(item41wl);
        itemsFibersCommon.add(item41);
        itemsTower.add(item41wl);
        x = Item.finderItems.where().like("descripcion", item41wl.descripcion).findUnique();
        if(x == null){
            item41wl.save();
        }
        Item item42 = new Item("El remanente de fibra optica debe ser organizado sobre la escalerilla horizontal justo despues de la salida del rack  3 rollos de cable de fibra deben ser realizados por sector uno despues de otro, debidamente marcados con cinta de colores y con un diametro no menor a 15 cm.",0.5,"","wireless","5.1.009");
        Item item42wl = new Item("Los azimuth de las antenas debe ser el requerido en el estudio de sitio. El de dirección tendra un error tolerable de ± 5 y el de angulo vertical ± 0.5.",1.0,"","wireless","9.1.012");
        itemsWireless.add(item42wl);
        itemsFibersCommon.add(item42);
        itemsTower.add(item42wl);
        x = Item.finderItems.where().like("descripcion", item42wl.descripcion).findUnique();
        if(x == null){
            item42wl.save();
        }

        // Fin Sectores
        // Octavo: Marquillas

        Item item43 = new Item("La resistencia entre el punto de tierra del equipo instalado debe ser menor o igual a ≤5Ω",6.0,"","wireless","6.1.007");
        Item item43wl = new Item("Marquillas",0,"","wireless","");
        itemsWireless.add(item43wl);
        itemsFibersCommon.add(item43);
        itemsLabel.add(item43wl);
        x = Item.finderItems.where().like("descripcion", item43wl.descripcion).findUnique();
        if(x == null){
            item43wl.save();
        }
        Item item44 = new Item(" Todas las marquillas del nodo deben ser instaladas, fibra optica, cable DC, cable de tierras, antenas, cable de alarma, cable de transmision, cable coaxial (jumpers) deben ser marquillados a ambos lados es decir del puerto que salen y en el puerto al que entran.  ",0.5,"","wireless","7.1.013");
        Item item44wl = new Item("La configuracion de la BBU 3900 es realizada correctamente y deacuerdo a los requerimienos de diseño. Debe ser marquillada si el cliente asi lo requiere.",0.5,"","wireless","2.1.016");
        itemsWireless.add(item44wl);
        itemsFibersCommon.add(item44);
        itemsLabel.add(item44wl);
        x = Item.finderItems.where().like("descripcion", item44wl.descripcion).findUnique();
        if(x == null){
            item44wl.save();
        }
        Item item45 = new Item("Las marquillas para sitios outdoor deben tener recubrimiento impermeabilizante o debe ser plastica preferiblemente, todas las marquillas indoor y outdoor deben ser instaladas en la misma forma para facil lectura.",1.0,"","wireless","7.1.014");
        Item item45wl = new Item("Los cables de poder y tierra deben ser marquillados según formato estándar acordado.",1,"","wireless","3.2.022");
        itemsWireless.add(item45wl);
        itemsFibersCommon.add(item45);
        itemsLabel.add(item45wl);
        x = Item.finderItems.where().like("descripcion", item45wl.descripcion).findUnique();
        if(x == null){
            item45wl.save();
        }
        Item item46 = new Item("Base station product installation of rack",0.0,"","wireless","");
        Item item46wl = new Item("Todas las marquillas del nodo deben ser instaladas, fibra optica, cable DC, cable de tierras, antenas, cable de alarma, cable de transmision, cable coaxial (jumpers) deben ser marquillados a ambos lados es decir del puerto que salen y en el puerto al que entran.  ",0.5,"","wireless","7.1.013");
        itemsWireless.add(item46wl);
        itemsBSProducts.add(item46);
        itemsLabel.add(item46wl);
        x = Item.finderItems.where().like("descripcion", item46wl.descripcion).findUnique();
        if(x == null){
            item46wl.save();
        }
        Item item47 = new Item("La configuracion de los DIP switches y puentes deben ser correctamente ubicados.",1.0,"","wireless","8.1.002");
        Item item47wl = new Item("Las marquillas para sitios outdoor deben tener recubrimiento impermeabilizante o debe ser plastica preferiblemente, todas las marquillas indoor y outdoor deben ser instaladas en la misma forma para facil lectura.",1,"","wireless","7.1.014");
        itemsWireless.add(item47wl);
        itemsBSProducts.add(item47);
        itemsLabel.add(item47wl);
        x = Item.finderItems.where().like("descripcion", item47wl.descripcion).findUnique();
        if(x == null){
            item47wl.save();
        }
        // Fin Marquillas
    }


   public ArrayList<Item> tomaItems(String wla) {
        if (wla.equals("inst")) {
            return itemsHSE;
        }
        else if (wla.equals("inst2")) {
            return itemsSiteStatus;
        }
        else if (wla.equals("inst3")) {
            return itemsInternalEquip;
        }
        else if (wla.equals("inst4")) {
            return itemsPowerandGrounding;
        }
        else if (wla.equals("inst5")) {
            return itemsFiber;
        }
        else if (wla.equals("inst6")) {
            return itemsTransmision;
        }
        else if (wla.equals("inst7")) {
            return itemsTower;
        }
        else if (wla.equals("inst8")) {
            return itemsLabel;
        }

        return null;
    }
    public static Wireless getInstance (){
        if(instance==null ){
            instance = new Wireless();
        }
        return instance;
    }
}