package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        int numFibonacciAtual = 0;
        int valor;

        System.out.println("Descubra se o valor pertence à sequência de Fibonacci.");
        System.out.println("Digite o valor:");
        valor = sc.nextInt();
        sc.close();

        for (int i = 0; numFibonacciAtual <= valor; i++) {
            if (numFibonacciAtual == valor) {
                System.out.println("O valor pertence a sequência de Fibonacci");
                break;
            }
            numFibonacciAtual = Fibonacci(i);
        }
        if(numFibonacciAtual>valor){
            System.out.println("O valor não pertence a sequência de Fibonnaci");
        }
    }

    public static int Fibonacci(int valor) {
        if(valor<=1){
            return valor;
        }else{
            return Fibonacci(valor-1) + Fibonacci(valor-2);
        }
    }
}

