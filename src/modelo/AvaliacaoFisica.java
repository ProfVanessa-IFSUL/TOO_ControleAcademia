/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vanessalagomachado
 */
public class AvaliacaoFisica {

    private Date data;
    private double peso;
    private double altura;
    private double percGordura;
    private Aluno aluno;
    private Professor professor;
    private SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getData() {
        return data;
    }
    
    public double getPercGordura(){
        return percGordura;
    }
    
    public void setPercGord(double perc){
        percGordura = perc;
    }
    
    
    

    public double calculaIMC() {
        // return peso / (altura * altura);
        return peso / Math.pow(altura, 2);
    }

    public String mostraAvaliacao() {
        DecimalFormat formatoNum = new DecimalFormat("0.0#");

        String txt = "Data Avaliação: " + mascaraData.format(data);
        
        txt += "\n Aluno: "+aluno;
        
        txt += "\n Peso: " + ((peso != 0) ? formatoNum.format(peso) : "Sem info");
        txt += "\n Altura: " + ((altura != 0) ? formatoNum.format(altura) : "Sem info");
        txt += "\n % Gordura: " + ((percGordura != 0) ? formatoNum.format(percGordura) : "Sem info");

        if (peso != 0 && altura != 0) {
            txt += "\n IMC: " + formatoNum.format(calculaIMC());
        }

        return txt;
    }

    public AvaliacaoFisica() {
        data = new Date();
    }

    @Override
    public String toString() {
        return mascaraData.format(data) + " -> "+calculaIMC() + " - Avaliador: "+professor ;
    }

    public Aluno getAluno() {
        return aluno;
    }

     void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    
    

}
