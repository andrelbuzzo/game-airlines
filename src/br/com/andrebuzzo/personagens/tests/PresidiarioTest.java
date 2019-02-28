package br.com.andrebuzzo.personagens.tests;

import br.com.andrebuzzo.exceptions.PresidiarioSemFiscalizacaoPolicialException;
import br.com.andrebuzzo.personagens.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PresidiarioTest {

    @Test(expected = PresidiarioSemFiscalizacaoPolicialException.class)
    public void deveLancarExcessaoPresidiarioSemFiscalizacaoPolicial() throws Exception {
        IPersonagem presidiario = new Presidiario();

        List<IPersonagem> personagens = new ArrayList<>();
        personagens.add(new Presidiario());
        personagens.add(new Oficial());
        personagens.add(new ChefeServico());
        personagens.add(new Comissaria());
        personagens.add(new Piloto());

        presidiario.validarRestricoes(personagens);
    }

    @Test(expected = PresidiarioSemFiscalizacaoPolicialException.class)
    public void deveLancarExcessaoPresidiarioSozinho() throws Exception {
        IPersonagem presidiario = new Presidiario();

        List<IPersonagem> personagens = new ArrayList<>();
        personagens.add(new Presidiario());

        presidiario.validarRestricoes(personagens);
    }

    @Test
    public void naoDeveLancarExcessaoPresidiarioComFiscalizacaoPolicial() throws Exception {
        IPersonagem presidiario = new Presidiario();

        List<IPersonagem> personagens = new ArrayList<>();
        personagens.add(new Presidiario());
        personagens.add(new Policial());
        personagens.add(new Oficial());
        personagens.add(new ChefeServico());
        personagens.add(new Comissaria());
        personagens.add(new Piloto());

        presidiario.validarRestricoes(personagens);
    }

    @Test
    public void deveRetornarDescricaoCorretaOficial() throws Exception {
        IPersonagem comissaria = new Presidiario();
        Assert.assertEquals(comissaria.getDescricao(),"Presidiário");
    }
}