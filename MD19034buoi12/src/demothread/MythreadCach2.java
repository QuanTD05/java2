/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demothread;

/**
 *
 * @author Admin
 */
public class MythreadCach2 implements Runnable{
        @Override
    public void run(){
       for(int i= 0; true; i++){ 
           try{
               System.out.println(i);
               Thread.sleep(1000);
           }catch(InterruptedException e){
               break;
           }
    }
    }
}