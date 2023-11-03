/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Natan
 */

public class FuncionarioCollection {
    private List<Funcionario> funcionarios;

    public FuncionarioCollection() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> consultarFuncionarios() {
        return new ArrayList<>(funcionarios); // Retorna uma cópia da lista para evitar alterações diretas.
    }
}
