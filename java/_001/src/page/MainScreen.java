package page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {
    protected final JButton mysql;
    protected final JButton local;
    protected final String pass;

    public MainScreen() {
        //--------------------------------------------------------------------
        setTitle("Super Heroca");
        setSize(950, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);

        JButton mysql, local;
        //--------------------------------------------------------------------
        this.mysql = new JButton("ONLINE");
        this.local = new JButton("LOCAL");

        this.mysql.setBounds(10, 210, 200, 35);
        this.mysql.setFont( new Font("Arial", Font.ITALIC, 20) );

        this.mysql.setForeground(new Color(255, 255, 255));
        this.mysql.setBackground(new Color(18, 22, 48));

        this.local.setBounds(10, 260, 200, 35);
        this.local.setFont( new Font("Arial", Font.ITALIC, 20) );

        this.local.setForeground(new Color(255, 255, 255));
        this.local.setBackground(new Color(18, 22, 48));

        //--------------------------------------------------------------------
        add(this.mysql);
        add(this.local);

        //--------------------------------------------------------------------
        this.mysql.addActionListener(this::mysqlConfig);
        this.local.addActionListener(this::localConfig);

        this.pass = "felipe";

    }

    //--------------------------------------------------------------------
    public void localConfig(ActionEvent actionEvent) {
        String value = JOptionPane.showInputDialog(
                null,
                "DIGITE SUA SENHA:",
                this.local.getText() + " CONFIG",
                JOptionPane.WARNING_MESSAGE
        );

        if(value.isEmpty()) {
            System.exit(0);
        }

        if(value.equals("felipe")) {
            System.out.println(value);

            // create new page
            new Page("Local");

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Senha incorreta",
                    "Senha", JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }


    }

    //--------------------------------------------------------------------
    public void mysqlConfig(ActionEvent actionEvent) {
        String value = JOptionPane.showInputDialog(
                null,
                "DIGITE SUA SENHA:",
                this.mysql.getText() + " CONFIG",
                JOptionPane.WARNING_MESSAGE
        );

        if(value.isEmpty()) {
            System.exit(0);
        }

        if(value.equals("felipe")) {
            System.out.println(value);

            // create new page
            new Page("MYSQL");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Senha Incorreta",
                    "Senha", JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }

    }
}
