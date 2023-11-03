package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaConsultaView {
    private JFrame frame;
    private JTable tabela;
    private JButton visualizarButton;

    public TelaConsultaView() {
        frame = new JFrame("Consulta de Funcionários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tabela = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabela);

        visualizarButton = new JButton("Visualizar");

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(visualizarButton, BorderLayout.SOUTH);

        frame.add(panel);

        frame.setVisible(true);
    }

    public void setVisualizarButtonListener(ActionListener listener) {
        visualizarButton.addActionListener(listener);
    }

    public JTable getTabela() {
        return tabela;
    }

    public int getSelectedRow() {
        return tabela.getSelectedRow();
    }

    public void setVisible(boolean b) {
    }
}