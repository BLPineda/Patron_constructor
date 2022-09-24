/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Director;
import Componentes.*;
import Constructores.*;
import Autos.*;
import Director.*;
/**
 *
 * @author Lenín
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director director = new Director();
        
        Constructor_de_carros constructor = new Constructor_de_carros();
        director.constructorDeportivo(constructor);
        
        Auto auto = constructor.getResult();
        System.out.println("Auto construido:\n" + auto.getTipo());
        
        ManualConstructor constructorManuales = new ManualConstructor();
        
        director.constructorDeportivo(constructor);
        
        Manual carManual = constructorManuales.getResult();
        System.out.println("\nAuto construido:\n" + carManual.print());

        
    }
    
}
