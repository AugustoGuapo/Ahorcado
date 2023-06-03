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
public class DificultadMedio extends Dificultad{
    
    public DificultadMedio(List<String>palabras) {
         super(palabras);
         super.setCantidadPistas(3);
         super.setNroIntentos(7);
     }
}
