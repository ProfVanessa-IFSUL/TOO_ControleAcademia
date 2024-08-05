/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vanessalagomachado
 */
public class Professor extends Pessoa implements ProtocoloTreino{
    
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

    @Override
    public AvaliacaoFisica gerarAvaliacaoFisica() {
        AvaliacaoFisica af = new AvaliacaoFisica();
        String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
        
        af.setAluno(new Aluno(nome, 123));
        af.setProfessor(this);
        af.setAltura(1.7);
        af.setPeso(70);
        af.mostraAvaliacao();
        
        return af;
        
    }

    @Override
    public void gerarProtocoloTreino() {
        
        System.out.println("Protocolo de treino: "
                + "Análise sob IMC: "+gerarAvaliacaoFisica().calculaIMC());
        
    }
    
    
    
}
