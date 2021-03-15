package ht;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class BeadandoKliens {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",2222);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
        String uzenet =timeStamp+":"+"proba";
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println(uzenet);
        pw.flush();
        pw.close();
        s.close();
    }
}
