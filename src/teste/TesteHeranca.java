/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Aluno;
import modelo.AvaliacaoFisica;
import modelo.Pessoa;
import modelo.Professor;

/**
 *
 * @author vanessalagomachado
 */
public class TesteHeranca {
    public static void main(String[] args) {
        Aluno a = new Aluno("Juka", 123);
        a.setNome("Juka");
        AvaliacaoFisica af = new AvaliacaoFisica();
        af.setAltura(1.7);
        af.setPeso(70);
        af.setProfessor(new Professor("Maria", 210));
        a.addAvaliacaoFisica(af);
        
//        af.setAluno(new Aluno("Gina", 321));
        
        AvaliacaoFisica af2 = new AvaliacaoFisica();
        af2.setPeso(78);
        af2.setAltura(1.7);
        
        a.viraMes(af2);
        System.out.println("Aluno: "+a.mostraInfo());
        
//        Pessoa p = new Pessoa("Teste");
        
        System.out.println("Avaliação Física\n"+af.mostraAvaliacao());
    }
}
