/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoahorcado.controlador;

import juegoahorcado.factory.FabricaDificultad;
import juegoahorcado.factory.Dificultad;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/**
 *
 * @author Augusto
 */
public class JuegoAhorcado {
    private Dificultad dificultad;
    private String palabraSecreta;
    private String palabraDescubierta;
    private Integer intentosUsados;
    private Integer pistasUsadas;
    private final Function<String, String> ofuscador = s ->
    {String salida="";for (int i = 0; i < s.length(); i++) salida += s.charAt(i) == ' ' ? " ":"*"; return salida;};

    public JuegoAhorcado(String nivel) {
        dificultad = FabricaDificultad.generarDificultad(nivel);
        palabraSecreta = escogerPalabra().toLowerCase();
        palabraDescubierta = ofuscador.apply(palabraSecreta);
    }


    public void iniciarJuego() {
        this.palabraSecreta = escogerPalabra().toLowerCase();
        this.palabraDescubierta = ofuscador.apply(palabraSecreta);
        this.intentosUsados = 0;
        this.pistasUsadas = 0;
    }

    private String escogerPalabra() {
        Random random = new Random();
        List<String> palabras = dificultad.getPalabras();
        return palabras.get(random.nextInt(palabras.size()));
        
    }
    public boolean realizarIntento(char letra) {
        boolean acierto = false;
        StringBuilder nuevaPalabra = new StringBuilder(palabraDescubierta);
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                nuevaPalabra.setCharAt(i, letra);
                acierto = true;
            }
        }
        palabraDescubierta = nuevaPalabra.toString();
        if (!acierto) {
            intentosUsados++;
        }
        return acierto;
    }
    
   public void usarPista() {
        if (pistasUsadas < dificultad.getCantidadPistas() && palabraDescubierta.contains("*")) {
            Random random = new Random();
            List<Integer> indicesVacios = new ArrayList<>();
            for (int i = 0; i < palabraDescubierta.length(); i++) {
                if (palabraDescubierta.charAt(i) == '*') {
                    indicesVacios.add(i);
                }
            }
            if (!indicesVacios.isEmpty()) {
                int indiceAleatorio = indicesVacios.get(random.nextInt(indicesVacios.size()));
                char letra = palabraSecreta.charAt(indiceAleatorio);
                palabraDescubierta = palabraDescubierta.substring(0, indiceAleatorio) + letra + palabraDescubierta.substring(indiceAleatorio + 1);
                pistasUsadas++;
            }
            
        }
    }
   
   public boolean hayPistasDisponibles() {
        return pistasUsadas < dificultad.getCantidadPistas();
    }

    public boolean hayIntentosDisponibles() {
        return intentosUsados < dificultad.getNroIntentos();
    }


    public boolean juegoTerminado() {
        return palabraDescubierta.equals(palabraSecreta) || !hayIntentosDisponibles();
    }
    
    public String getPalabraSecreta() {
       return palabraSecreta;
    }

    public String getPalabraDescubierta() {
        return palabraDescubierta;
    }

    public int getIntentos() {
        return intentosUsados;
    }
    
    public int getPistasRestantes() {
        return dificultad.getCantidadPistas() - pistasUsadas;
    }
    
    public Integer getIntentosRestantes() {
        return dificultad.getNroIntentos() - intentosUsados;
    }
    
}


