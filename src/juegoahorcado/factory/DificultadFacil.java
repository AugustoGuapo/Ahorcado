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
public class DificultadFacil extends Dificultad{
    public DificultadFacil(List<String>palabras) {
         super(palabras);
         super.setCantidadPistas(5);
         super.setNroIntentos(10);
     }

}
