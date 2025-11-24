package br.com.infox.telas;

public class TelaSobre extends javax.swing.JFrame {

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
                new TelaSobre().setVisible(true);
            }
        });
    }

    public TelaSobre(){
        initComponents();
    }

    private void initComponents(){
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("X System - Sobre");
        setAlwaysOnTop(true);
        setResizable(false);

        lblSistema = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblLicenca = new javax.swing.JLabel();
        lblGNU = new javax.swing.JLabel();

        lblSistema.setText("Sistema para Controle de Ordem de Serviços");
        lblAutor.setText("Desenvolvido por José Anderson");
        lblLicenca.setText("Sob Licença GPL");
        lblGNU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/logoGNU.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50,50,50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSistema)
                    .addComponent(lblAutor)
                    .addComponent(lblLicenca)
                )
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblGNU)
                .addGap(50,50,50)
            )
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59,59,59)
                .addComponent(lblSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblLicenca)
                .addGap(59,59,59)
            )
            .addGroup(layout.createSequentialGroup()
                .addGap(75,75,75)
                .addComponent(lblGNU)
                .addGap(75,75,75)
            )
        );

        setSize(new java.awt.Dimension(480,235));
        setLocationRelativeTo(null);
    }

    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblLicenca;
    private javax.swing.JLabel lblGNU;

}
