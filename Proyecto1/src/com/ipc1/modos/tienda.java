package com.ipc1.modos;

import com.ipc1.constructores.comida;
import com.ipc1.constructores.animales;
import java.util.Scanner;

public class tienda {
    Scanner scanner = new Scanner(System.in);
    int dineroOro = 10;
    int opciones;
    int CantAnimales = 0;
    int continuar;
    int compracomida;
    animales seleccion[];
    tiers jugadoresRonda = new tiers();
    animales[] verJugadores = jugadoresRonda.arreglotier1;
    public void tiendatier1() {
        System.out.println("Esta sera tu primera compra, ¿que deseas adquirir?");
        System.out.println("\nAnimales de batalla\n");
        tiposComida comida = new tiposComida();
        comida[] verComida = comida.tier1comida;
        for (int i = 0; i < 8; i++) {
            System.out.println(i + "-" + verJugadores[i]);

        }
        System.out.println("\nElige el numeral del animal con el que deseas jugar...\n");
        //Eleccion de personajes
        try {
            do {
                opciones = scanner.nextInt();
                if (opciones<8) {
                    System.out.println("\nHa escogido a ese jugador");
                    System.out.println(verJugadores[opciones]);
                    seleccion = new animales[]{verJugadores[opciones]};
                    CantAnimales++;
                    
                }else{
                    System.out.println("Algo salio mal, intentelo de nuevo");    
                }
            } while (CantAnimales<3);
        } catch (Exception a) {
            System.out.println("Algo salio mal");
            System.exit(0);
 

    }

    
//Compra de comida
System.out.println("\nAdquisicion de comida\n");
for (int i = 0; i < 3; i++) {
    System.out.println(i + "-" + verComida[i]);
        }
        try {
            do {
                System.out.println("\nElija cuales desea adquirir\n");
                opciones = scanner.nextInt();
                if (opciones<3) {
                    if (dineroOro==0) {
                        System.out.println("Ya no cuentas con mas dinero");
                        continuar = 2;
                    }else{
                        compracomida++;
                        System.out.println("\nDesea continuar\n1. Si\n2. No");
                        continuar = scanner.nextInt();
                        dineroOro--;
                        System.out.println("La cantidad de dinero que tiene disponible es "+dineroOro);
                    }
                } else {
                    System.out.println("Algo salio mal, intentelo de nuevo");
                }
            } while (continuar!=2);
        } catch (Exception b) {
            System.out.println("Algo salio mal");
            System.exit(0);
        }
        for (int t = 0; t < 40; t++) {
            if (t%3 ==0) {
                System.out.println("Cargando");
            }else{
                System.out.println(".");
            }
        }
        //entrando a la informacion

    
}

}