package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario , boolean metaBatida) {

        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerente nao pode ser promovido!");
        }
        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
        }
    }
}
