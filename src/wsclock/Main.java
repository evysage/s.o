/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclock;

import javax.swing.UnsupportedLookAndFeelException;
import recursos.Mensaje;

/**
 *
 * @author por_s
 */
public class Main {

    public static int tamanioMemoriaRAM = 0;
    public static int tamanioMemoriaVirtual = 0;
    public static int numProcesos = 0;
    public static int tamanioPagina = 0;
    public static int tamanioWS = 0;
    public static int tamanioProcesos[];
    public static Proceso procesos[];

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            VtnPrincipal vtn = new VtnPrincipal();
            vtn.setVisible(true);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Mensaje.error(null, "Error fatal");
        }

    }
}
