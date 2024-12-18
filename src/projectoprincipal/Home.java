package projectoprincipal;

//Importação de todas as bibliotecas necessarias para esta seção************************************
import java.text.DateFormat;
import java.util.*;
import static projectoprincipal.frmOperacao.preencheStockAux;
import static projectoprincipal.frmOperacao.stock;
import static projectoprincipal.frmOperacao.stockAux;
import static projectoprincipal.frmOperacao.stockReal;
//**************************************************************************************************

//Classe Home extendendo da Classe JFrame*************************************
public class Home extends javax.swing.JFrame {
    public static String carregador;
    public static boolean sistemaCorrendo=false;
    public static boolean sinalSplach=true;
    /**
     * Creates new form Home
     */
    //Construtor da classe Home
    public Home() {
       //Inicialização
       initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicial = new javax.swing.JLabel();
        painelSplach = new javax.swing.JPanel();
        llblAguarde = new javax.swing.JLabel();
        lblCarrega = new javax.swing.JLabel();
        lblSplach = new javax.swing.JLabel();
        painelHome = new javax.swing.JPanel();
        lblOperacao = new javax.swing.JLabel();
        lblEncerrar = new javax.swing.JLabel();
        lblRotulo = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblSinalData = new javax.swing.JLabel();
        lblDica = new javax.swing.JLabel();
        lblEstilo = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        painelAviso2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicial.setBackground(new java.awt.Color(0, 51, 51));
        lblInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblInicial.setName(""); // NOI18N
        lblInicial.setOpaque(true);
        getContentPane().add(lblInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 850, 10));

        painelSplach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        llblAguarde.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        llblAguarde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llblAguarde.setText("Aguarde porfavor ...");
        painelSplach.add(llblAguarde, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 180, 50));
        llblAguarde.getAccessibleContext().setAccessibleDescription("");

        lblCarrega.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblCarrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarrega.setToolTipText("Iniciando O Sistema");
        lblCarrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCarregaMouseEntered(evt);
            }
        });
        painelSplach.add(lblCarrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 150, 140));

        lblSplach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jjj.jpg"))); // NOI18N
        lblSplach.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblSplachMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSplachMouseMoved(evt);
            }
        });
        lblSplach.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                lblSplachMouseWheelMoved(evt);
            }
        });
        lblSplach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSplachMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSplachMouseReleased(evt);
            }
        });
        painelSplach.add(lblSplach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 370));

        getContentPane().add(painelSplach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 370));

        painelHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOperacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOperacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOperacaoMouseEntered(evt);
            }
        });
        painelHome.add(lblOperacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, 90));

        lblEncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEncerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEncerrarMouseEntered(evt);
            }
        });
        painelHome.add(lblEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 130, 100));

        lblRotulo.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lblRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRotulo.setToolTipText("");
        painelHome.add(lblRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 450, 40));

        lblMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 153), 1, true));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuMouseEntered(evt);
            }
        });
        painelHome.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 700, 330));

        lblData.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        painelHome.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 280, 20));

        lblSinalData.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblSinalData.setText("Data :");
        painelHome.add(lblSinalData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 40, 20));

        lblDica.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        lblDica.setText("Velamos pela simplicidade...");
        painelHome.add(lblDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 150, 20));

        lblEstilo.setBackground(new java.awt.Color(204, 255, 255));
        lblEstilo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 153), 1, true));
        painelHome.add(lblEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 850, 20));

        lblHome.setBackground(new java.awt.Color(0, 102, 102));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home1.jpg"))); // NOI18N
        lblHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });
        painelHome.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        painelAviso2.setBackground(new java.awt.Color(0, 0, 0));
        painelAviso2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelHome.add(painelAviso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 10, 330));

        getContentPane().add(painelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Ao entrar na area da labelHome (Com o ponteiro do mouse), limpa a label rotulo*********************************
    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        // TODO add your handling code here:   
         lblRotulo.setText(" ");
    }//GEN-LAST:event_lblHomeMouseEntered
    // Ao entrar na area da labelSobre (Com o ponteiro do mouse), Coloca o texto correspondente*********************************
    private void lblEncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEncerrarMouseEntered
        // TODO add your handling code here:
        lblRotulo.setText("Encerrar");
    }//GEN-LAST:event_lblEncerrarMouseEntered
    // Ao entrar na area da labelOperacao(Com o ponteiro do mouse), Coloca o texto correspondente*********************************
    private void lblOperacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOperacaoMouseEntered
        // TODO add your handling code here:
        lblRotulo.setText("Operações normais");

    }//GEN-LAST:event_lblOperacaoMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseExited
    // Ao entrar na area da labelMenu(Com o ponteiro do mouse), Limpa a label rotulo*********************************
    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        // TODO add your handling code here:
        lblRotulo.setText(" ");

    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblOperacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOperacaoMouseClicked
        // Fechar form Home e abrir form operação
        dispose();
        new frmOperacao().setVisible(true);
    }//GEN-LAST:event_lblOperacaoMouseClicked
    // Ao abrir form operação*************************************************
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // cria calendário
        Calendar cal=Calendar.getInstance();
        //cria data
        Date date = cal.getTime();
        //formata data
        DateFormat formato=DateFormat.getDateInstance(DateFormat.FULL);  
        //mostra data em labelData
        lblData.setText(formato.format(date));
        lblRotulo.setText("");
        //*******************Carregando o splach apartir de um label usando Threads*********************************
        // quando sinalSplach for false, o painelSplach será ocultado
        //Carregamento é uma classe que estende da classe Thread.
        //Neste caso ela envia para o construtor, o sinal de percentagem e o tempo em milissegundos
        //tempo este usado para alterar o comportamneto da componente label em intervalos definidos
        //O metodo start, permite iniciar a nossa thread.
        //sinalSplach será false quando o formOperação for aberto
        if(sinalSplach) new Carregamento("%",50).start();
        else painelSplach.setVisible(false);
        
        //Inicializa o stock pela primeira vez.
        if(!sistemaCorrendo){
            
            Float valorIni=20.00f;     
            int contador=0,pos1;
            //*******************Preenche o stock para verificação com 10 elementos*****************
            do{      
                
                stock.add(valorIni);

                if(valorIni==0.25f){ 
                    stock.remove(6);
                    stock.add(6,0.20f);
                    valorIni=0.20f;
                }
                if(valorIni==5.00f) valorIni=2.00f;
                else valorIni /=2.00f;

             }while(++contador<=10);
            
             stock.remove(9);
             stock.add(9,0.02f);
             stock.remove(10);
             stock.add(10,0.01f);
          //************************************************************************************************

             //Preenche stockAuxiliar para manipulação normal.
             for(pos1=0;pos1<stock.size();pos1++)
                stockAux.add(new StockDinheiro(stock.get(pos1),preencheStockAux(pos1+1),0));
             //preenche stockReal para guardar valores do stock.
             for(pos1=0;pos1<stockAux.size();pos1++)
                stockReal.add(new StockDinheiro(stockAux.get(pos1).getValor(),stockAux.get(pos1).getStock(),stockAux.get(pos1).getVariacao())); 
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void lblCarregaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarregaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCarregaMouseEntered

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_formWindowActivated

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
            
    }//GEN-LAST:event_formWindowIconified

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
   
    }//GEN-LAST:event_formMouseMoved

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void lblSplachMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSplachMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblSplachMouseMoved

    private void lblSplachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSplachMousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_lblSplachMousePressed

    private void lblSplachMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSplachMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblSplachMouseReleased

    private void lblSplachMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSplachMouseDragged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_lblSplachMouseDragged

    private void lblSplachMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_lblSplachMouseWheelMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblSplachMouseWheelMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void lblEncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEncerrarMouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_lblEncerrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel lblCarrega;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblEncerrar;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblRotulo;
    private javax.swing.JLabel lblSinalData;
    private javax.swing.JLabel lblSplach;
    private javax.swing.JLabel llblAguarde;
    private javax.swing.JPanel painelAviso2;
    private javax.swing.JPanel painelHome;
    public static javax.swing.JPanel painelSplach;
    // End of variables declaration//GEN-END:variables
}