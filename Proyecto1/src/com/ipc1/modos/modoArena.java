package com.ipc1.modos;
import com.ipc1.constructores.comida;
import com.ipc1.constructores.animales;
import com.ipc1.modos.tienda;
public class modoArena extends tienda {
    public void metodo1(){
        System.out.println("Has seleccionado el modo arena\n¡Modo arena, enfrentamientos asincronicos, sin temporizador de turno! ¿Puedes obtener 10 victorias?\n\n");
        System.out.println("Escoge a tus jugadores");
    rondasArena escoger = new rondasArena();
    escoger.ronda1();

    boolean ganar = true;

    ////
    }

}
