package com.github.waaik.musicrosterapp;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class MusicRoster {
        public static void main(String[] args) {



                String filename = args[0];
                Roster roster = new Roster(filename);
                Server server = new Server(8080); ///gets program on browser
                server.run(roster); //runs the Roster on the server
        }
}