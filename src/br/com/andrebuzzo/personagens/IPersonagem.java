package br.com.andrebuzzo.personagens;

import br.com.andrebuzzo.exceptions.ComissariaPilotoSozinhosException;
import br.com.andrebuzzo.exceptions.OficialSozinhoComChefeServicoException;
import br.com.andrebuzzo.exceptions.PresidiarioSemFiscalizacaoPolicialException;

import java.util.List;

public interface IPersonagem {
    void validarRestricoes(List<IPersonagem> personagens) throws ComissariaPilotoSozinhosException, OficialSozinhoComChefeServicoException, PresidiarioSemFiscalizacaoPolicialException;
    String getDescricao();
}
