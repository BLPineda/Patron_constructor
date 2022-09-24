/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Lenín
 */
public class GPS {
 private String ruta;

    public GPS() {
        this.ruta = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPS(String Rutamanual) {
        this.ruta = Rutamanual;
    }

    public String getRoute() {
        return ruta;
    }   
}
