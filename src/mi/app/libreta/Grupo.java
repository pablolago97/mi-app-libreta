/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.app.libreta;

/**
 *Indica 'getters' y 'setters'
 * @author Pablo
 */
public class Grupo {
    
    private String nombre;
    private Contacto[] contactos;
    
    /**
     *
     * @param nombre
     */
    public Grupo(String nombre){
        this.nombre=nombre;
    }

    /**
     *recoger nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *poner nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public Contacto[] getContactos() {
        return contactos;
    }

    /**
     *
     * @param contactos
     */
    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    
}
