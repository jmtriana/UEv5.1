package controllers;


import jdk.nashorn.internal.ir.RuntimeNode;
import play.mvc.Controller;
import models.Item;
import play.mvc.Result;
import views.html.items1;

import javax.print.attribute.standard.RequestingUserName;


public class ItemController extends Controller {

    public Result listado (){

        String it="ok";
        double sc=2;
        Item go = new Item(it,sc,"",null,"");
        return ok();
    }

}
