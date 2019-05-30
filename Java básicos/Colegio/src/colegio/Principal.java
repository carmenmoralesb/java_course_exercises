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
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
    /*    Coche micoche = new CocheElectrico("Hyundai", "i30", "2345-KKK");
        Coche sucoche = new CocheMotorExplosion("Renault", "Clio", "4392-GPS", 2);
        System.out.println(micoche);
        System.out.println(sucoche);*/
        Colegio micolegio = new Colegio();
        for(Persona persona : micolegio) {
            System.out.println(persona);
        }
    }
}
