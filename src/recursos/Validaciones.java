/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 * Clase para llevar a cabo validaciones simples en cajas de texto en un
 * ambiente de pantallas de java
 *
 * @author kevin2
 */
public class Validaciones {

    /**
     * Método que se coloca en el evento KeyType de una caja de texto con el fin
     * de que al precionar un caracter del teclado se verifique si es un número
     * entero, de no ser así lo elimina
     *
     * @param ke Objeto que refiere a la tecla atrapada por el KeyType de una
     * caja de texto de java
     */
    public static void validaEntero(KeyEvent ke) {
        if ((ke.getKeyChar() < '0' || ke.getKeyChar() > '9')
                && ke.getKeyCode() != 8) {
            ke.setKeyChar((char) 8);
        }
    }

    /**
     * Método que se coloca en el evento KeyType de una caja de texto con el fin
     * de que al precionar un caracter del teclado se verifique si es un número
     * con uso de punto flotante, de no ser así lo elimina
     *
     * @param ke Objeto que refiere a la tecla atrapada por el KeyType de una
     * caja de texto de java
     */
    public static void validaFlotantes(KeyEvent ke) {
        if ((ke.getKeyChar() < '0' || ke.getKeyChar() > '9')
                && ke.getKeyCode() != 8 && ke.getKeyChar() != '.') {
            ke.setKeyChar((char) 8);
        }
    }

    /**
     * Método que se coloca en el evento KeyType de una caja de texto con el fin
     * de que al precionar un caracter del teclado se verifique si es un
     * caracter alfabético, de no ser así lo elimina
     *
     * @param ke Objeto que refiere a la tecla atrapada por el KeyType de una
     * caja de texto de java
     */
    public static void validaAlfabeticos(KeyEvent ke) {
        if ((ke.getKeyChar() < 'a' || ke.getKeyChar() > 'z')
                && (ke.getKeyChar() < 'A' || ke.getKeyChar() > 'Z')
                && ke.getKeyCode() != 8 && ke.getKeyChar() != '.'
                && ke.getKeyChar() != ' ' && ke.getKeyChar() != 'ñ'
                && ke.getKeyChar() != 'Ñ' && ke.getKeyChar() != 'á'
                && ke.getKeyChar() != 'Á' && ke.getKeyChar() != 'é'
                && ke.getKeyChar() != 'É' && ke.getKeyChar() != 'í'
                && ke.getKeyChar() != 'Í' && ke.getKeyChar() != 'ó'
                && ke.getKeyChar() != 'Ó' && ke.getKeyChar() != 'ú'
                && ke.getKeyChar() != 'Ú') {
            ke.setKeyChar((char) 8);
        }
    }

    /**
     * Método que se coloca en el evento KeyType de una caja de texto con el fin
     * de que al precionar un caracter del teclado se verifique si es un
     * alfanumérico, de no ser así lo elimina
     *
     * @param ke Objeto que refiere a la tecla atrapada por el KeyType de una
     * caja de texto de java
     */
    public static void validaAlfanumerico(KeyEvent ke) {
        if ((ke.getKeyChar() < 'a' || ke.getKeyChar() > 'z')
                && (ke.getKeyChar() < 'A' || ke.getKeyChar() > 'Z')
                && (ke.getKeyChar() < '0' || ke.getKeyChar() > '9')
                && ke.getKeyCode() != 8 && ke.getKeyChar() != '.'
                && ke.getKeyChar() != ' ' && ke.getKeyChar() != 'ñ'
                && ke.getKeyChar() != 'Ñ' && ke.getKeyChar() != 'á'
                && ke.getKeyChar() != 'Á' && ke.getKeyChar() != 'é'
                && ke.getKeyChar() != 'É' && ke.getKeyChar() != 'í'
                && ke.getKeyChar() != 'Í' && ke.getKeyChar() != 'ó'
                && ke.getKeyChar() != 'Ó' && ke.getKeyChar() != 'ú'
                && ke.getKeyChar() != 'Ú') {
            ke.setKeyChar((char) 8);
        }
    }

    /**
     * Método que se coloca en el evento KeyPress de una caja de texto con el
     * fin de verificar si el contenido de la misma es entero
     *
     * @param jt Caja de texto a evaluar
     * @return verdadero si el contenido de la caja es un entero y false si el
     * contenido de la misma no es un entero
     */
    public static boolean verificaEntero(JTextField jt) {
        try {
            int x = Integer.parseInt(jt.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método que se coloca en el evento KeyPress de una caja de texto con el
     * fin de verificar si el contenido de la misma es un número con punto
     * flotante
     *
     * @param jt Caja de texto a evaluar
     * @return verdadero si el contenido de la caja es un un número con punto
     * flotante y false si el contenido de la misma no lo es
     */
    public static boolean verificaDoble(JTextField jt) {
        try {
            double x = Double.parseDouble(jt.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    

    /**
     * Método que se coloca en el evento KeyPress de una caja de texto con el
     * fin de validar si la tecla presioanada es ENTER siempre y cuando el
     * contenido de la caja de texto sea un entero y cambia a otro objeto
     *
     * @param jf Nombre del frame donde se esta haciendo la acción
     * @param ke Variable evt del método KeyPress
     * @param jt Caja de texto donde se verifica que exista un entero
     * @param obj Objeto al que se desea pasar al momento de dar enter
     */
    public static void enterEntero(JFrame jf, KeyEvent ke,
            JTextField jt, Object obj) {
        if (ke.getKeyChar() == '\n') {
            if (verificaEntero(jt)) {
                CtrlInterfaz.cambia(obj);
            } else {
                Mensaje.error(jf, "Se esperaba un entero");
                CtrlInterfaz.selecciona(jt);
            }

        }
    }
/**
     * Método que se coloca en el evento KeyPress de una caja de texto con el
     * fin de validar si la tecla presioanada es ENTER siempre y cuando el
     * contenido de la caja de texto sea un entero y cambia a otro objeto
     *
     * @param jf Nombre del frame donde se esta haciendo la acción
     * @param ke Variable evt del método KeyPress
     * @param jt Caja de texto donde se verifica que exista un entero
     * @param obj Objeto al que se desea pasar al momento de dar enter
     */
    public static void enterFlotante(JFrame jf, KeyEvent ke,
            JTextField jt, Object obj) {
        if (ke.getKeyChar() == '\n') {
            if (verificaDoble(jt)) {
                CtrlInterfaz.cambia(obj);
            } else {
                Mensaje.error(jf, "Se esperaba un flotante");
                CtrlInterfaz.selecciona(jt);
            }

        }
    }


}
