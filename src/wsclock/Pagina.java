/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclock;

/**
 *
 * @author Evelyn
 */
public class Pagina {

    private String pagina;
    private int tiempo;
    private boolean m, r;
    private int tamanioPag;

    public Pagina(String pagina, int tiempo, boolean m, boolean r) {
        this.pagina = pagina;
        this.tiempo = tiempo;
        this.m = m;
        this.r = r;
    }

    public Pagina() {
    }

    public Pagina(String pagina, int tiempo, boolean m, boolean r, int tamanioPag) {
        this.pagina = pagina;
        this.tiempo = tiempo;
        this.m = m;
        this.r = r;
        this.tamanioPag = tamanioPag;
    }

    public int getTamanioPag() {
        return tamanioPag;
    }

    public void setTamanioPag(int tamanioPag) {
        this.tamanioPag = tamanioPag;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isM() {
        return m;
    }

    public void setM(boolean m) {
        this.m = m;
    }

    public boolean isR() {
        return r;
    }

    public void setR(boolean r) {
        this.r = r;
    }
}
