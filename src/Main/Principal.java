package Main;

import Nave.Piloto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPilotos;
        do {
            System.out.println("Cuantos pilotos hay??? (Minimo dos)");
            numPilotos = sc.nextInt();
        }while(numPilotos<2);
        Piloto[] pilotos = new Piloto[numPilotos];
        for (int i = 0; i < numPilotos; i++) {
            pilotos[i] = new Piloto();
        }
        int opcion;
        for (int i = 0; i < numPilotos; i++) {
            do {
                mensajemenu();
                opcion = sc.nextInt();
                while(!(opcion==1||opcion==2||opcion==3)){
                    System.out.println("Tiene que ser 1, 2 o 3");
                    opcion = sc.nextInt();
                }
                switch (opcion){
                    case 1:
                        pilotos[i].getNave().metodo1();
                        break;
                    case 2:
                        pilotos[i].getNave().metodo2();
                        break;
                    case 3:
                        pilotos[i].getNave().metodo3();
                        break;
                }
                System.out.println(pilotos[i].getNave().info());
            }while (!(pilotos[i].getNave().isDestruida()));
        }
        System.out.println("modificacionSamuel");

    }
    public static void mensajemenu(){
        System.out.println("""
                Que quieres hacer?
                1.- Avanzar de base (Consumo 1L)
                2.- Ir a punto de control (Consumo 2L)
                3.- Avanzar entre 1 a 3 bases (Consumo 2L)""");
    }
}
