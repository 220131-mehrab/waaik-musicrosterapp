package com.github.waaik.musicrosterapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
    ServerSocket server;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//runs Roster on the server
public void run(Roster roster){
    while (server.isBound()) {
        try{
            Socket socket = server.accept(); //server accepts request coming in
            //needs an output stream
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //prints results
            out.println("Welcome to the Music Roster App!");
            out.println("Please select a role you are interested in: ");
            out.println("Musician," + "Producer," + "Singer");
            for(String role : roster.roles){

                out.println(role);
            }
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
