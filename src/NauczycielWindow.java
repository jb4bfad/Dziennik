
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
public class NauczycielWindow extends javax.swing.JFrame  {
  
LogWindow.DB db;
String queryString;
Statement statement;
ResultSet rs ;
int columny=2;
boolean isCheck=true;


public void odswiez(){
    try{
        statement =db.conn.createStatement();
        int i=0;
        queryString = "select ID, Imie, Nazwisko from Uczniowie";
        rs = statement.executeQuery(queryString);
        for(i=0;i<tabelaNauczyciel.getRowCount();i++) {
            tabelaNauczyciel.getModel().setValueAt(null, i, columny);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+1);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+2);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+3);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+4);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+5);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+6);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+7);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+8);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+9);
            tabelaNauczyciel.getModel().setValueAt(null, i, columny+10);
            
        }
        i=0;
        while (rs.next()) {
            tabelaNauczyciel.getModel().setValueAt(rs.getString("ID"), i, columny-2);
            tabelaNauczyciel.getModel().setValueAt(rs.getString("Imie"), i, columny);
            tabelaNauczyciel.getModel().setValueAt(rs.getString("Nazwisko"), i, columny+1);
                            Statement statement2 =db.conn.createStatement();
                            String queryString2 = "select Ocena from Oceny where IDUczen="+rs.getString("ID")+" and IDPrzedmiot="+(wybierzPrzedmiot.getSelectedIndex()+1);
                            ResultSet rs2 = statement2.executeQuery(queryString2);
                            int j=0;
                            while (rs2.next()) {
                                tabelaNauczyciel.getModel().setValueAt(rs2.getString("Ocena"), i, columny+2+j);
                                j++;
                             }
        i++;
        }
        
    }catch(Exception e){
            e.printStackTrace();
     }
    String daty="";
          try{
            statement =db.conn.createStatement();
            queryString = "select ID, Imie, Nazwisko from Uczniowie";
            rs = statement.executeQuery(queryString);            
            for(int i=0;rs.next();i++ ){
                TabelaNieobecnosc.getModel().setValueAt(rs.getString("ID"), i, 0);
                TabelaNieobecnosc.getModel().setValueAt(rs.getString("Imie"), i, 1);
                TabelaNieobecnosc.getModel().setValueAt(rs.getString("Nazwisko"), i, 2);
                Statement statement2 =db.conn.createStatement();
                String queryString2 = "select Nieobecnosc from Obecnosc where IDUczen="+rs.getString("ID");
                ResultSet rs2 = statement2.executeQuery(queryString2);
                for(int j=0;rs2.next();j++ ){
                    daty=daty+rs2.getString("Nieobecnosc")+" | ";
                }
                TabelaNieobecnosc.getModel().setValueAt(daty, i, 3);
                daty="";
            }      
        }catch(Exception e){
            e.printStackTrace();
        }
    }
//public void odswiezObecnosci(){
//    String daty="";
//          try{
//            statement =db.conn.createStatement();
//            queryString = "select ID, Imie, Nazwisko from Uczniowie";
//            rs = statement.executeQuery(queryString);            
//            for(int i=0;rs.next();i++ ){
//                TabelaNieobecnosc.getModel().setValueAt(rs.getString("ID"), i, 0);
//                TabelaNieobecnosc.getModel().setValueAt(rs.getString("Imie"), i, 1);
//                TabelaNieobecnosc.getModel().setValueAt(rs.getString("Nazwisko"), i, 2);
//                Statement statement2 =db.conn.createStatement();
//                String queryString2 = "select Nieobecnosc from Obecnosc where IDUczen="+rs.getString("ID");
//                ResultSet rs2 = statement2.executeQuery(queryString2);
//                for(int j=0;rs2.next();j++ ){
//                    daty=daty+rs2.getString("Nieobecnosc")+" | ";
//                }
//                TabelaNieobecnosc.getModel().setValueAt(daty, i, 3);
//                daty="";
//            }      
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
    /**
     * Creates new form NauczycielWindow
     */
    public NauczycielWindow() {
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
        tabelaNauczyciel = new javax.swing.JTable();
        wybierzPrzedmiot = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        OdswiezOcenyButton = new javax.swing.JButton();
        DodajOceneButton = new javax.swing.JButton();
        EdytujOcenyButton = new javax.swing.JButton();
        UsunButton = new javax.swing.JButton();
        DodajOcenyWindow = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDodajOceny = new javax.swing.JTable();
        ZapiszOceneButton = new javax.swing.JButton();
        DodajText2 = new javax.swing.JTextField();
        DodajNieobecnoscWindow = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaDodaNieobecnosc = new javax.swing.JTable();
        DodajText3 = new javax.swing.JTextField();
        ZapiszNieobecnoscButton = new javax.swing.JButton();
        NieobecnosciWindow = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        DodajNieobenoscButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaNieobecnosc = new javax.swing.JTable();
        obecnosciButton = new javax.swing.JButton();
        ocenyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        OcenyWindow.setSize(new java.awt.Dimension(1000, 335));

        tabelaNauczyciel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Check", "Imie", "Nazwisko", "Ocena 1", "Ocena 2", "Ocena 3", "Ocena 4", "Ocena 5", "Ocena 6", "Ocena 7", "Ocena 8", "Ocena 9", "Ocena 10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaNauczyciel.setToolTipText("");
        jScrollPane1.setViewportView(tabelaNauczyciel);

        wybierzPrzedmiot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wybierzPrzedmiot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematyka", "Język polski", "Język angielski", "Informatyka", "Chemia", "Biologia" }));
        wybierzPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wybierzPrzedmiotActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Wybierz przedmiot");

        OdswiezOcenyButton.setText("Odśwież");
        OdswiezOcenyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdswiezOcenyButtonActionPerformed(evt);
            }
        });

        DodajOceneButton.setText("Dodaj oceny");
        DodajOceneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajOceneButtonActionPerformed(evt);
            }
        });

        EdytujOcenyButton.setText("Edytuj oceny");
        EdytujOcenyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdytujOcenyButtonActionPerformed(evt);
            }
        });

        UsunButton.setText("Usuń");
        UsunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OcenyWindowLayout = new javax.swing.GroupLayout(OcenyWindow.getContentPane());
        OcenyWindow.getContentPane().setLayout(OcenyWindowLayout);
        OcenyWindowLayout.setHorizontalGroup(
            OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OcenyWindowLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OcenyWindowLayout.createSequentialGroup()
                        .addComponent(OdswiezOcenyButton)
                        .addGap(46, 46, 46)
                        .addComponent(DodajOceneButton)
                        .addGap(41, 41, 41)
                        .addComponent(EdytujOcenyButton)
                        .addGap(43, 43, 43)
                        .addComponent(UsunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
                    .addGroup(OcenyWindowLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(wybierzPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        OcenyWindowLayout.setVerticalGroup(
            OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OcenyWindowLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wybierzPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(OcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OdswiezOcenyButton)
                    .addComponent(DodajOceneButton)
                    .addComponent(EdytujOcenyButton)
                    .addComponent(UsunButton))
                .addContainerGap())
        );

        DodajOcenyWindow.setSize(new java.awt.Dimension(400, 320));
        DodajOcenyWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DodajOcenyWindowMouseClicked(evt);
            }
        });

        TabelaDodajOceny.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Ucznia", "Imie", "Nazwisko", "Ocena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaDodajOceny);

        ZapiszOceneButton.setText("Zapisz oceny");
        ZapiszOceneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszOceneButtonActionPerformed(evt);
            }
        });

        DodajText2.setEditable(false);
        DodajText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajText2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DodajOcenyWindowLayout = new javax.swing.GroupLayout(DodajOcenyWindow.getContentPane());
        DodajOcenyWindow.getContentPane().setLayout(DodajOcenyWindowLayout);
        DodajOcenyWindowLayout.setHorizontalGroup(
            DodajOcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DodajOcenyWindowLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(DodajText2)
            .addGroup(DodajOcenyWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ZapiszOceneButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DodajOcenyWindowLayout.setVerticalGroup(
            DodajOcenyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DodajOcenyWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(ZapiszOceneButton)
                .addGap(42, 42, 42)
                .addComponent(DodajText2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DodajNieobecnoscWindow.setSize(new java.awt.Dimension(400, 317));

        TabelaDodaNieobecnosc.setAutoCreateRowSorter(true);
        TabelaDodaNieobecnosc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Ucznia", "Imie", "Nazwisko", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDodaNieobecnosc.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        TabelaDodaNieobecnosc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(TabelaDodaNieobecnosc);

        DodajText3.setEditable(false);
        DodajText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajText3ActionPerformed(evt);
            }
        });

        ZapiszNieobecnoscButton.setText("Zapisz");
        ZapiszNieobecnoscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszNieobecnoscButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DodajNieobecnoscWindowLayout = new javax.swing.GroupLayout(DodajNieobecnoscWindow.getContentPane());
        DodajNieobecnoscWindow.getContentPane().setLayout(DodajNieobecnoscWindowLayout);
        DodajNieobecnoscWindowLayout.setHorizontalGroup(
            DodajNieobecnoscWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DodajNieobecnoscWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DodajNieobecnoscWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DodajText3)
                    .addGroup(DodajNieobecnoscWindowLayout.createSequentialGroup()
                        .addGroup(DodajNieobecnoscWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ZapiszNieobecnoscButton)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DodajNieobecnoscWindowLayout.setVerticalGroup(
            DodajNieobecnoscWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DodajNieobecnoscWindowLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ZapiszNieobecnoscButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DodajText3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NieobecnosciWindow.setSize(new java.awt.Dimension(800, 300));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nieobecność na zajęciach:");

        DodajNieobenoscButton.setText("Dodaj");
        DodajNieobenoscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajNieobenoscButtonActionPerformed(evt);
            }
        });

        TabelaNieobecnosc.setAutoCreateRowSorter(true);
        TabelaNieobecnosc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Imie", "Nazwisko", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaNieobecnosc.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        TabelaNieobecnosc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(TabelaNieobecnosc);

        javax.swing.GroupLayout NieobecnosciWindowLayout = new javax.swing.GroupLayout(NieobecnosciWindow.getContentPane());
        NieobecnosciWindow.getContentPane().setLayout(NieobecnosciWindowLayout);
        NieobecnosciWindowLayout.setHorizontalGroup(
            NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NieobecnosciWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addGroup(NieobecnosciWindowLayout.createSequentialGroup()
                        .addGroup(NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(DodajNieobenoscButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NieobecnosciWindowLayout.setVerticalGroup(
            NieobecnosciWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NieobecnosciWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(DodajNieobenoscButton)
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        obecnosciButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obecnosciButton.setText("Obecności");
        obecnosciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obecnosciButtonActionPerformed(evt);
            }
        });

        ocenyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ocenyButton.setText("Oeny");
        ocenyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocenyButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Panel Nauczyciela");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ocenyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(obecnosciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obecnosciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocenyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wybierzPrzedmiotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wybierzPrzedmiotActionPerformed
        // TODO add your handling code here:
        this.odswiez();
                //System.out.println(wybierzPrzedmiot.getSelectedIndex()+1 );
    }//GEN-LAST:event_wybierzPrzedmiotActionPerformed

    private void obecnosciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obecnosciButtonActionPerformed
        // TODO add your handling code here:
        TabelaNieobecnosc.getColumnModel().getColumn(0).setPreferredWidth(30);
        TabelaNieobecnosc.getColumnModel().getColumn(1).setPreferredWidth(110);
        TabelaNieobecnosc.getColumnModel().getColumn(2).setPreferredWidth(110);
        TabelaNieobecnosc.getColumnModel().getColumn(3).setPreferredWidth(600);
        NieobecnosciWindow.setVisible(true);
//        this.odswiezObecnosci(); 
        this.odswiez();
    }//GEN-LAST:event_obecnosciButtonActionPerformed

    private void ocenyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocenyButtonActionPerformed
        // TODO add your handling code here:
        tabelaNauczyciel.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabelaNauczyciel.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabelaNauczyciel.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabelaNauczyciel.getColumnModel().getColumn(3).setPreferredWidth(110);
        OcenyWindow.setVisible(true);
        
    }//GEN-LAST:event_ocenyButtonActionPerformed

    private void OdswiezOcenyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdswiezOcenyButtonActionPerformed
        // TODO add your handling code here:
        this.odswiez();
    }//GEN-LAST:event_OdswiezOcenyButtonActionPerformed

    private void DodajOceneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajOceneButtonActionPerformed
        // TODO add your handling code here:
        
        DodajOcenyWindow.setVisible(true);
         isCheck=true;
       try{
            statement =db.conn.createStatement();
            int i=0;
            queryString = "select ID, Imie, Nazwisko from Uczniowie";
            rs = statement.executeQuery(queryString);

            i=0;
            while (rs.next()) {
                TabelaDodajOceny.getModel().setValueAt(rs.getString("ID"), i, 0);
                TabelaDodajOceny.getModel().setValueAt(rs.getString("Imie"), i, 1);
                TabelaDodajOceny.getModel().setValueAt(rs.getString("Nazwisko"), i, 2);

            i++;
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_DodajOceneButtonActionPerformed

    private void ZapiszOceneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszOceneButtonActionPerformed
        // TODO add your handling code here:
        DodajText2.setText("Poszę podać wartość oceny w skali od 1 do 6");
        int i=0;
        try{
            Statement statement2 =db.conn.createStatement();      
            queryString = "select ID, Imie, Nazwisko from Uczniowie";
            ResultSet rs2 = statement2.executeQuery(queryString);
            Statement statement1 =db.conn.createStatement(); 
            i=0;
            while (rs2.next()) {
               if( TabelaDodajOceny.getModel().getValueAt(i, 3)!=null ){
                queryString="SELECT MAX(ID) ID FROM Oceny";
                ResultSet rs1 = statement1.executeQuery(queryString);
                rs1.next();

                int a=0;
                a= Integer.parseInt(rs1.getString("ID"))+1;
                NauczycielOdswiezWatek now = new NauczycielOdswiezWatek(a, Integer.parseInt(TabelaDodajOceny.getModel().getValueAt(i, 0).toString()), (wybierzPrzedmiot.getSelectedIndex()+1), TabelaDodajOceny.getModel().getValueAt(i, 3).toString());
                now.db = db;
                now.start();
                TabelaDodajOceny.getModel().setValueAt(null, i, 3);
                i++;
                }else{
                    i++;
                    continue;
                } 
            }
        DodajOcenyWindow.dispose();
        }catch(Exception e){
            e.printStackTrace();  
        }        
        this.odswiez(); 
    }//GEN-LAST:event_ZapiszOceneButtonActionPerformed

    private void EdytujOcenyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdytujOcenyButtonActionPerformed
       //  TODO add your handling code here:
    try{
          Statement statement2 =db.conn.createStatement(); 
          for(int i=0; i<tabelaNauczyciel.getRowCount();i++){
            String queryString2 = "select ID, Ocena from Oceny where IDUczen="+tabelaNauczyciel.getModel().getValueAt(i, 0)+" and IDPrzedmiot="+(wybierzPrzedmiot.getSelectedIndex()+1);
            ResultSet rs2 = statement2.executeQuery(queryString2);
                int j=0;
                while (rs2.next()) {
                    if(tabelaNauczyciel.getModel().getValueAt(i, 1)!=null ){
                        queryString = "UPDATE Oceny SET Ocena = '"
                                +tabelaNauczyciel.getModel().getValueAt(i,columny+2+j)+"' WHERE ID="
                                +rs2.getString("ID");
                        db.statement.executeUpdate(queryString);
                    }   
                j++;
                }
            tabelaNauczyciel.getModel().setValueAt(false, i, 1);
          }
        }catch(Exception e){
            e.printStackTrace();
        } 
        this.odswiez();
    }//GEN-LAST:event_EdytujOcenyButtonActionPerformed

    private void DodajOcenyWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DodajOcenyWindowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DodajOcenyWindowMouseClicked

    private void UsunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunButtonActionPerformed
        // TODO add your handling code here:
        try{
          Statement statement2 =db.conn.createStatement(); 
          for(int i=0; i<tabelaNauczyciel.getRowCount();i++){
            String queryString2 = "select ID, Ocena from Oceny where IDUczen="+tabelaNauczyciel.getModel().getValueAt(i, 0)+" and IDPrzedmiot="+(wybierzPrzedmiot.getSelectedIndex()+1);
            ResultSet rs2 = statement2.executeQuery(queryString2);
                int j=0;
                while (rs2.next()) {
                    if(tabelaNauczyciel.getModel().getValueAt(i, columny+2+j).equals("")) {
                            queryString = "DELETE FROM Oceny WHERE ID="+rs2.getString("ID");        
                            db.statement.executeUpdate(queryString);
                    }   
                    j++;
                }
          }
        }catch(Exception e){
            e.printStackTrace();
        } 
        this.odswiez();    
    }//GEN-LAST:event_UsunButtonActionPerformed

    private void DodajText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DodajText2ActionPerformed

    private void DodajText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DodajText3ActionPerformed

    private void ZapiszNieobecnoscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszNieobecnoscButtonActionPerformed
        // TODO add your handling code here:
        DodajText3.setText("Poszę podać datę w formacie dd/mm/rrrr");
        int i=0;
        try{
            Statement statement2 =db.conn.createStatement();      
            queryString = "select ID, Imie, Nazwisko from Uczniowie";
            ResultSet rs2 = statement2.executeQuery(queryString);
            Statement statement1 =db.conn.createStatement(); 
            i=0;
            while (rs2.next()) {
                if( TabelaDodaNieobecnosc.getModel().getValueAt(i, 3)!=null ){
                    queryString="SELECT MAX(ID) ID FROM Obecnosc";
                    ResultSet rs1 = statement1.executeQuery(queryString);
                    rs1.next();
                     int a=0;
                     a= Integer.parseInt(rs1.getString("ID"))+1;
                     queryString = "INSERT INTO Obecnosc (ID, IDUczen, Nieobecnosc) VALUES ("
                             +a+","
                             + TabelaDodaNieobecnosc.getModel().getValueAt(i, 0)+",'"
                             + TabelaDodaNieobecnosc.getModel().getValueAt(i, 3)+"')";
                     db.statement.executeUpdate(queryString);
                     TabelaDodaNieobecnosc.getModel().setValueAt(null, i, 3);
                     i++;
                     }else{
                        i++;
                        continue;
                     }
                
               }
            DodajNieobecnoscWindow.dispose();
        }catch(Exception e){
            e.printStackTrace();
        }   
        this.odswiez();
        //this.odswiezObecnosci();  
    }//GEN-LAST:event_ZapiszNieobecnoscButtonActionPerformed

    private void DodajNieobenoscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajNieobenoscButtonActionPerformed
        // TODO add your handling code here:
        DodajNieobecnoscWindow.setVisible(true);
        try{
            statement =db.conn.createStatement();
            queryString = "select ID, Imie, Nazwisko from Uczniowie";
            rs = statement.executeQuery(queryString);            
            for(int i=0;rs.next();i++ ){
                TabelaDodaNieobecnosc.getModel().setValueAt(rs.getString("ID"), i, 0);
                TabelaDodaNieobecnosc.getModel().setValueAt(rs.getString("Imie"), i, 1);
                TabelaDodaNieobecnosc.getModel().setValueAt(rs.getString("Nazwisko"), i, 2);
            }      
        }catch(Exception e){
            e.printStackTrace();
        }
        DodajText3.setText("Poszę podać datę w formacie dd/mm/rrrr");
    }//GEN-LAST:event_DodajNieobenoscButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NauczycielWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NauczycielWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NauczycielWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NauczycielWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NauczycielWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame DodajNieobecnoscWindow;
    private javax.swing.JButton DodajNieobenoscButton;
    private javax.swing.JButton DodajOceneButton;
    private javax.swing.JFrame DodajOcenyWindow;
    private javax.swing.JTextField DodajText2;
    private javax.swing.JTextField DodajText3;
    private javax.swing.JButton EdytujOcenyButton;
    private javax.swing.JFrame NieobecnosciWindow;
    private javax.swing.JFrame OcenyWindow;
    private javax.swing.JButton OdswiezOcenyButton;
    private javax.swing.JTable TabelaDodaNieobecnosc;
    private javax.swing.JTable TabelaDodajOceny;
    private javax.swing.JTable TabelaNieobecnosc;
    private javax.swing.JButton UsunButton;
    private javax.swing.JButton ZapiszNieobecnoscButton;
    private javax.swing.JButton ZapiszOceneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton obecnosciButton;
    private javax.swing.JButton ocenyButton;
    private javax.swing.JTable tabelaNauczyciel;
    private javax.swing.JComboBox<String> wybierzPrzedmiot;
    // End of variables declaration//GEN-END:variables
}
