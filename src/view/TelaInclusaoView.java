package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInclusaoView {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField sobrenomeField;
    private JTextField cargoField;
    private JButton adicionarButton;

    public TelaInclusaoView() {
        frame = new JFrame("Inclusão de Funcionário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel sobrenomeLabel = new JLabel("Sobrenome:");
        sobrenomeField = new JTextField(20);

        JLabel cargoLabel = new JLabel("Cargo:");
        cargoField = new JTextField(20);

        adicionarButton = new JButton("Adicionar");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(sobrenomeLabel);
        panel.add(sobrenomeField);
        panel.add(cargoLabel);
        panel.add(cargoField);
        panel.add(adicionarButton);

        frame.add(panel);

        frame.setVisible(true);
    }

    public void setAdicionarButtonListener(ActionListener listener) {
        adicionarButton.addActionListener(listener);
    }

    public String getNome() {
        return nomeField.getText();
    }

    public String getSobrenome() {
        return sobrenomeField.getText();
    }

    public String getCargo() {
        return cargoField.getText();
    }

    public void setVisible(boolean b) {
    }
}