package edu.chans.endes;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String nick;
    private ChatRoom currentRoom;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        this.nick = "User_" + socket.getPort(); // Nick por defecto
    }

    @Override
    public void run() {
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // REQUISITO 4.1: Sala por defecto "lobby"
            this.currentRoom = ChatServer.rooms.get("lobby");
            this.currentRoom.addUser(this);

            String input;
            while ((input = in.readLine()) != null) {
                if (input.startsWith("/")) {
                    handleCommand(input);
                } else {
                    currentRoom.broadcast(nick, input);
                }
            }
        } catch (IOException e) {
            System.out.println("Conexión perdida con " + nick);
        } finally {
            closeEverything();
        }
    }

    private void handleCommand(String input) {
        String[] parts = input.split(" ", 2);
        String cmd = parts[0].toLowerCase();

        // REQUISITO 4.3: Implementación de comandos mínimos
        switch (cmd) {
            case "/nick" -> {
                if (parts.length > 1) this.nick = parts[1];
                sendMessage("Sistema: Tu nick es " + nick);
            }
            case "/join" -> {
                if (parts.length > 1) {
                    currentRoom.removeUser(this);
                    currentRoom = ChatServer.rooms.computeIfAbsent(parts[1], ChatRoom::new);
                    currentRoom.addUser(this);
                }
            }
            case "/who" -> sendMessage("Usuarios: " + currentRoom.getUsersList());
            case "/quit" -> closeEverything();
            default -> sendMessage("Error: Comando no reconocido");
        }
    }

    public void sendMessage(String msg) { if (out != null) out.println(msg); }
    public String getNick() { return nick; }

    private void closeEverything() {
        try {
            if (currentRoom != null) currentRoom.removeUser(this);
            if (socket != null) socket.close();
        } catch (IOException e) { e.printStackTrace(); }
    }
}
