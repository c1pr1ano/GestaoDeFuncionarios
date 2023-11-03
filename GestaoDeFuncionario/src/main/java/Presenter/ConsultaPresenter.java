/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presenter;

/**
 *
 * @author Natan
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Funcionario;
import model.FuncionarioCollection;
import view.ConsultaView;
//import view.TelaVisualizacaoView;
public class ConsultaPresenter {
    
    private ConsultaView view;
 //   private TelaVisualizacaoView telaVisualizacaoView;
    private FuncionarioCollection funcionarioCollection; // Declare a variável funcionarioCollection

    /**
     * @param view
     * @param telaVisualizacaoView
     * @param funcionarioCollection
     */
    
    public TelaConsultaPresenter(ConsultaView view, TelaVisualizacaoView telaVisualizacaoView, FuncionarioCollection funcionarioCollection) {
        this.view = view;
        this.telaVisualizacaoView = telaVisualizacaoView;
        this.funcionarioCollection = funcionarioCollection; // Inicialize funcionarioCollection

        this.view.setVisualizarButtonListener(new VisualizarButtonListener());
        this.view.setRemoverButtonListener(new RemoverButtonListener());
    }

    private class VisualizarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = view.getSelectedRow();
            if (selectedRow >= 0) {
                Funcionario funcionario = funcionarioCollection.consultarFuncionarios().get(selectedRow);
                telaVisualizacaoView.setFuncionario(funcionario.getNome(), funcionario.getSobrenome(), funcionario.getCargo);
                telaVisualizacaoView.setVisible(true);
            }
        }
    }

    private class RemoverButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = view.getSelectedRow();
            if (selectedRow >= 0) {
                funcionarioCollection.consultarFuncionarios().remove(selectedRow);
                view.atualizarTabela(funcionarioCollection.consultarFuncionarios());
            }
        }
    }
}
