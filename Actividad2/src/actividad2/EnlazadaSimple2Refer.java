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
public class EnlazadaSimple2Refer {
    private int numElem;
    private Nodo primero;
    private Nodo ultimo;

    public EnlazadaSimple2Refer() {
        this.numElem = 0;
        this.primero = null;
        this.ultimo = null;
    }
    
    public int numElementos(){
        return numElem;
    }
    
    public int contarElemento(int elem) {
        int cont = 0;
        for(Nodo actual=primero; actual!= null; actual = actual.getSiguiente()){
            if (actual.getElemento() == elem){
                cont++;
            }
        }
        return cont;
    }
    
    public boolean esta(int elem){
        Nodo actual = primero;
        
        while(actual != null && actual.getElemento() != elem){
            actual = actual.getSiguiente();
        }
        if(actual == null){
            return false;
        }
        else
            return true;
 
    }
    
    public void insertarPrimero(int elem){
        Nodo nuevo = new Nodo(elem, primero);
        
        if(numElementos() == 0){
            ultimo = nuevo; 
        }
        primero = nuevo;
        numElem++;
        
    }
    
    public void insertarFinal(int elem){
        Nodo nuevo = new Nodo(elem, null);
        
        if(numElementos() == 0){
            primero = nuevo;     
        }
        else{
            ultimo.setSiguiente(nuevo);
            
        }
        ultimo = nuevo;
        numElem++;
    }
     
}
