package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a string que deseja inverter: ");
        string = sc.next();

        System.out.println(Inverso(string));

    }

    public static String Inverso(String string){

        String invertida = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            invertida += string.charAt(i);
        }
        return invertida;
    }
}