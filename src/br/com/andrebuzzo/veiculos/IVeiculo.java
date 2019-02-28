package br.com.andrebuzzo.veiculos;

import br.com.andrebuzzo.exceptions.MotoristaNaoHabilitadoException;
import br.com.andrebuzzo.personagens.IPersonagem;

import java.util.List;

public interface IVeiculo {
    void setMotorista(IPersonagem motorista) throws MotoristaNaoHabilitadoException;
    void setCarona(IPersonagem carona);
    IPersonagem getMotorista();
    IPersonagem getCarona();
    List<IPersonagem> getTripulantes();
}
