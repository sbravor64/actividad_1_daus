package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numVeces;

        System.out.print("Quantes vegades vols llançar els daus? ");
        numVeces = scanner.nextInt();

        int count[]= new int[13];

        int dado1, dado2;

        int dados[] = new int[numVeces];

        for (int i = 0; i < dados.length ; i++) {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            dados[i] = dado1+dado2;
        }

        for (int i = 0; i < count.length ; i++) {
            for (int j = 0; j < dados.length ; j++) {
                if(dados[j]==i){
                    count[i]++;
                }
            }
        }

        for (int i = 2; i < count.length ; i++) {
            System.out.println(i+" --> " + count[i] + " vegades");
        }

    }
}