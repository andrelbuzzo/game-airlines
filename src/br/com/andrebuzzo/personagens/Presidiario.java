package br.com.andrebuzzo.personagens;

import br.com.andrebuzzo.exceptions.PresidiarioSemFiscalizacaoPolicialException;

import java.util.List;

public class Presidiario implements IPersonagem{
    @Override
    public void validarRestricoes(List<IPersonagem> personagens) throws PresidiarioSemFiscalizacaoPolicialException {
        boolean policialEstaFiscalizando = false;

        for(IPersonagem personagem : personagens)
            if(personagem instanceof Policial) {
                policialEstaFiscalizando = true;
                break;
            }

        if(!policialEstaFiscalizando)
            throw new PresidiarioSemFiscalizacaoPolicialException("O presidiário ficou sem a supervisão do policial.");
    }

    @Override
    public String getDescricao() {
        return "Presidiário";
    }
}
