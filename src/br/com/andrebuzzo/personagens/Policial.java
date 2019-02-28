package br.com.andrebuzzo.personagens;

import java.util.List;

public class Policial implements IPersonagem {

    @Override
    public void validarRestricoes(List<IPersonagem> personagens) {

    }

    @Override
    public String getDescricao() {
        return "Policial";
    }
}
