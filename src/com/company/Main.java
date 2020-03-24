package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "POSSO IR VER O ALI?");
        System.out.println( "Escreva seu nome");
        User user = new User(reader.readLine());

        if (user.login()) {
            System.out.println( "YES!" );
        }
        else {
            System.out.println( "NO." );
        }
    }
}
