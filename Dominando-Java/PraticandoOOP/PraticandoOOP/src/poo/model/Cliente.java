package poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Cliente extends Pessoa {
    public String numCartao;
       private List<Endereco> enderecos;

    public void adiconaEndereco(Endereco endereco){
        if (endereco ==null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        //validando campos
        if(endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco);
    }


    private List<Endereco> getEnderecos() {
        if (enderecos ==null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
