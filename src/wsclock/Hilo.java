package wsclock;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hilo extends Thread {

    VtnTablaPaginas p = new VtnTablaPaginas();
    JLabel etiqueta;

    public Hilo(JLabel tiempo) {
        this.etiqueta = tiempo;
    }

    @Override
    public void run() {

        try {
            int x = 0;

            while (p.estado == true) {
                Thread.sleep(1000);

                x++;
                pantalla(x);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private void pantalla(int x) {

        p.segundo++;
        String txt_seg = "";

        txt_seg += p.segundo;
        String pantalla = txt_seg;
        etiqueta.setText(pantalla);
    }

}
