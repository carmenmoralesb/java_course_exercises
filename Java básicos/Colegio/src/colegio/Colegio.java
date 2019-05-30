/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;
import java.util.Date;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author carmenm
 */
public class Colegio implements Iterable<Persona> {
    private Date fecha;
    public Persona[] personas;
    
    public Colegio() {
        fecha = new Date();
        personas = new Persona[3];
        personas[0] = new Profesor("Javier", "Ortega", 54,"2345-KKK","Programación");
        personas[1] = new Alumno("Carmen", "Morales Bonet", 24,"2345-KKK",8);

    }

    @Override
    public Iterator<Persona> iterator() {
        Iterator<Persona> it = new IteratorCoche(personas);
        return it;
    }
}

class IteratorCoche implements Iterator<Persona> {
    protected int contador;
    Persona[] personas;

    public IteratorCoche(Persona[] personas) {
        contador = 0;
        this.personas = personas;
    }
    
    @Override
    public boolean hasNext() {
        if(contador>=personas.length) {
            return false;
        }
        return true;
    }

    @Override
    public Persona next() {
        if(this.hasNext()) {
            return personas[contador++];
        }
        return null;
    }
    
}
