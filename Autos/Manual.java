/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autos;
import Componentes.*;
/**
 *
 * @author Lenín
 */
public class Manual {
      private Tipo tipo;
    private int seats;
    private Engine engine;
    private Transmision transmision;
    private Computadora_de_viaje computadora_de_viaje;
    private GPS gps;

    public Manual(Tipo tipo, int seats, Engine engine, Transmision transmision,
               Computadora_de_viaje computadora_de_viaje, GPS gps) {
        this.tipo = tipo;
        this.seats = seats;
        this.engine = engine;
        this.transmision = transmision;
        this.computadora_de_viaje = computadora_de_viaje;
    }

    public String print() {
        String info = " ";
        info += "Tipo de auto: " + tipo + "\n";
        info += "Número de asientos: " + seats + "\n";
        info += "Engine: volumen - " + engine.getVolumen() + "; kilometraje - " + engine.getKilometraje() + "\n";
        info += "Transmision: " + transmision + "\n";
        if (this.computadora_de_viaje != null) {
            info += "Computadora de viajes: Funcionando" + "\n";
        } else {
            info += "Computadota de viajes: N/A" + "\n";
        }
        if (this.gps != null) {
            info += "GPS: Funcionando" + "\n";
        } else {
            info += "GPS: N/A" + "\n";
        }
        return info;
    }
}
    