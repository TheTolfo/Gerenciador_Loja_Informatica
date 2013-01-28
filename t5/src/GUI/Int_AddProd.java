/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Util.HibernateUtil;
import entidades.Cliente;
import entidades.Produto;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import org.hibernate.Session;

/**
 *
 * @author TheTolfo
 */
public class Int_AddProd extends javax.swing.JFrame {

    private Produto Prod;
    private boolean Add;
    private Cliente clt;

    /**
     * Creates new form Int_AddProd
     */
    public Int_AddProd(boolean add, Cliente Logado, Produto prod) {
        initComponents();
        if (add) {
            setTitle("InterVendas - ADM Adicionar Produto");
        } else {
            setTitle("InterVendas - ADM Editar Produto");
        }
        setLocationRelativeTo(null);
        Set_Data();
        Set_Dados(prod, add, Logado);
        int a, b;
        double c;

        if (Add) {
            jLabel7.setText("Adicionando produto.");
            a = 0;
            b = 0;
            c = 0;
        } else {
            jLabel7.setText("Editando produto.");
            a = Prod.getDesconto();
            b = Prod.getQuantia();
            c = Prod.getPreco();
            Set_Campos();
        }
        SpinnerNumberModel modelDesconto = new SpinnerNumberModel(a, 0, 100, 1);
        jSpinner1.setModel(modelDesconto);
        SpinnerNumberModel modelPreco = new SpinnerNumberModel(c, 0.0, 999999999999.9, 5.5);
        jSpinner2.setModel(modelPreco);
        SpinnerNumberModel modelQuantia = new SpinnerNumberModel(b, 0, 9999, 1);
        jSpinner3.setModel(modelQuantia);
    }

    private void Set_Data() {
        SimpleDateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar Data = new GregorianCalendar();
        jLabel2.setText(FormatoData.format(Data.getTime()));
    }

    private void Set_Dados(Produto prod, boolean add, Cliente Logado) {
        Prod = prod;
        Add = add;
        clt = Logado;
    }

    private void Set_Campos() {
        jTextField1.setText(Prod.getNome());
        jTextArea1.setText(Prod.getDescricao());
    }

    public static void Main_2nd(boolean add, Cliente Logado, Produto prod) {
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
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final Int_AddProd a = new Int_AddProd(add, Logado, prod);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                a.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(445, 356));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jButton1.setText("Concluir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel1.setText("Data: ");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel2.setText("dd/MM/yyyy");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel3.setText("Nome:");

        jTextField1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel4.setText("Preço:");

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel5.setText("Desconto (%):");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel6.setText("Descrição:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel8.setText("Quantidade:");

        jSpinner1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N

        jSpinner3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            int a, c;
            double b;
            if (Add) {
                jTextArea1.setText("");
                jTextField1.setText("");
                a = 0;
                b = 0;
                c = 0;
            } else {
                jTextField1.setText(Prod.getNome());
                jTextArea1.setText(Prod.getDescricao());
                a = Prod.getDesconto();
                b = Prod.getPreco();
                c = Prod.getQuantia();
            }
            SpinnerNumberModel modelDesconto = new SpinnerNumberModel(a, 0, 100, 1);
            jSpinner1.setModel(modelDesconto);
            SpinnerNumberModel modelPreco = new SpinnerNumberModel(b, 0, 999999999999.9, 5.5);
            jSpinner2.setModel(modelPreco);
            SpinnerNumberModel modelQuantia = new SpinnerNumberModel(c, 0, 9999, 1);
            jSpinner3.setModel(modelQuantia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (Add) {
            JOptionPane.showMessageDialog(null, "Nenhum produto adicionado!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma modificação efetuada!");
        }
        dispose();
        Int_Adm_Prod.Main_2nd(clt);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        String str;
        int quant = Integer.parseInt(jSpinner3.getValue().toString());
        int desc = Integer.parseInt(jSpinner1.getValue().toString());
        double preco = Double.parseDouble(jSpinner2.getValue().toString());
        if (Add) {
            Produto novo = new Produto(jTextField1.getText(), jTextArea1.getText(), quant, preco, desc);
            s.save(novo);
            str = "Produto adicionado com sucesso!";
        } else {
            Prod.setDesconto(desc);
            Prod.setDescricao(jTextArea1.getText());
            Prod.setNome(jTextField1.getText());
            Prod.setPreco(preco);
            Prod.setQuantia(quant);
            s.update(Prod);
            str = "Produto alterado com sucesso!";
        }
        s.getTransaction().commit();
        JOptionPane.showMessageDialog(null, str);
        dispose();
        Int_Adm_Prod.Main_2nd(clt);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Int_AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Int_AddProd(true, null, null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
