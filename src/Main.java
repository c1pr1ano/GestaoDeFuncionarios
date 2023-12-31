import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import model.FuncionarioCollection;
import presenter.TelaConsultaPresenter;
import presenter.TelaInclusaoPresenter;
import presenter.TelaPrincipalPresenter;
import presenter.TelaVisualizacaoPresenter;
import view.TelaConsultaView;
import view.TelaInclusaoView;
import view.TelaPrincipalView;
import view.TelaVisualizacaoView;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crie as instâncias das visualizações (Views)
            TelaPrincipalView telaPrincipalView = new TelaPrincipalView();
            TelaInclusaoView telaInclusaoView = new TelaInclusaoView();
            TelaConsultaView telaConsultaView = new TelaConsultaView();
            TelaVisualizacaoView telaVisualizacaoView = new TelaVisualizacaoView();

            // Crie uma instância de FuncionarioCollection
            FuncionarioCollection funcionarioCollection = new FuncionarioCollection();

            // Crie as instâncias dos apresentadores (Presenters) e conecte-os às visualizações
            TelaPrincipalPresenter telaPrincipalPresenter = new TelaPrincipalPresenter(telaPrincipalView);
            TelaInclusaoPresenter telaInclusaoPresenter = new TelaInclusaoPresenter(telaInclusaoView, funcionarioCollection);
            TelaConsultaPresenter telaConsultaPresenter = new TelaConsultaPresenter(telaConsultaView, telaVisualizacaoView, funcionarioCollection);
            TelaVisualizacaoPresenter telaVisualizacaoPresenter = new TelaVisualizacaoPresenter(telaVisualizacaoView);

            // Adicione itens de menu à Tela Principal
            JMenuBar menuBar = new JMenuBar();
            JMenu menuFuncionarios = new JMenu("Funcionários");
            JMenuItem menuInclusao = new JMenuItem("Inclusão");
            JMenuItem menuConsulta = new JMenuItem("Consulta");

            menuFuncionarios.add(menuInclusao);
            menuFuncionarios.add(menuConsulta);
            menuBar.add(menuFuncionarios);

            telaPrincipalView.setJMenuBar(menuBar);

            menuInclusao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    telaInclusaoView.setVisible(true);
                }
            });

            telaPrincipalView.setVisible(true);
        });
    }
}