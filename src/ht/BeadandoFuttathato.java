package ht;

import java.io.*;
import java.net.Socket;

public class BeadandoFuttathato implements Runnable{
    private Socket s;

    public BeadandoFuttathato(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String sor = bf.readLine();
            System.out.println(sor);
            PrintWriter pw = new PrintWriter(new FileWriter("output\\b.txt",true));
            pw.println(sor);
            pw.flush();
            pw.close();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
