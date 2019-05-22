/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JMenu;


public class Reloj extends Thread{
    private JMenu lblreloj;
    private boolean go=true;
    
    public Reloj(javax.swing.JMenu lblreloj){
        this.lblreloj=lblreloj;
    }
    public void run(){
       while(go){
       Date hoy=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
       lblreloj.setText(sdf.format(hoy));
       try{sleep(500);}catch(Exception ex){}
    }
   }
    public void cerrar()
    {
        go=false;
    }
}