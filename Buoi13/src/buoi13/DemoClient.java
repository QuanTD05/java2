/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi13;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class DemoClient {
    public static void main(String[] args) throws Exception{
        String cauNoi;
        System.out.println("Vui long nhap cau noi");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        cauNoi = input.readLine();
        Socket connect = new Socket("localhost", 6789);
        DataOutputStream outToSever = new DataOutputStream(connect.getOutputStream());
        outToSever.writeBytes( cauNoi + "\n");
        
        BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        System.out.println(inputFromServer.readLine());
    }
}
