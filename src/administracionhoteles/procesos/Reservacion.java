/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracionhoteles.procesos;

import entidades.Huesped;
import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class Reservacion {
    
        
    Scanner input = new Scanner(System.in);
    Huesped huesped;
    entidades.Reservacion reservacion;
    
    private void llenarReservacion(){
        
        huesped = new Huesped();
        reservacion = new entidades.Reservacion();
        
        System.out.println("************BIENVENIDO************");
        
        System.out.println("****Informacion Personal****");
        System.out.println("Llene los siguientes campos con la informacion que se le pide a continuacion");
        
        System.out.print("Nombre: ");
        huesped.setNombres(input.nextLine());
        
        System.out.print("Apellidos: ");
        huesped.setApellidos(input.nextLine());
        
        System.out.print("Edad: ");
        huesped.setEdad(input.nextInt());
        
        System.out.print("Correo: ");
        huesped.setCorreo(input.nextLine());
        
        System.out.print("Telefono: ");
        huesped.setTelefono(input.nextLine());
        
        System.out.print("Numero de identificacion: ");
        huesped.setNoIdentificacion(input.nextLine());
        
        
        System.out.println("****Tipo de servicio a contratar****");
        System.out.println("Que servicio le gustaria tomar?");
        System.out.println("1. Premium");
        System.out.println("1. Standard");
        
        reservacion.setTipoReservacion(input.nextLine());
        
        System.out.print("No. Personas: ");
        reservacion.setNoHuespedes(input.nextInt());
        
        System.out.print("Dias de permanencia en nuestras instalaciones: ");
        reservacion.setEstadia(input.nextInt());
    }
    
    
    
}
