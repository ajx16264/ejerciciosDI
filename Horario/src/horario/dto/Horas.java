/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.dto;

/**
 *
 * @author byZeRo
 */
public class Horas {

    private int dia, hora;
    private String modulo;

    public int getFila() {
        return dia;
    }

    public void setFila(int fila) {
        this.dia = fila;
    }

    public int getColumna() {
        return hora;
    }

    public void setColumna(int columna) {
        this.hora = columna;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String[] horarioArray() {
        String[] horario = new String[3];
        horario[0] = String.valueOf(dia);
        horario[1] = String.valueOf(hora);
        horario[2] = modulo;
        return horario;
    }

    public String horarioString() {
        String horario;
        horario = String.valueOf(dia)+ ";" + String.valueOf(hora)+ ";" + modulo;
        return horario;
    }
    
}
