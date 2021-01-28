/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclock;

/**
 *
 * @author por_Sa
 */
public class Nodo {

    protected String s, nombre;
    protected int R;
    protected int M;
    protected int tiempo;
    protected int numeroMarcoPagina;
    
    protected Nodo sig;
  

    public Nodo(String nombre,int R, int M, int tiempo) {
      
        this.R = R;
        this.M = M;
        this.tiempo=tiempo;
        this.nombre=nombre;
        sig=this;
    }

    
    
    public Nodo(String s) {
        this.s = s;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }

    /**
     * @return the sig
     */
    public Nodo getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
  

    public String desp() {
        return s;
    }
}
