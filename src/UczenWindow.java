
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Janusz
 */
public class UczenWindow extends javax.swing.JFrame {
    LogWindow.DB db;
    String queryString;
    Statement statement;
    ResultSet rs ;
    int columny=1, idUcznia;
    boolean isCheck=true;
    
    
public void odswiez(){
         try{
        statement =db.conn.createStatement();
        queryString = "select ID, Imie, Nazwisko from Uczniowie where ID="+idUcznia;
        rs = statement.executeQuery(queryString);
        rs.next();
        NazwaLabel.setText(rs.getString("Imie")+" "+rs.getString("Nazwisko"));
        NazwaLabel2.setText(rs.getString("Imie")+" "+rs.getString("Nazwisko"));
        NazwaLabel3.setText(rs.getString("Imie")+" "+rs.getString("Nazwisko"));

    }catch(Exception e){
            e.printStackTrace();
     }
    }
    /**
     * Creates new form UczenWindow
     */
    public UczenWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OcenyWindow = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUczen = new javax.swing.JTable();
        NazwaLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NieobecnosciWindow = new javax.swing.JFrame();
        NazwaLabel3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NieobecnosciArea = new javax.swing.JTextArea();
        NazwaUcznia = new javax.swing.JLabel();
        NieobecnosciButton = new javax.swing.JButton();
        OcenyButton = new javax.swing.JButton();
        NazwaLabel = new javax.swing.JLabel();

        OcenyWindow.setSize(new java.awt.Dimension(1050, 250));

        tabelaUczen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Przedmiot", "Ocena 1", "Ocena 2", "Ocena 3", "Ocena 4", "Ocena 5", "Ocena 6", "Ocena 7", "Ocena 8", "Ocena 9", "Ocena 10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUczen.setToolTipText("");
        jScrollPane1.setViewportView(tabelaUczen);

        NazwaLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NazwaLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Uczeń:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Wykaz Ocen");

        javax.swing.GroupLayout OcenyWindowLayout = new javax.swing.GroupLayout(OcenyWindow.getContentPane());
        OcenyWindow.getContentPane().setLayout(OcenyWindowLayout);
        OcenyWindowLayout.setHorizontalGroup(
            OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OcenyWindowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(OcenyWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NazwaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        OcenyWindowLayout.setVerticalGroup(
            OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OcenyWindowLayout.createSequentialGroup()
                .addGroup(OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(NazwaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OcenyWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        NieobecnosciWindow.setSize(new java.awt.Dimension(450, 260));

        NazwaLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NazwaLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Uczeń:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nieobecność");

        jScrollPane2.setToolTipText("");

        NieobecnosciArea.setColumns(20);
        NieobecnosciArea.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        NieobecnosciArea.setLineWrap(true);
        NieobecnosciArea.setRows(5);
        NieobecnosciArea.setText("\n");
        jScrollPane2.setViewportView(NieobecnosciArea);

        javax.swing.GroupLayout NieobecnosciWindowLayout = new javax.swing.GroupLayout(NieobecnosciWindow.getContentPane());
        NieobecnosciWindow.getContentPane().setLayout(NieobecnosciWindowLayout);
        NieobecnosciWindowLayout.setHorizontalGroup(
            NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NieobecnosciWindowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NazwaLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(NieobecnosciWindowLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(NieobecnosciWindowLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        NieobecnosciWindowLayout.setVerticalGroup(
            NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NieobecnosciWindowLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(NazwaLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NazwaUcznia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NazwaUcznia.setText("Panel Rodzica");

        NieobecnosciButton.setText("Nieobecności");
        NieobecnosciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NieobecnosciButtonActionPerformed(evt);
            }
        });

        OcenyButton.setText("Oceny");
        OcenyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcenyButtonActionPerformed(evt);
            }
        });

        NazwaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NazwaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OcenyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NazwaUcznia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NieobecnosciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(NazwaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NazwaUcznia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NazwaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OcenyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NieobecnosciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OcenyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcenyButtonActionPerformed
        // TODO add your handling code here:
        OcenyWindow.setVisible(true);
             try{
        statement =db.conn.createStatement();
        queryString = "select ID, Imie, Nazwisko from Uczniowie where ID="+idUcznia;
        rs = statement.executeQuery(queryString);
        rs.next();
        NazwaLabel.setText(rs.getString("Imie")+" "+rs.getString("Nazwisko"));
        NazwaLabel2.setText(rs.getString("Imie")+" "+rs.getString("Nazwisko"));
        
        statement =db.conn.createStatement();
        int i=0;
        queryString = "select IDPrzedmiotu, Nazwa from Przedmioty";
        rs = statement.executeQuery(queryString);
        i=0;
        while (rs.next()) {
            tabelaUczen.getModel().setValueAt(rs.getString("Nazwa"), i, columny-1);
           
                            Statement statement2 =db.conn.createStatement();
                            String queryString2 = "select Ocena from Oceny where IDUczen="+idUcznia+" and IDPrzedmiot="+rs.getString("IDPrzedmiotu");
                            ResultSet rs2 = statement2.executeQuery(queryString2);
                            int j=0;
                            while (rs2.next()) {
                                tabelaUczen.getModel().setValueAt(rs2.getString("Ocena"), i, columny+j);
                                j++;
                             }
        i++;
        }
        
        
    }catch(Exception e){
            e.printStackTrace();
     }
    }//GEN-LAST:event_OcenyButtonActionPerformed

    private void NieobecnosciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NieobecnosciButtonActionPerformed
        // TODO add your handling code here:
        String daty="";
        NieobecnosciWindow.setVisible(true);
          try{
           
                statement =db.conn.createStatement();
                 queryString = "select Nieobecnosc from Obecnosc where IDUczen="+idUcznia;
                 rs = statement.executeQuery(queryString);
                for(int i=0;rs.next();i++ ){
                    daty=daty+rs.getString("Nieobecnosc")+" | ";
                }
                NieobecnosciArea.setText(daty);
                daty="";
                  
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_NieobecnosciButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UczenWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UczenWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UczenWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UczenWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UczenWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NazwaLabel;
    private javax.swing.JLabel NazwaLabel2;
    private javax.swing.JLabel NazwaLabel3;
    private javax.swing.JLabel NazwaUcznia;
    private javax.swing.JTextArea NieobecnosciArea;
    private javax.swing.JButton NieobecnosciButton;
    private javax.swing.JFrame NieobecnosciWindow;
    private javax.swing.JButton OcenyButton;
    private javax.swing.JFrame OcenyWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaUczen;
    // End of variables declaration//GEN-END:variables
}
