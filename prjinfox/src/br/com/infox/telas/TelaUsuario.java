package br.com.infox.telas;

public class TelaUsuario extends javax.swing.JInternalFrame {

    public TelaUsuario(){
        initComponents();
    }

    private void initComponents(){
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuário");
        setPreferredSize(new java.awt.Dimension(640,480));

        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblFone = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        cboPerfil = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        lblID.setText("ID");
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNome.setText("Nome");
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFone.setText("Telefone");
        lblFone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSenha.setText("Senha");
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLogin.setText("Login");
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPerfil.setText("Perfil");
        lblPerfil.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        cboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"admin, user"}));
        btnCreate.setText("Adicionar");
        btnRead.setText("Consultar");
        btnUpdate.setText("Alterar");
        btnDelete.setText("Deletar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(295,295,295)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(295,295,295)
            )
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(145,Short.MAX_VALUE)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblFone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblSenha)
                .addContainerGap(144,Short.MAX_VALUE)
            )
        );

        setBounds(0,0,640,480);
    }

    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblFone;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JComboBox<String> cboPerfil;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnDelete;

}
