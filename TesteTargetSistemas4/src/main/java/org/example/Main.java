package org.example;

public class Main {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double soma = sp + rj + mg + es + outros;

        System.out.printf("O percentual da contribuição do estado de São Paulo é:  %.2f%%\n", (sp / soma)*100);
        System.out.printf("O percentual da contribuição do estado de Rio de Janeiro é: %.2f%%\n", (rj / soma) * 100);
        System.out.printf("O percentual da contribuição do estado de Minas Gerais é: %.2f%%\n", (mg / soma) * 100);
        System.out.printf("O percentual da contribuição do estado de Espirito Santo é: %.2f%%\n", (es / soma) * 100);
        System.out.printf("O percentual da contribuição dos outros estados é: %.2f%%", (outros / soma) * 100);

    }
}