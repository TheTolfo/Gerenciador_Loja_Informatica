/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Util.HibernateUtil;
import entidades.Cliente;
import entidades.Produto;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author TheTolfo
 */
public class Int_Adm_Prod extends javax.swing.JFrame {

    Cliente clt;

    /**
     * Creates new form Int_Adm_Prod
     */
    public Int_Adm_Prod(Cliente Logado) {
        initComponents();
        Set_Cliente(Logado);
        Set_Data();
        setTitle("InterVendas - ADM Editar Produtos");
        setLocationRelativeTo(null);
        Set_Boas_Vindas(clt.getNome());
        Preenche_Tabela();
        setVisible(true);
    }

    private void Set_Cliente(Cliente Logado) {
        clt = Logado;
    }

    private void Set_Data() {
        SimpleDateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar Data = new GregorianCalendar();
        jLabel2.setText(FormatoData.format(Data.getTime()));
    }

    private void Preenche_Tabela() {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(4);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(4);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(4);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(4);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(4);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(4);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession(); //retorna uma sessao para referencia
            s.beginTransaction(); // abre a sessao para incluir, recuperar deletar os objetos na base de dados

            List<Produto> c = new ArrayList<Produto>();
            c = s.createQuery("from Produto").list();
            s.getTransaction().commit(); //fexa seçao e encerra transaçõe

            for (Produto cl : c) {
                modelo.addRow(new Object[]{cl.getNome(), cl.getDescricao(), cl.getIdProduto(), cl.getPreco(), cl.getQuantia(), cl.getDesconto()});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    private Produto RetornaProd_Selecionado() {
        int linha = jTable1.getSelectedRow();
        return t5.Verificações.Retorna_Produto(jTable1.getValueAt(linha, 0).toString());
    }

    private void Set_Boas_Vindas(String str) {
        jLabel3.setText("Bem vindo " + str + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel1.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel2.setText("dd/MM/yyyy");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Bem vindo!");

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jButton2.setText("Remover");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jButton3.setText("Editar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "id Produto", "Preço", "Quantiadade", "Desconto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Editar Clientes");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 0, 0, 5));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar ADM's");
        jMenu2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Opcoes");
        jMenu4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Logout");
        jMenu3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        dispose();
        Int_Inicio.main(null);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if (clt.getAdmPrinc()) {
            dispose();
            Int_Adm_Adm.Main_2nd(clt);
        } else {
            JOptionPane.showMessageDialog(null, "Voce não tem permissao para isso!");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
        Int_Adm_Client.Main_2nd(clt);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            Produto prod = RetornaProd_Selecionado();
            if (prod != null) {
                if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto " + prod.getNome() + "?", "Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                Session s = HibernateUtil.getSessionFactory().getCurrentSession();
                s.beginTransaction();
                s.delete(prod);
                s.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Produto " + prod.getNome() +" removido com sucesso!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Produto " + prod.getNome() +" não removido!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }
        } catch (HibernateException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        jTable1.removeAll();
        Preenche_Tabela();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            Produto prod = RetornaProd_Selecionado();
            if (prod != null) {
                dispose();
                Int_AddProd.Main_2nd(false, clt, prod);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
            }
        } catch (Exception prod) {
            JOptionPane.showMessageDialog(null, "Erro: " + prod);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dispose();
        Int_AddProd.Main_2nd(true, clt, null);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        dispose();
        Int_Adm_Opcoes.Main_2nd(clt);
    }//GEN-LAST:event_jMenu4MouseClicked

    public static void Main_2nd(final Cliente Logado) {
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
            java.util.logging.Logger.getLogger(Int_Adm_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Int_Adm_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Int_Adm_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Int_Adm_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Int_Adm_Prod(Logado).setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Cliente t = new Cliente("test", "test", "test", "test", "test", "test", 0, false, false);
        Main_2nd(t);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
