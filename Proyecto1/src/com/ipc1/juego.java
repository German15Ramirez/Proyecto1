package com.ipc1;
import com.ipc1.modos.*;
import java.util.Scanner;
/**
 * juego
 */
public class juego {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
static int opcionesmenu;
static Scanner scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (opcionesmenu!=5) {
        System.out.println(ANSI_GREEN+"\n\n************SUPER AUTO PETS************\nHope you are having a great 2022 so far!\n"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"Tipea la opcion a la que deseas ingresar"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"1. Modo Arena");
        System.out.println("2. Modo Versus");
        System.out.println("3. Modo Creativo");
        System.out.println("4. Acerca de Nosotros");
        System.out.println("5. Salir"+ANSI_RESET);
        opcionesmenu = scanner.nextInt();
        switch (opcionesmenu) {
            case 1 -> {
                
                modoArena crear = new modoArena();
                crear.metodo1();
                System.out.println(ANSI_GREEN+"\nInicia la pelea entre los animales"+ANSI_RESET);
            }
            case 2 -> {
                System.out.println(ANSI_GREEN+"\nHas seleccionado el Modo Versus\n"+ANSI_RESET);
            }
            case 3 -> {
                System.out.println(ANSI_GREEN+"\nHas seleccionado el Modo Creativo\n"+ANSI_RESET);
            }
            case 4 -> {
                System.out.println(ANSI_BLUE+"\nLucha contra otros jugadores a tu propio ritmo en este juego de batallas automatico gratuito. En Super Auto Pets, construyes un equipo a partir de un adorable elenco de animales que lucharan por ti. Cada uno tiene habilidades unicas, ¡asi que elige sabiamente quien se unira a tu equipo!\n"+ANSI_RESET);
            }
            case 5 -> {
                System.out.println(ANSI_RED + "----USTED HA FINALIZADO LA EJECUCION DEL PROGRAMA----" + ANSI_RESET);
                System.exit(0);
            }
            default->
                        System.out.println(ANSI_RED+"\n*****Opcion invalida*****\nIngrese de nuevo la opcion"+ANSI_RESET);
        }
                
        }
        System.out.println(ANSI_RED + "----USTED HA FINALIZADO LA EJECUCION DEL PROGRAMA----" + ANSI_RESET);
        
    }

}