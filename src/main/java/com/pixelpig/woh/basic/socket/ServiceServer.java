package com.pixelpig.woh.basic.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create by pixelpig
 * 2019/3/17
 */
public class ServiceServer {

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket();
        //Create socket bind to 8899
        serverSocket.bind(new InetSocketAddress("localhost", 8899));
        while (true) {
            System.out.println("Ready to accept...");
            Socket socket = serverSocket.accept();
            //Biz
            new Thread(new ServiceServerTask(socket)).start();
        }

    }
}
