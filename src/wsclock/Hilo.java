package wsclock;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hilo extends Thread {

    VtnTablaPaginas p = new VtnTablaPaginas();
    JLabel etiqueta;
    DefaultTableModel modelo;
    JTable tabla;
    int cont=0;

    public Hilo(JLabel tiempo,JTable tabla, DefaultTableModel modelo) {
        this.etiqueta = tiempo;
        this.modelo=modelo;
        this.tabla=tabla;
    }

    @Override
    public void run() {

        try {
            int x = 0;

            while (p.estado == true) {
                Thread.sleep(1000);

                x++;
                pantalla(x);
              
                algoritmo(x);  
                
               
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
    
    
    
    private void algoritmo(int x){
        p.segundo++;
        String txt_seg = "";

        txt_seg += p.segundo;
        String pantalla = txt_seg;
        etiqueta.setText(pantalla);
        
       
        
        LSLC lista = new LSLC();
        Nodo n ;
        for (int i = 0; i < Main.numProcesos; i++) {
            for (int j = 0; j < Main.procesos[i].paginas.length; j++) {
                
                //n = new Nodo(Main.procesos[i].paginas[j].getPagina(), 1, 1,jTiempo.getText() );
                lista.insertar(Main.procesos[i].paginas[j].getPagina(),0,0 ,Integer.parseInt( pantalla));
                System.out.println(Main.procesos[i].nombre+" "+Main.procesos[i].tamanio+" "+Main.procesos[i].paginas[j].getPagina());
                cont ++;
            }
        }
        System.out.println("");
        System.out.println("");
        int aux=0;
        
        
        if (!lista.vacia()) {
             
                  
              for (int i = 0; i < Main.numProcesos; i++) {
              
               for (int j = 0; j < Main.procesos[i].paginas.length; j++) {
                
                 //lista.insertar(Main.procesos[i].paginas[j].getPagina(), 0, 0, Integer.parseInt(pantalla));
                 modelo.setValueAt(Main.procesos[i].paginas[j].getPagina(), aux, 1);
                 modelo.setValueAt(0, aux, 2);
                 modelo.setValueAt(0, aux, 3);
                 modelo.setValueAt(pantalla, aux, 4);

                 aux++;
                 
            }
        }
              
        
        tabla.setModel(modelo);
            lista.mostrarLista();
            
        }
        

}
}
