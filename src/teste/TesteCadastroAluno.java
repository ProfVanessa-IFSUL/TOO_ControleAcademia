/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.AvaliacaoFisica;
import modelo.Pessoa;

/**
 *
 * @author vanessalagomachado
 */
public class TesteCadastroAluno {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(123, "Joao");
//        System.out.println("Aluno Cadastrado: "+p.mostraInfo());
        //p.nome = "Juka da Silva";
        p.setNome("Joao da Silva");
        //p.matricula = 123;
        
//        System.out.println("Aluno Cadastrado: "+p.mostraInfo());
        
        
        Pessoa p2 = new Pessoa("Vi");
        //p2.nome = "Vivente 02";
        //p2.matricula = 321;
//        p2.setAltura(1.6);
//        p2.setPeso(75);
//        System.out.println("Aluno Cadastrado: "+p2.mostraInfo());
        //System.out.println("IMC: "+p2.calculaIMC());
        
        
        AvaliacaoFisica af = new AvaliacaoFisica();
        af.setAluno(p2);
        
        System.out.println(af.mostraAvaliacao());
        
        
    }
}
