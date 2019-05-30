/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author carme
 */
public class Profesor extends Persona {
    private String asignatura;
     
    public Profesor(String nombre, String apellidos, int edad, String dni,String asignatura) {
        super(nombre,apellidos,dni,edad);
        this.asignatura = asignatura;
    }
    
    @Override
    public String toString() {
        return super.toString() + " nota media: " + asignatura;
    }

}

