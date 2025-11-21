package br.com.infox.telas;

public class TelaPrincipal extends javax.swing.JFrame{

    public TelaPrincipal(){
        initComponents();
    }

    private void initComponents(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600,500));
        setTitle("X System - Main");
        setResizable(false);

        menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menRel = new javax.swing.JMenu();
        menAju = new javax.swing.JMenu();
        menOpc = new javax.swing.JMenu();

        menCad.setText("Cadastro");
        menRel.setText("Relatório");
        menAju.setText("Ajuda");
        menOpc.setText("Opções");

        menu.add(menCad);
        menu.add(menRel);
        menu.add(menAju);
        menu.add(menOpc);
        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        setSize(new java.awt.Dimension(616, 540));
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws Exception {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenu menRel;
    private javax.swing.JMenu menAju;
    private javax.swing.JMenu menOpc;
}
