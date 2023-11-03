package presenter;

import view.TelaVisualizacaoView;

public class TelaVisualizacaoPresenter {
    private TelaVisualizacaoView view;

    public TelaVisualizacaoPresenter(TelaVisualizacaoView view) {
        this.view = view;
    }

    public void exibirFuncionario(String nome, String sobrenome, String cargo) {
        view.setFuncionario(nome, sobrenome, cargo);
    }
}