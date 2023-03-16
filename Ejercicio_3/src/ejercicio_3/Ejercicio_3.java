/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import Entidades.Electrodomestico;
import Servicios.serviciosLavadora;
import Servicios.serviciosTelevisor;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosLavadora sL = new serviciosLavadora();
        serviciosTelevisor sT = new serviciosTelevisor();
        
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList<>();
        
        System.out.println("Lavadora Samsung");
        electrodomesticos.add(sL.crearLavadora());
        System.out.println("Lavadora Whirlpool");
        electrodomesticos.add(sL.crearLavadora());
        System.out.println("Televisor LG");
        electrodomesticos.add(sT.crearTelevisor());
        System.out.println("Televisor Phillips");
        electrodomesticos.add(sT.crearTelevisor());        
        
        System.out.println("..:: PRECIOS FINALES ::..");
        for(Electrodomestico aux: electrodomesticos){
            aux.precioFinal();
            System.out.println("Precio Final "+aux.getClass().getName().replace("Entidades.", "")+" "+String.format("%.2f",aux.getPrecio())+" USD");
        }
        
    }
    
}
