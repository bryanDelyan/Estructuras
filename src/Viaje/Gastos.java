/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viaje;

/**
 *
 * @author Usuario
 */
public class Gastos {
    private int valor ;
    private Tipo tipo;

    public Gastos() {
    }

    public Gastos(int valor, Tipo tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Gasto{" + "valor=" + valor + ", tipo=" + tipo + '}';
    }

 
    
}