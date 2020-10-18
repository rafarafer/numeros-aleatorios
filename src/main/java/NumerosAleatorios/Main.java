/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosAleatorios;

import java.util.Random;

/**
 *
 * @author Prof E Sor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        int matriz[] = new int[10];
        int pares = 0;
        int impares = 0;
        
        for (int i = 0 ; i<10 ; i++) {
            System.out.print(i + "-->");
            System.out.println(matriz[i] = r.nextInt(101));
            if (matriz[i] % 2 == 0) 
                pares++;
            else
                impares++;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
    
}
