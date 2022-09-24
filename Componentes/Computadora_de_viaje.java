/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;
import Autos.*;

/**
 *
 * @author Lenín
 */
public class Computadora_de_viaje {
    private Auto auto;

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + auto.getFuel());
    }

    public void showStatus() {
        if (this.auto.getEngine().isEncendedor()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
