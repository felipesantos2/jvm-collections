package page;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Page extends JFrame {

    protected JButton confirm;
    protected JTextField pass, user,host, port;


    public Page(String name) {
        //--------------------------------------------------------------------
        super(name);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);

        //--------------------------------------------------------------------
        JButton confirm;
        JTextField pass, user,host, port;

        //--------------------------------------------------------------------
        this.pass = new JTextField("Pass: ", 20);
        this.user = new JTextField("User: ", 20);
        this.host = new JTextField("Host: ", 20);
        this.port = new JTextField("Porta: ",20);
        this.confirm = new JButton("Salvar");


        //--------------------------------------------------------------------
        this.pass.setBackground(new Color(77, 86, 134));
        this.pass.setBounds(10, 25, 400, 45);
        this.pass.setForeground(new Color(255,255,255));
        this.pass.setFont( new Font("Arial", Font.ITALIC, 20) );

        this.user.setBackground(new Color(77, 86, 134));
        this.user.setBounds(10, 75, 400, 45);
        this.user.setForeground(new Color(255,255,255));
        this.user.setFont( new Font("Arial", Font.ITALIC, 20));

        this.host.setBackground(new Color(77, 86, 134));
        this.host.setBounds(10, 125, 400, 45);
        this.host.setForeground(new Color(255,255,255));
        this.host.setFont( new Font("Arial", Font.ITALIC, 20));

        this.port.setBackground(new Color(77, 86, 134));
        this.port.setBounds(10, 175, 400, 45);
        this.port.setForeground(new Color(255,255,255));
        this.port.setFont(new Font("Arial", Font.ITALIC, 20));

        this.confirm.setBounds(10, 500, 467, 50);
        this.confirm.setFont( new Font("Arial", Font.ITALIC, 20) );
        this.confirm.setForeground(new Color(255, 255, 255));
        this.confirm.setBackground(new Color(18, 22, 48));

        //--------------------------------------------------------------------
            //events
        this.confirm.addActionListener(this::save);

        //--------------------------------------------------------------------
        add(this.host);
        add(this.user);
        add(this.pass);
        add(this.port);
        add(this.confirm);

    }

    public void save(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(
                null,
                "Salvo com sucesso! ->" + host.getText() ,
                "SALVO!", JOptionPane.INFORMATION_MESSAGE
        );
    }

}
