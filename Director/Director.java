/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Director;
import Autos.*;
import Componentes.*;
import Constructores.*;
/**
 *
 * @author Lenín
 */
public class Director {
    public void constructorDeportivo(Constructor constructor) {
        constructor.setTipo(Tipo.Auto_deportivo);
        constructor.setSeats(2);
        constructor.setEngine(new Engine(3.0, 0));
        constructor.setTransmision(Transmision.SEMI_AUTOMATIC);
        constructor.setComputadora_de_viaje(new Computadora_de_viaje());
        constructor.setGPS(new GPS());
    }

    public void constructorCiudad(Constructor constructor) {
        constructor.setTipo(Tipo.Auto_de_ciudad);
        constructor.setSeats(2);
        constructor.setEngine(new Engine(1.2, 0));
        constructor.setTransmision(Transmision.AUTOMATIC);
        constructor.setComputadora_de_viaje(new Computadora_de_viaje());
        constructor.setGPS(new GPS());
    }

    public void constructorSUV(Constructor constructor) {
        constructor.setTipo(Tipo.SUV);
        constructor.setSeats(4);
        constructor.setEngine(new Engine(2.5, 0));
        constructor.setTransmision(Transmision.MANUAL);
        constructor.setGPS(new GPS());
    }
}
