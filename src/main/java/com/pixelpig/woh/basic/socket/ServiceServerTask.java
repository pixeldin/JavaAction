package com.pixelpig.woh.basic.socket;

import java.io.*;
import java.net.Socket;

/**
 * Create by pixelpig
 * 2019/3/17
 */
public class ServiceServerTask implements Runnable{
    Socket socket;
    InputStream inputStream = null;
    OutputStream out = null;

    public ServiceServerTask(Socket socket) {
        this.socket = socket;
    }

    //communite with client
    @Override
    public void run() {
        try {
            //get input stream from client
            inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            //阻塞, 直到换行
            String param = bufferedReader.readLine();
            GetDataServiceImpl getDataService = new GetDataServiceImpl();
            String data = getDataService.getData(param);

            //new outstream
            out = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(out);
            pw.println(data);
            pw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                if (inputStream != null) {
                    inputStream.close();
//                }
                out.close();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                socket.close();
                System.out.println("After 5 seconds, close socket from svrTask!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        System.out.printf("Some biz...");
    }
}
