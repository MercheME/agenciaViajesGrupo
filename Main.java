package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double viajero1 = 0;
        double viajero2 = 0;
        double viajero3 = 0;
        double viajero4 = 0;
        double viajero5 = 0;

        int opc = 0;

        double gastosTotales = 0;
        int numViajeros = 0;

        double gastoIndividual = 0;

        double dineroPagar1 = 0;
        double dineroRecibir1 = 0;
        double dineroPagar2 = 0;
        double dineroRecibir2 = 0;
        double dineroPagar3 = 0;
        double dineroRecibir3 = 0;
        double dineroPagar4 = 0;
        double dineroRecibir4 = 0;
        double dineroPagar5 = 0;
        double dineroRecibir5 = 0;

        System.out.println("****Bienvenido****");
        System.out.println("Pulsa 1 para comenzar.");
        opc = s.nextInt();


        do {

            switch (opc) {
                case 1:
                    System.out.println("Introduce los gatos de cada viajero: ");
                    System.out.println(" - Gastos del 1 viajero: ");
                    viajero1 = s.nextFloat();
                    System.out.println(" - Gastos del 2 viajero: ");
                    viajero2 = s.nextFloat();

                    System.out.println(" - Gastos del 3 viajero: ");
                    viajero3 = s.nextFloat();

                    System.out.println(" - Gastos del 4 viajero: ");
                    viajero4 = s.nextFloat();

                    System.out.println(" - Gastos del 5 viajero: ");
                    viajero5 = s.nextFloat();


                case 2:
                    if (viajero1 == -1) viajero1 = 0; else numViajeros++;
                    if (viajero2 == -1) viajero2 = 0; else numViajeros++;
                    if (viajero3 == -1) viajero3 = 0; else numViajeros++;
                    if (viajero4 == -1) viajero4 = 0; else numViajeros++;
                    if (viajero5 == -1) viajero5 = 0; else numViajeros++;

                    gastosTotales = viajero1 + viajero2 + viajero3 + viajero4 + viajero5;
                    gastoIndividual = gastosTotales / numViajeros;

                case 3:

                    System.out.println("El número de viajeros es " + numViajeros + " viajeros.");
                    System.out.printf("Los gastos totales son %.2f euros.\n", gastosTotales);
                    System.out.printf("Cada viajero debe de pagar %.2f euros.\n", gastoIndividual);

                    System.out.println("*** Lista de viajeros que pagan/reciben dinero: ***");
                    //Viajero 1
                    if ((viajero1 != 0) && (viajero1 < gastoIndividual)) {
                        System.out.printf("El viajero 1 debe de pagar %.2f euros.\n",(gastoIndividual - viajero1));
                    }else if((viajero1 != 0) && (viajero1 > gastoIndividual)){
                        System.out.printf("El viajero 1 debe de recibir %.2f euros.\n", (viajero1 - gastoIndividual));
                    }
                    //Viajero 2
                    if ((viajero2 != 0) && (viajero2 < gastoIndividual)) {
                        System.out.printf("El viajero 2 debe de pagar %.2f euros.\n",(gastoIndividual - viajero2));
                    }else if((viajero2 != 0) && (viajero2 > gastoIndividual)){
                        System.out.printf("El viajero 2 debe de recibir %.2f euros.\n", (viajero2 - gastoIndividual));
                    }
                    //Viajero 3
                    if ((viajero3 != 0) && (viajero3 < gastoIndividual)) {
                        System.out.printf("El viajero 3 debe de pagar %.2f euros.\n",(gastoIndividual - viajero3));
                    }else if((viajero3 != 0) && (viajero3 > gastoIndividual)){
                        System.out.printf("El viajero 3 debe de recibir %.2f euros.\n", (viajero3 - gastoIndividual));
                    }
                    //Viajero 4
                    if ((viajero4 != 0) && (viajero4 < gastoIndividual)) {
                        System.out.printf("El viajero 4 debe de pagar %.2f euros.\n",(gastoIndividual - viajero4));;
                    }else if((viajero4 != 0) && (viajero4 > gastoIndividual)){
                        System.out.printf("El viajero 4 debe de recibir %.2f euros.\n", (viajero4 - gastoIndividual));
                    }
                    //Viajero 5
                    if ((viajero5 != 0) && (viajero5 < gastoIndividual)) {
                        System.out.printf("El viajero 5 debe de pagar %.2f euros.\n",(gastoIndividual - viajero5));
                    }else if((viajero5 != 0) && (viajero5 > gastoIndividual)){
                        System.out.printf("El viajero 5 debe de recibir %.2f euros.\n", (viajero5 - gastoIndividual));
                    }

                    
                case 4:
                    System.out.println("Pulsa 1 para salir");
                    int salir = s.nextInt();
                    break;
            }
        } while (opc < 1 || opc > 4);
    }
}





