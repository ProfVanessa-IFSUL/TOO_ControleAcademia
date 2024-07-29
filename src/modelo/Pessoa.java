/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vanessalagomachado
 */
public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    private String CPF;

    

    
    
    public Pessoa(String nome){
        this.nome = nome;

    }
    
    public String mostraInfo(){
        DecimalFormat formatoNum = new DecimalFormat("0.0#");
                
                
        String txt = "Nome: "+nome;
        txt += "\n Data Nascimento: "+dataNascimento;
        txt += "\n CPF: "+CPF;
        

        
        return txt;
    }
    
    

    
    
    
    // getter
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

    @Override
    public String toString() {
        return nome+(CPF!=null?": "+getCPF():"");
    }
    
    
// Método abstrado
    public abstract void viraMes(Object obj);
    
     

}
