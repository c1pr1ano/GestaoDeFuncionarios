package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Funcionario;


public class TelaConsultaView {
    private JFrame frame;
    private JTable tabela;
    private JButton visualizarButton;
    private JButton removerButton; // Botão para remover

    public TelaConsultaView() {
        frame = new JFrame("Consulta de Funcionários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tabela = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabela);

        visualizarButton = new JButton("Visualizar");
        removerButton = new JButton("Remover"); // Novo botão de remoção

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(visualizarButton, BorderLayout.SOUTH);
        panel.add(removerButton, BorderLayout.SOUTH); // Adicione o botão de remoção

        frame.add(panel);

        frame.setVisible(true);
    }

    public void setVisualizarButtonListener(ActionListener listener) {
        visualizarButton.addActionListener(listener);
    }

    public void setRemoverButtonListener(ActionListener listener) {
        removerButton.addActionListener(listener);
    }

    public JTable getTabela() {
        return tabela;
    }

    public int getSelectedRow() {
        return tabela.getSelectedRow();
    }

    // Método para atualizar a tabela com dados
    public void atualizarTabela(List<Funcionario> funcionarios) {
    }
}