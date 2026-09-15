package edu.chans.endes;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class ChatRoom {
    private String name;
    // REQUISITO 6: Usamos CopyOnWriteArraySet para evitar errores de concurrencia
    private final Set<ClientHandler> users = new CopyOnWriteArraySet<>();

    public ChatRoom(String name) { this.name = name; }

    public void addUser(ClientHandler user) {
        users.add(user);
        broadcast("sistema", user.getNick() + " ha entrado en " + name);
    }

    public void removeUser(ClientHandler user) {
        if (users.remove(user)) {
            broadcast("sistema", user.getNick() + " ha salido de " + name);
        }
    }

    public void broadcast(String sender, String message) {
        // REQUISITO 4.1: Difunde mensajes solo a los usuarios de esta sala
        String formatted = "[" + name + "] " + sender + ": " + message;
        for (ClientHandler user : users) {
            user.sendMessage(formatted);
        }
    }

    public String getUsersList() {
        return users.stream().map(ClientHandler::getNick).collect(Collectors.joining(", "));
    }
}
