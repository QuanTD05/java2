/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package md19034buoi12;



/**
 *
 * @author Admin
 */
public class MD19034buoi12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run(){
                for (int i = 0; true; i++) {
                    try {
                        System.out.println(i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        }.start();
        new Thread( new Runnable() {
            @Override
             public void run(){
                for (int i = 0; true; i++) {
                    try {
                        System.out.println("threa 2" + i);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
    }).start();
    }
}
    
