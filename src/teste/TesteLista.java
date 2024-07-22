/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.ArrayList;

/**
 *
 * @author vanessalagomachado
 */
public class TesteLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        
//        lista.add(10);
        lista.add("Teste");
//        lista.add(true);
        
        System.out.println("Lista: "+lista);
        
        System.out.println("Lista[1]: "+lista.get(1));
        
        lista.remove("Teste");
        System.out.println("Lista: "+lista);
    }
}
