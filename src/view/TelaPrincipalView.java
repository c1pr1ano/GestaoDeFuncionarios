package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaPrincipalView {
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menuFuncionarios;
    private JMenuItem menuInclusao;
    private JMenuItem menuConsulta;

    public TelaPrincipalView() {
        frame = new JFrame("Tela Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        menuBar = new JMenuBar();
        menuFuncionarios = new JMenu("Funcionários");
        menuInclusao = new JMenuItem("Inclusão");
        menuConsulta = new JMenuItem("Consulta");

        menuFuncionarios.add(menuInclusao);
        menuFuncionarios.add(menuConsulta);
        menuBar.add(menuFuncionarios);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    public void setMenuInclusaoListener(ActionListener listener) {
        menuInclusao.addActionListener(listener);
    }

    public void setMenuConsultaListener(ActionListener listener) {
        menuConsulta.addActionListener(listener);
    }

    public void setVisible(boolean b) {
    }

    public void setJMenuBar(JMenuBar menuBar2) {
    }
}