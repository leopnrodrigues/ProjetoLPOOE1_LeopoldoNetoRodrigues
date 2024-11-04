/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author leo
 */
@Entity
@Table(name = "tb_passagem")
public class Passagem implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
//    private DateTime
    private int cabine;
    private Veiculo veiculo;
    private Funcionario funcionario;
    private Motorista motorista;
    private double ValorPago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCabine() {
        return cabine;
    }

    public void setCabine(int cabine) {
        this.cabine = cabine;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public double getValorPago() {
        return ValorPago;
    }

    public void setValorPago(double ValorPago) {
        this.ValorPago = ValorPago;
    }
    
    
}
