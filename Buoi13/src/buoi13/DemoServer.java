/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi13;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class DemoServer {
    public static void main(String[] args) throws Exception{
        String chuThuong;
        ServerSocket sever = new ServerSocket(6789);
        while (true) {            
            Socket client = sever.accept();
            BufferedReader clinetIput = new BufferedReader(new InputStreamReader(client.getInputStream()));
            chuThuong = clinetIput.readLine();
            
            DataOutputStream ouToClient = new DataOutputStream(client.getOutputStream());
            ouToClient.writeBytes(chuThuong.toUpperCase() + "\n");
            
        }
    }
}
