package com.ipc1.constructores;

import com.ipc1.modos.tienda;

public class animales {
    //definimos atributos
    String nombre;
    int ataque;
    int vida;
    String tipo;
    //constructores
    public animales(String nombre, int ataque, int vida, String tipo){
        this.nombre=nombre;
        this.ataque=ataque;
        this.vida=vida;
        this.tipo = tipo;
    
    }

/**
 *Parte encargada de mostrar los atributos del objeto
 */

    @Override
    public String toString() {
        return "El animal de nombre " +
            " " + getNombre() + " tiene un ataque de" +
            " " + getAtaque() + " vida de" +
            " " + getVida() + " y es de tipo" +
            " " + getTipo();
    }
   

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
