package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FuncionarioCollection;
import view.TelaInclusaoView;

public class TelaInclusaoPresenter {
    private TelaInclusaoView view;
    private FuncionarioCollection funcionarioCollection; // Modelo

    public TelaInclusaoPresenter(TelaInclusaoView view, FuncionarioCollection funcionarioCollection) {
        this.view = view;
        this.funcionarioCollection = funcionarioCollection;

        this.view.setAdicionarButtonListener(new AdicionarButtonListener());
    }

    private class AdicionarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Implemente a lógica para adicionar um novo funcionário com os dados inseridos na Tela de Inclusão.
        }
    }
}