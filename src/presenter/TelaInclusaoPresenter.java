package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaInclusaoView;

public class TelaInclusaoPresenter {
    private TelaInclusaoView view;

    public TelaInclusaoPresenter(TelaInclusaoView view) {
        this.view = view;
        this.view.setAdicionarButtonListener(new AdicionarButtonListener());
    }

    private class AdicionarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // lógica para adicionar um novo funcionário com os dados inseridos na Tela de Inclusão.
        }
    }
}