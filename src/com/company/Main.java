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

        int count2=0,count3=0, count4=0, count5=0, count6=0,
                count7=0,count8=0, count9=0, count10=0, count11=0, count12=0;

        int dado1, dado2;

        int dados[] = new int[numVeces];

        for (int i = 0; i < dados.length ; i++) {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            dados[i] = dado1+dado2;

            if(dados[i]==2){ count2++;
            } else if(dados[i]==3){ count3++;
            } else if(dados[i]==4){ count4++;
            } else if(dados[i]==5){ count5++;
            } else if(dados[i]==6){ count6++;
            } else if(dados[i]==7){ count7++;
            } else if(dados[i]==8){ count8++;
            } else if(dados[i]==9){ count9++;
            } else if(dados[i]==10){ count10++;
            } else if(dados[i]==11){ count11++;
            } else if(dados[i]==12){ count12++;
            }
        }

        System.out.println("2 --> " + count2 + " vegades");
        System.out.println("3 --> " + count3 + " vegades");
        System.out.println("4 --> " + count4 + " vegades");
        System.out.println("5 --> " + count5 + " vegades");
        System.out.println("6 --> " + count6 + " vegades");
        System.out.println("7 --> " + count7 + " vegades");
        System.out.println("8 --> " + count8 + " vegades");
        System.out.println("9 --> " + count9 + " vegades");
        System.out.println("10 --> " + count10 + " vegades");
        System.out.println("11 --> " + count11 + " vegades");
        System.out.println("12 --> " + count12 + " vegades");

    }
}