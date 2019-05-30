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
public class Alumno extends Persona  {
    private float nota_media;
     
    public Alumno(String nombre, String apellidos, int edad, String dni,int nota_media) {
        super(nombre,apellidos,dni,edad);
        this.nota_media = nota_media;
    }
    
    @Override
    public String toString() {
        return super.toString() + " nota media: " + nota_media;
    }

}
