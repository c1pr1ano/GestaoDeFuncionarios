package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaPrincipalView;

public class TelaPrincipalPresenter {
    private TelaPrincipalView view;

    public TelaPrincipalPresenter(TelaPrincipalView view) {
        this.view = view;
        this.view.setMenuInclusaoListener(new MenuInclusaoListener());
        this.view.setMenuConsultaListener(new MenuConsultaListener());
    }

    private class MenuInclusaoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // lógica Tela de Inclusão aqui.
        }
    }

    private class MenuConsultaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // lógica Tela de Consulta aqui.
        }
    }
}