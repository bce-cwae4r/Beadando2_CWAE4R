package ht;

import java.io.IOException;
import java.net.ServerSocket;

public class BeadandóMulti {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2222);
        while (true) {
            new Thread(new BeadandoFuttathato(ss.accept())).start();
        }
    }
}
