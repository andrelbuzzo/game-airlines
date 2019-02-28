package br.com.andrebuzzo.personagens.tests;

import br.com.andrebuzzo.exceptions.ComissariaPilotoSozinhosException;
import br.com.andrebuzzo.personagens.ChefeServico;
import br.com.andrebuzzo.personagens.Comissaria;
import br.com.andrebuzzo.personagens.IPersonagem;
import br.com.andrebuzzo.personagens.Piloto;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class ComissariaTest {

    @org.junit.Test(expected = ComissariaPilotoSozinhosException.class)
    public void deveLancarExcessaoParaPilotoComissariaSozinhos() throws Exception {
        IPersonagem comissaria = new Comissaria();

        List<IPersonagem> personagens = new ArrayList<>();
        personagens.add(new Piloto());
        personagens.add(new Comissaria());

        comissaria.validarRestricoes(personagens);
    }

    @org.junit.Test
    public void naoDeveLancarExcessaoParaPilotoComissariaAcompanhados() throws Exception {
        IPersonagem comissaria = new Comissaria();

        List<IPersonagem> personagens = new ArrayList<>();
        personagens.add(new Piloto());
        personagens.add(new Comissaria());
        personagens.add(new ChefeServico());

        comissaria.validarRestricoes(personagens);
    }

    @org.junit.Test
    public void deveRetornarDescricaoCorretaComissaria() throws Exception {
        IPersonagem comissaria = new Comissaria();
        Assert.assertEquals(comissaria.getDescricao(),"Comissária");
    }
}