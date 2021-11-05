/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.logica;

import horario.dto.Horas;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author byZeRo
 */
public class logicaNegocio {
    
    private static List<Horas> lista= new ArrayList<>();
    
    private static void añadirContacto(Horas horario){
        lista.add(horario); 
    }
    
    private static  List<Horas> getLista(){
       return lista; 
    }
    
}
