/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclock;

/**
 *
 * @author por_s
 */
public class Proceso {
    String nombre="";
    int tamanio;
    boolean ejecutando;
    Pagina []paginas;

    public Proceso(int tamanio, boolean ejecutando, Pagina[] paginas) {
        this.tamanio = tamanio;
        this.ejecutando = ejecutando;
        this.paginas = paginas;
    }

    public Proceso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    public void setEjecutando(boolean ejecutando) {
        this.ejecutando = ejecutando;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }
    
}
