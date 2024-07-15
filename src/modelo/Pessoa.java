/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author vanessalagomachado
 */
public class Pessoa {
    private int matricula;
    private String nome;
    private Date dataNascimento;
    private String CPF;

    
    
    public Pessoa(int mat, String nome){
        matricula = mat;
        this.nome = nome;
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public String mostraInfo(){
        DecimalFormat formatoNum = new DecimalFormat("0.0#");
                
                
        String txt = "Nome: "+nome;
        txt += "\n Matricula: "+matricula;
        txt += "\n Data Nascimento: "+dataNascimento;
        txt += "\n CPF: "+CPF;
        
//        if(peso != 0 && altura != 0)
//            txt += "\n IMC: "+formatoNum.format(calculaIMC());
        
        return txt;
    }
    
    
    // getter
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }

    
    
    // setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setDataNascimento(Date dataNasc){
        dataNascimento = dataNasc;
    }

//    @Override
//    public String toString() {
//        return nome;
//    }

    
     

}
