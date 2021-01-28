package wsclock;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hilo extends Thread {

    LSLC lista = new LSLC();
    VtnTablaPaginas p = new VtnTablaPaginas();
    JLabel etiqueta;
    DefaultTableModel modelo;
    JTable tabla;
    int cont = 0, contador = 0, procesos = 0;
    int aux = 0;
    String mensaje="";

    public Hilo(JLabel tiempo, JTable tabla, DefaultTableModel modelo) {
        this.etiqueta = tiempo;
        this.modelo = modelo;
        this.tabla = tabla;
        
    }

    @Override
    public void run() {

        try {
            int x = 0;

            while (p.estado == true) {
                x++;
                pantalla(x);
                if (lista.vacia()) {

                    while ( procesos<Main.numProcesos) {
                        for (int j = 0; j < Main.procesos[procesos].paginas.length; j++) {

                            //n = new Nodo(Main.procesos[i].paginas[j].getPagina(), 1, 1,jTiempo.getText() );
                            lista.insertar(Main.procesos[procesos].paginas[j].getPagina(), 0, 0, x);
                            
                            if (!lista.vacia()) {
                                System.out.println("modelo: "+modelo.getRowCount());
                                
                                if( aux<modelo.getRowCount()){
                                    
                                    if (modelo.getValueAt(aux, 2).equals(0)){
                                        modelo.setValueAt(Main.procesos[procesos].paginas[j].getPagina(), aux, 1);
                                        modelo.setValueAt(1, aux, 2);//1=valor aux=filas 2=columnas
                                        // modelo.setValueAt(0, aux, 3);
                                        modelo.setValueAt(x, aux, 3);

                                        tabla.setModel(modelo);
                                    }else{
                                        j--;
                                        
                                     
                                    //modelo.setValueAt(Main.procesos[procesos].paginas[j].getPagina(), aux, 1);
                                    modelo.setValueAt(0, aux, 2);
                                    //modelo.setValueAt(1, aux, 3);
                                    //modelo.setValueAt(x, aux, 4);
                                    }
                                   
                                }else{
                                    aux=0;
                                    if (modelo.getValueAt(aux, 2).equals(1)) {
                                        modelo.setValueAt(0, aux, 2);
                                        j--;
                                        
                                    }else{
                                        
                                        modelo.setValueAt(Main.procesos[procesos].paginas[j].getPagina(), aux, 1);
                                    modelo.setValueAt(1, aux, 2);
                                    //modelo.setValueAt(1, aux, 3);
                                    modelo.setValueAt(x, aux, 3);
                                    }
                                    
                                    
                                }
                                
                                lista.mostrarLista();
                                aux++;
                            }

                            x++;
                            pantalla(x);

                            Thread.sleep(1000);

                            //System.out.println(Main.procesos[procesos].nombre + " " + Main.procesos[procesos].tamanio + " " + Main.procesos[procesos].paginas[j].getPagina());
                            cont++;
                            contador++;
                        }
                        mensaje+="PROCESO: "+Main.procesos[procesos].nombre+" "+(x-1)+"\n";
                        procesos++;
                    }
                    JOptionPane.showMessageDialog(null, mensaje );

                }
               
                Thread.sleep(1000);
               
                //if(procesos==0){
            }

            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage()+" kjshfjhhd");
        }

    }

    private void pantalla(int x) {

        p.segundo++;
        String txt_seg = "";

        txt_seg += p.segundo;
        String pantalla = txt_seg;
        etiqueta.setText(pantalla);

    }

    private void algoritmo(int x) {

        String txt_seg = "";

        txt_seg = String.valueOf(p.segundo);
        String pantalla = txt_seg;
        //etiqueta.setText(pantalla);

        Nodo n;

        for (int j = 0; j < Main.procesos[procesos].paginas.length; j++) {

            //n = new Nodo(Main.procesos[i].paginas[j].getPagina(), 1, 1,jTiempo.getText() );
            lista.insertar(Main.procesos[procesos].paginas[j].getPagina(), 0, 0, Integer.parseInt(pantalla));
            System.out.println(Main.procesos[procesos].nombre + " " + Main.procesos[procesos].tamanio + " " + Main.procesos[procesos].paginas[j].getPagina());
            cont++;
            contador++;
        }

        System.out.println("");
        System.out.println("");
        int aux = 0;

        if (!lista.vacia()) {

            for (int j = 0; j < Main.procesos[procesos].paginas.length; j++) {

                //lista.insertar(Main.procesos[i].paginas[j].getPagina(), 0, 0, Integer.parseInt(pantalla));
                modelo.setValueAt(Main.procesos[procesos].paginas[j].getPagina(), aux, 1);
                modelo.setValueAt(0, aux, 2);
              
                modelo.setValueAt(pantalla, aux, 3);

                aux++;

            }

            tabla.setModel(modelo);
            lista.mostrarLista();

        }

        procesos++;
    }
}
