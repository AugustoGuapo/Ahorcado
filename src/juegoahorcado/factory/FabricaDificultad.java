/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoahorcado.factory;

import static juegoahorcado.utilidad.Constantes.*;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class FabricaDificultad {
    public static Dificultad generarDificultad(String nivel) {
        return switch(nivel) {
            case "Facil" -> new DificultadFacil(List.of(PALABRAS_FACIL));
            case "Dificil" -> new DificultadDificil(List.of(PALABRAS_DIFICIL));
            case "Medio" -> new DificultadMedio(List.of(PALABRAS_MEDIO));
            default -> null;
        };
    }
}
