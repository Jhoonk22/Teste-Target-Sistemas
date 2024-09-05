package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.models.FaturamentoDia;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        var gson = new Gson();
        var faturamentoDiaType = new TypeToken<List<FaturamentoDia>>() {}.getType();
        int numeroDias = 0;
        int diasAcimaMedia = 0;
        double soma = 0.0;
        double maiorValor = Double.NEGATIVE_INFINITY;
        double menorValor = Double.POSITIVE_INFINITY;
        double media;
        String Faturamentomensal = "src/main/java/org/example/dados.json";

        var fileReader = new FileReader(Faturamentomensal);

        List<FaturamentoDia> lista = gson.fromJson(fileReader, faturamentoDiaType);

        for (FaturamentoDia faturamentoDia : lista) {
            maiorValor = Double.NEGATIVE_INFINITY;

            soma += faturamentoDia.getValor();

            if (faturamentoDia.getValor() > maiorValor) {
                maiorValor = faturamentoDia.getValor();
            }
            if (faturamentoDia.getValor() < menorValor && faturamentoDia.getValor() > 0) {
                menorValor = faturamentoDia.getValor();
            }
            if(faturamentoDia.getValor()>0){
                numeroDias++;
            }
        }

        System.out.println("O maior valor foi: " + maiorValor);
        System.out.println("O menor valor foi: " + menorValor);

        media = soma/numeroDias;

        for (FaturamentoDia faturamentoDia : lista) {
            if (faturamentoDia.getValor() > media) {
                diasAcimaMedia++;
            }
        }
        
        System.out.println("O numero de dias em que a media de faturamento mensal foi" +
                " superado foi de "+ diasAcimaMedia + " dias");
    }
}