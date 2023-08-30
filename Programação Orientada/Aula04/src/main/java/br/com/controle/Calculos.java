/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author gabriela.sleite
 */
public class Calculos {
    private double valor1;
    private double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public double soma() {
        return this.valor1+this.valor2;
    }
    
    public double sub() {
        return this.valor1-this.valor2;
    }
    
    public double multi() {
        return this.valor1*this.valor2;
    }
    
    public double divi() {
        return this.valor1/this.valor2;
    }
    
    public double porce() {
        return this.valor1%this.valor2;
    }

}