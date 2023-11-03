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

import model.FuncionarioCollection;
import view.InclusaoFuncionarioView;

public class TelaInclusaoPresenter {
    private InclusaoFuncionarioView view;
    private FuncionarioCollection funcionarioCollection; // Modelo

    public TelaInclusaoPresenter(InclusaoFuncionarioView view, FuncionarioCollection funcionarioCollection) {
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