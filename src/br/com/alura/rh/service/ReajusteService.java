package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
        //vai executar cada uma das validaçoes
        this.validacoes.forEach(v -> v.validar(funcionario , aumento));

        BigDecimal salarioAjustado = funcionario.getSalario().add(aumento); // salarioAtual + aumento
        funcionario.atualizarSalario(salarioAjustado);
    }
}
