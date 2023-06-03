/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoahorcado.factory;

import java.util.List;

/**
 *
 * @author Augusto
 */
public abstract class  Dificultad {
    private Integer cantidadPistas;
    private Integer nroIntentos;
    private List<String> palabras;
    
    
    public Dificultad(List<String> palabras) {
        this.palabras = palabras;
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<String> palabras) {
        this.palabras = palabras;
    }

    public Integer getCantidadPistas() {
        return cantidadPistas;
    }

    public void setCantidadPistas(Integer cantidadPistas) {
        this.cantidadPistas = cantidadPistas;
    }

    public Integer getNroIntentos() {
        return nroIntentos;
    }

    public void setNroIntentos(Integer nroIntentos) {
        this.nroIntentos = nroIntentos;
    }      

    
   
}
