/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Aluno;
import modelo.AvaliacaoFisica;

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
        a.addAvaliacaoFisica(af);
        System.out.println("Aluno: "+a.mostraInfo());
    }
}
