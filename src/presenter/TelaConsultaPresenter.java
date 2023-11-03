package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaConsultaView;

public class TelaConsultaPresenter {
    private TelaConsultaView view;

    public TelaConsultaPresenter(TelaConsultaView view) {
        this.view = view;
        this.view.setVisualizarButtonListener(new VisualizarButtonListener());
    }

    private class VisualizarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // lógica para abrir a Tela de Visualização do funcionário selecionado na Tela de Consulta.
        }
    }
}