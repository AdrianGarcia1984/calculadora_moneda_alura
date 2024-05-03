package org.example;

import org.example.services.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        var control = 1;
        Double cantidad;

        System.out.println("***************************");
        System.out.println("bienvenido al conversor de monedas");

        while (control !=7){
            System.out.println("----------menu principal-------------");
            System.out.println("presione la opcion de menu que desee:");
            System.out.println("1. Dolar USD => peso argentino");
            System.out.println("2. peso argentino => dollar USD");
            System.out.println("3. Dolar USD => real brasleño");
            System.out.println("4. real brasileño => dolar USD");
            System.out.println("5. Dolar USD => peso colombiano");
            System.out.println("6. peso colombiano => dolar USD");
            System.out.println("7. salir");
            control = sc.nextInt();
            if (control !=7){
                System.out.println("ingrese el monto a convertir");
                cantidad = sc.nextDouble();

                switch (control){
                    case 1:
                        calculadora.Calcular("USD","ARS" , cantidad);
                        break;

                    case 2:
                        calculadora.Calcular("ARS","USD" , cantidad);
                        break;

                    case 3:
                        calculadora.Calcular("USD","BRL" , cantidad);
                        break;

                    case 4:
                        calculadora.Calcular("BRL","USD" , cantidad);
                        break;

                    case 5:
                        calculadora.Calcular("USD","COP" , cantidad);
                        break;

                    case 6:
                        calculadora.Calcular("COP","USD" , cantidad);
                        break;

                    default:
                        System.out.println("opción incorrecta intente de nuevo");
                }
            }


        }

        System.out.println("Gracias por usar nuestro servicios");
    }
}