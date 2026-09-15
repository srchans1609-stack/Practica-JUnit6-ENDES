package edu.chans.endes; // Asegúrate de que el package coincida con tu carpeta

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatServer {
    private static final int PORT = 5000;
    // REQUISITO 4.1: Mapa de salas
    public static final Map<String, ChatRoom> rooms = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        rooms.put("lobby", new ChatRoom("lobby"));
        System.out.println("Servidor iniciado en puerto " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                // REQUISITO 6: Hilo por cliente
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}