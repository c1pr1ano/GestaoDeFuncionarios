package model;

import java.util.ArrayList;
import java.util.List;

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