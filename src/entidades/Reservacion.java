/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class Reservacion {
    
    private int noHabitacion;
    private String tipoReservacion;
    
    private int noHuespedes;
    private int estadia;

    public Reservacion(int noHabitacion, String tipoReservacion, int noHuespedes, int estadia) {
        this.noHabitacion = noHabitacion;
        this.tipoReservacion = tipoReservacion;
        this.noHuespedes = noHuespedes;
        this.estadia = estadia;
    }
    
    public Reservacion(){
        
    }

    public int getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public String getTipoReservacion() {
        return tipoReservacion;
    }

    public void setTipoReservacion(String tipoReservacion) {
        this.tipoReservacion = tipoReservacion;
    }

    public int getNoHuespedes() {
        return noHuespedes;
    }

    public void setNoHuespedes(int noHuespedes) {
        this.noHuespedes = noHuespedes;
    }

    public int getEstadia() {
        return estadia;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
    }
    
}
