/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.controle;

/*
 *
 * @author gabriela.sleite
 *
 */

public class Entrada {
    String nome;
    public double valor=0;
    public double valorMaior=0;
    int qtdVendido=1;
    public int res;

    public String getNome() {
        return nome;
    }
    
    public String setNome(String nextLine){
        return this.nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValorMaior() {
        return valorMaior;
    }

    public void setValorMaior(double valorMaior) {
        if(valor>valorMaior){
            this.valorMaior = this.valor;
        }
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    public int getQtdVendido() {
        return qtdVendido;
    }
   
}
