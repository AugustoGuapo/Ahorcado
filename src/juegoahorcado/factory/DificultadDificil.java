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
public class DificultadDificil extends Dificultad{

    
     public DificultadDificil(List<String>palabras) {
         super(palabras);
         super.setCantidadPistas(2);
         super.setNroIntentos(4);
     }
}
