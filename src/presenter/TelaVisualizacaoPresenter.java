package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaVisualizacaoView;

public class TelaVisualizacaoPresenter {
    private TelaVisualizacaoView view;

    public TelaVisualizacaoPresenter(TelaVisualizacaoView view) {
        this.view = view;
        this.view.getLimparButton().addActionListener((ActionListener) new LimparButtonListener());
    }

    private class LimparButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    
    }
}