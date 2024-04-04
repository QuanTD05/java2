/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi13;

import java.net.InetAddress;

/**
 *
 * @author Admin
 */
public class Buoi13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        InetAddress[] ip = InetAddress.getAllByName("google.com");
        for(int i= 0; i<ip.length; i++){
            System.out.println(ip[i].getHostName());
                        System.out.println(ip[i].getHostAddress());

        }
    }
    
}
