/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author vanessalagomachado
 */
public class Professor extends Pessoa{
    
    private Date dataAdmissao;
    private double salarioHora;
    
    
    public Professor(String nome, double salario) {
        super(nome);
        dataAdmissao = new Date();
        salarioHora = salario;
        
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public void viraMes(Object obj) {
//        
    }
    
    
    
}
