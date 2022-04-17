package com.ipc1.modos;
import java.util.Random;

import com.ipc1.constructores.animales;
import com.ipc1.constructores.comida;
import com.ipc1.modos.tienda;
public class IAarena {
    static Random random = new Random();
    static int CantAnimales = 0;
    int compracomida;
    static animales seleccionIA[];
    public static void IAtier1() {
        System.out.println("\nSe estan seleccionando los peleadores por parte de la IA...\n");
        tiers peleadoresIA = new tiers();
        animales[] verJugadoresIA = peleadoresIA.arreglotier1;
        tiposComida comidapeleIA = new tiposComida();
        comida[] verComidaIA = comidapeleIA.tier1comida;
        //Eleccion de personajes
        try {
            do {
               int randomIA;
               randomIA= random.nextInt(8+1);
                if (randomIA<8) {
                    System.out.println("\nEl animal escogido es...");
                    System.out.println(verJugadoresIA[randomIA]);
                    seleccionIA = new animales[]{verJugadoresIA[randomIA]};
                    CantAnimales++;   
                }
            } while (CantAnimales<3);
        } catch (Exception a) {

    }
}
}
