package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String login = new String();
        String Maiza = new String();
        Maiza = "Maiza";

        System.out.println( "POSSO IR VER O ALI?");
        
        System.out.println( "Escreva seu nome.");
        login = new String(reader.readLine());
        Maiza = Maiza;
        
        if (login.equals(Maiza)) {
            System.out.println( "YES!");
        }
    }
}
