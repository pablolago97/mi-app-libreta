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
 
public class Contacto {

    /**
     *
     */
    public static int ncontactos=1;
    private int id;
    private String nombre;
    private String apellidos;
    private Grupo grupo;
    
    /**
     * Constructor
     */
    public Contacto(){
        id=ncontactos;
        ncontactos++;
    }
    /**
     * Constructor
     * @param nombre
     * @param apellidos 
     */
    public Contacto(String nombre,String apellidos){
        id=ncontactos;
        this.nombre=nombre;
        this.apellidos=apellidos;
        ncontactos++;
    }

    /**
     *Recoger parametro id
     * @return
     */
    public int getId(){
        return id;
    }
    
    /**
     *Poner parametro id
     * @param id
     * @return
     */
    public int setId(int id){
         return this.id=id;
    }

    /**
     *Recoger parametro ncontactos
     * @return
     */
    public int getNcontactos() {
        return ncontactos;
    }

    /**
     *poner parametro ncontactos
     * @param ncontactos
     */
    public void setNcontactos(int ncontactos) {
        Contacto.ncontactos = ncontactos;
    }

    /**
     *Recoger parametro nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Introducir parametro nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Recoger parametro apellidos
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *Introducir parametro apellidos
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *Recoger parametro grupo
     * @return
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     *Introducir parametro grupo
     * @param grupo
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

    
    
}
