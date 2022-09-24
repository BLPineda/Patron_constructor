/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Lenín
 */
public class Engine {
    private final double volumen;
    private double kilometraje;
    private boolean encendedor;

    public Engine(double volumen, double kilometraje) {
        this.volumen = volumen;
        this.kilometraje = kilometraje;
    }

    public void encendido() {
        encendedor = true;
    }

    public void apagado() {
        encendedor = false;
    }

    public boolean isEncendedor() {
        return encendedor;
    }

    public void go(double kilometraje) {
        if (encendedor) {
            this.kilometraje += kilometraje;
        } else {
            System.err.println("No puedes arrancar, enciendelo primero");
        }
    }

    public double getVolumen() {
        return volumen;
    }

    public double getKilometraje() {
        return kilometraje;
    }
}
