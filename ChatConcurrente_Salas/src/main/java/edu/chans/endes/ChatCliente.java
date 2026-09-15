package edu.chans.endes;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatCliente {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Conectado al chat.");

            // HILO RECEPTOR (Requisito 4.2)
            new Thread(() -> {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    String msg;
                    while ((msg = in.readLine()) != null) System.out.println(msg);
                } catch (IOException e) { System.out.println("Conexión cerrada."); }
            }).start();

            // HILO PRINCIPAL (Envío)
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            while (true) {
                String line = sc.nextLine();
                out.println(line);
                if (line.equals("/quit")) break;
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}