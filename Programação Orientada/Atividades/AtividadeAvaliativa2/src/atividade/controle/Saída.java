/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.controle;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriela.sleite
 */

public class Saída {
    public static void main(String[] args){
        Entrada c = new Entrada();
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.print("Informe o nome do sanduíche: ");
            c.setNome(s.nextLine());
            System.out.print("Informe o valor do sanduíche: ");
            c.setValor(Double.valueOf(s.nextLine())); 
        
            System.out.print("Deseja comprar outro ou finalizar a compra? (Digite '1' para continuar ou '2' para finalizar.");
            c.setRes(Integer.valueOf(s.nextLine())); 
            
            System.out.print("O sanduíche mais caro custou: R$ "+c.valorMaior);
            System.out.print("Total de sanduíches vendidos: "+c.qtdVendido);
        }while (c.res == 1);
    }
}
