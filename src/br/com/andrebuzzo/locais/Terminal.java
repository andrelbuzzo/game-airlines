package br.com.andrebuzzo.locais;

import br.com.andrebuzzo.personagens.IPersonagem;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private List<IPersonagem> personagens;

    public Terminal(){
        this.personagens = new ArrayList<IPersonagem>();
    }

    public List<IPersonagem> getPersonagens() {
        return personagens;
    }

    public void addPersonagem(IPersonagem personagem){
        if(personagem != null)
            this.personagens.add(personagem);
    }

    public void removerPersonagem(IPersonagem personagem){
        this.personagens.remove(personagem);
    }
}
