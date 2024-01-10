package com.proyecto1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaDeBanco cuenta= new CuentaDeBanco();
        cuenta.setTitular("Jorge");
        cuenta.setBalance(1000);


        Cajero cajero = new Cajero(cuenta);

        Scanner sc  = new Scanner(System.in);
        System.out.println("Bienvenido" + cuenta.getTitular());

        System.out.println("Que accion quieres tomar?");
        System.out.println("1. Para ver balance");
        System.out.println("2. Para realizar un depósito");
        System.out.println("3. Para retirar dinero");
        System.out.println("4. Para salir de la aplicación");

        while (true){
            int input = sc.nextInt();
            switch (input){
                case 1:
                    cajero.verBalance();
                    System.out.println("Pon otro numero para realizar otra acción");

                    break;
                case 2:
                    System.out.println("Cuanto quieres depositar");
                    double deposito = sc.nextDouble();
                    cajero.depositarDinero(deposito);
                    System.out.println("Pon otro numero para realizar otra acción");
                    break;
                case 3:
                    System.out.println("Cuanto quieres retiras");
                    double retiro = sc.nextDouble();
                    cajero.retiroDinero(retiro);
                    System.out.println("Pon otro numero para realizar otra acción");

                    break;
                case 4:
                    System.out.println("Gracias, adios");
                    System.exit(0);
                default:
                    System.out.println("Accion invalida");
                    System.out.println("Pon otro numero para realizar otra acción");

            }
        }
    }
}
