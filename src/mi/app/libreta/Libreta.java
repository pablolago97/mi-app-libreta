/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.app.libreta;

import javax.swing.JOptionPane;

/**
 *Indica 'getters' y 'setters'
 * @author Pablo
 */
public class Libreta {
   
    private final Contacto[] contactos=new Contacto[10];
    private final Grupo[] grupos = new Grupo[10];
    
    
    /**
     * Recive el parametro contacto y lo añade dependiendo del contador
     * @param contacto 
     */
    public void engadir(Contacto contacto){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    
    /**
     * Este añado un contacto desde el TECLADO
     */
    public void engadir(){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                Contacto contacto = new Contacto(JOptionPane.showInputDialog("Nombre:"),JOptionPane.showInputDialog("Apellidos:"));
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    
    /**
     * Recive  los elementos de contacto y mediante un 'for...each' lo recorre y lo imprime
     */
    
    public void listar(){
        String cadena="";
        for(Contacto elemento:contactos){
            if(elemento!=null){
                cadena+=elemento.toString()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    /**
     * Borra un contacto
     */
      public void borrar(){
        boolean notFound = true;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que desea borrar:"));
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    contactos[i]=null;
                    notFound=false;
                    break;
                }
            }
        
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
    }
    
     /**
      * Crea un grupo. Recibe el nombre por teclado y la longitud del array determina su tamaño
      */
    public void crearGrupo(){
        boolean grupoLleno = true;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del grupo");
        Grupo grupo = new Grupo(nombre);
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]==null){
                grupos[i]=grupo;
                grupoLleno=false;
                break;
            }
        }
        if(grupoLleno){
            JOptionPane.showMessageDialog(null, "Límite de grupos alcanzado");
        }
    }
    
    /**
     * Agrega una entidad a un grupo que recoje por teclado
     */
    
    public void agregarAGrupo(){
        boolean contactoEncontrado = false ,grupoEncontrado = false;
        int indiceContactos = 0, indiceGrupos=0;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que quiere guardar en el grupo:"));
        String nombreGrupo = JOptionPane.showInputDialog("Nombre del grupo en el que quiere guardar el contacto:");
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    indiceContactos=i;
                    contactoEncontrado=true;
                    break;
                }
            }
        }
        
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]!=null){
                if(grupos[i].getNombre().equalsIgnoreCase(nombreGrupo)){
                    indiceGrupos=i;
                    grupoEncontrado=true;
                    break;
                }
            }
        }
        
        if(contactoEncontrado && grupoEncontrado){
            contactos[indiceContactos].setGrupo(grupos[indiceGrupos]);
        }
        else{
            JOptionPane.showMessageDialog(null, "Contacto o grupo no encontrado");
        }
    }
}
