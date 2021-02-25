/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author olista94
 */
public class Nodo{
    private int elemento;
    private Nodo siguiente;

    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public int getElemento() {
        return elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }


    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
              
}