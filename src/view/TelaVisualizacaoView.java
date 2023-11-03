package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVisualizacaoView {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField sobrenomeField;
    private JTextField cargoField;
    private JButton limparButton; // Novo botão para limpar campos

    public TelaVisualizacaoView() {
        frame = new JFrame("Visualização de Funcionário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);
        nomeField.setEditable(false);

        JLabel sobrenomeLabel = new JLabel("Sobrenome:");
        sobrenomeField = new JTextField(20);
        sobrenomeField.setEditable(false);

        JLabel cargoLabel = new JLabel("Cargo:");
        cargoField = new JTextField(20);
        cargoField.setEditable(false);

        limparButton = new JButton("Limpar Campos");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(sobrenomeLabel);
        panel.add(sobrenomeField);
        panel.add(cargoLabel);
        panel.add(cargoField);
        panel.add(limparButton);

        frame.add(panel);

        frame.setVisible(false);
    }

    public void setFuncionario(String nome, String sobrenome, String cargo) {
        nomeField.setText(nome);
        sobrenomeField.setText(sobrenome);
        cargoField.setText(cargo);
    }

    public void limparCampos() {
        nomeField.setText("");
        sobrenomeField.setText("");
        cargoField.setText("");
    }

    public JButton getLimparButton() {
        return limparButton;
    }

    public void setVisible(boolean b) {
    }
}