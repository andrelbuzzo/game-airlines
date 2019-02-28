package br.com.andrebuzzo.veiculos.tests;

import br.com.andrebuzzo.exceptions.MotoristaNaoHabilitadoException;
import br.com.andrebuzzo.personagens.ChefeServico;
import br.com.andrebuzzo.personagens.Comissaria;
import br.com.andrebuzzo.personagens.Piloto;
import br.com.andrebuzzo.personagens.Policial;
import br.com.andrebuzzo.veiculos.IVeiculo;
import br.com.andrebuzzo.veiculos.SmartFortwo;
import org.junit.Test;

public class SmartFortwoTest {
    @Test(expected = MotoristaNaoHabilitadoException.class)
    public void deveLancarExcessaoMotoristaNaoHabilitado() throws MotoristaNaoHabilitadoException {
        IVeiculo smart = new SmartFortwo();
        smart.setMotorista(new Comissaria());
    }

    @Test
    public void naoDeveLancarExcessaoMotoristaPiloto() throws MotoristaNaoHabilitadoException {
        IVeiculo smart = new SmartFortwo();
        smart.setMotorista(new Piloto());
    }

    @Test
    public void naoDeveLancarExcessaoMotoristaChefeServico() throws MotoristaNaoHabilitadoException {
        IVeiculo smart = new SmartFortwo();
        smart.setMotorista(new ChefeServico());
    }

    @Test
    public void naoDeveLancarExcessaoMotoristaPolicial() throws MotoristaNaoHabilitadoException {
        IVeiculo smart = new SmartFortwo();
        smart.setMotorista(new Policial());
    }
}