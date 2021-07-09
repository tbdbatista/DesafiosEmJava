package DesafioDois.Resolucao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// DESAFIO NÃO FOI CONCLUÍDO AINDA

public class MediaModaMediana {
    public static void main(String[] args) {

        int[] lista = {5, 8, 10, 10, 12, 15, 18, 20, 20, 24, 25, 25, 25, 30, 38, 45, 52, 52, 60, 65, 70, 70, 79, 84, 90};
        ;
        System.out.println(median(lista));
        System.out.println(average(lista));

        for (int i = 0; i < lista.length; i++){
            lista[i] = lista[i]*2;
        }

        System.out.println(median(lista));
        System.out.println(average(lista));


    }

    public static int median(int[] elements) {

        List<Integer> listaNumeros = new ArrayList<>();

        for(int elemento : elements){
            listaNumeros.add(elemento);
        }

        Collections.sort(listaNumeros);

        double mediana;
        int verificaPar = listaNumeros.size() % 2;
        System.out.println(verificaPar);

        if (verificaPar == 0){
            mediana = ( listaNumeros.get(((listaNumeros.size() / 2) - 1))
                    + (listaNumeros.get(listaNumeros.size() /2))) / 2;
            System.out.println(listaNumeros.get(
                    ((listaNumeros.size() / 2))));
        }else {
            mediana = listaNumeros.get(listaNumeros.size() / 2);
        }
        return (int)mediana;
    }

    public static int mode(int[] elements) {

        List<Integer> listaNumeros = new ArrayList<>();

        for (int elemento : elements){
            listaNumeros.add(elemento);
        }

        int frequencia = Collections.frequency(listaNumeros, listaNumeros.get(0));
        int numMax = listaNumeros.get(0);
        int numRepeticoes = frequencia;


        for (int elemento : listaNumeros){
            frequencia = Collections.frequency(listaNumeros, elemento);


            if (frequencia > numRepeticoes) {
                numMax = elemento;
                //numRepeticoes = frequencia;


            }

        }
        return numMax;
    }

    public static int average(int[] elements) {
        int soma = 0;
        double media = 0;

        for(int elemento : elements){
            soma += elemento;
            media = soma / elements.length;
        }
        return (int)Math.round(media);
    }

}