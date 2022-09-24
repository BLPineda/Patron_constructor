/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructores;
import Autos.*;
import Componentes.*;
/**
 *
 * @author Lenín
 */
public class Constructor_de_carros implements Constructor {

    private Tipo tipo;
    private int seats;
    private Engine engine;
    private Transmision transmision;
    private Computadora_de_viaje computadora_de_viaje;
    private GPS gps;
    
    @Override
    public void setTipo(Tipo tipo) {
         this.tipo = tipo;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setComputadora_de_viaje(Computadora_de_viaje computadora_de_viaje) {
        this.computadora_de_viaje = computadora_de_viaje;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }
    
    public Auto getResult() {
        return new Auto(tipo, seats, engine, transmision, computadora_de_viaje, gps);
    }
    
}
