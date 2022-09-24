/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autos;
import Componentes.Engine;
import Componentes.Transmision;
import Componentes.GPS;
import Componentes.Computadora_de_viaje;
/**
 *
 * @author Lenín
 */
public class Auto {
    private Tipo tipo;
    private int seats;
    private Engine engine;
    private Transmision transmision;
    private Computadora_de_viaje computadora_de_viaje;
    private GPS gps;
    private double fuel = 0;

    public Auto(Tipo tipo, int seats, Engine engine, Transmision transmision,
               Computadora_de_viaje computadora_de_viaje, GPS gps) {
        this.tipo = tipo;
        this.seats = seats;
        this.engine = engine;
        this.transmision = transmision;
        this.computadora_de_viaje = computadora_de_viaje;
        if (this.computadora_de_viaje != null) {
            this.computadora_de_viaje.setAuto(this);
        }
        this.gps = gps;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmision getTransmission() {
        return transmision;
    }

    public Computadora_de_viaje getTripComputer() {
        return computadora_de_viaje;
    }

    public GPS getGpsNavigator() {
        return gps;
    }    
}
