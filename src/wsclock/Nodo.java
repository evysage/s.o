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

    private String s;
    private byte R;
    private byte M;
    private int numeroMarcoPagina;

    private Nodo sig = null;
    private Nodo ant = null;
    private Nodo abj = null;
    private Nodo arr = null;

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
    public Nodo getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    /**
     * @return the abj
     */
    public Nodo getAbj() {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(Nodo abj) {
        this.abj = abj;
    }

    /**
     * @return the arr
     */
    public Nodo getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(Nodo arr) {
        this.arr = arr;
    }

    public String desp() {
        return s;
    }
}
