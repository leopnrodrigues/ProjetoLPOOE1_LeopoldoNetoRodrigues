/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author leo
 */
@Entity
@Table(name = "tb_motorista")
public class Motorista extends Pessoa {
    private Turno turno;
    private int cabine; 

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getCabine() {
        return cabine;
    }

    public void setCabine(int cabine) {
        this.cabine = cabine;
    }
    
    
}
