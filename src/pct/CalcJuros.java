/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Jucelia
 */
public class CalcJuros {
    public static void main(String[] args) {
        double taxas , juros , capital ,prazo ;
        int op;
        
        // Entrada Gabi
        Scanner entrada = new Scanner(System.in);
        
        // Inicio
        System.out.println("\n\t\t\t Calculadora Cidadão! \n");
        
        // template
        System.out.println(" 1.Capital ");
        System.out.println(" 2.Juros  ");
        System.out.println(" 3.Prazos");
        System.out.println(" 4.Taxas");
        System.out.println(" 5.Menu ");
        System.out.println(" 6.Sair ");
       
        
        System.out.println("\n\t Opção: ");
            op = entrada.nextInt();
            // entrada
            switch (op){ 
                case 1: //
                    //entrada
                    System.out.println("\n\t\t\t -- Calcule o Capital -- \n");
                    System.out.println("Informe a taxa [%]: ");
                    taxas = entrada.nextDouble();
                    System.out.println("Informe o prazo: ");
                    prazo = entrada.nextDouble();
                    System.out.println("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    capital = juros / (taxas / 100 * prazo);
                    //saída
                    System.out.printf("\n Capital [R$ %.2f]", capital);
                    break;
            }
           
        
        
    }
}
