package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public Integer codigo;
    public String nome;
    public String cpf;

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
