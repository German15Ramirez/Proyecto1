package com.ipc1.constructores;

public class comida {
    // atributos
    String nombre;
    String efecto;

    public comida(String nombre, String efecto) {
        this.nombre = nombre;
        this.efecto = efecto;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return this.efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return  getNombre() + " tiene por efecto " +
                 getEfecto();
    }

}
