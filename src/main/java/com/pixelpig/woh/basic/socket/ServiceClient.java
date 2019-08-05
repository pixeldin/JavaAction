package com.pixelpig.woh.basic.socket;

import java.io.*;
import java.net.Socket;

/**
 * Create by pixelpig
 * 2019/3/17
 */
public class ServiceClient {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8899);

        //print to server
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println("Date From client: hello");
        printWriter.flush();

        //get from server
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String result = br.readLine();
        System.out.printf("Client: get from server is " + result);

        outputStream.close();
        inputStream.close();
        socket.close();


    }
}
