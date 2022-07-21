package poo.model;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep="0000";

        //dados do endereço
        Cliente cliente = new Cliente();



        cliente.adiconaEndereco(endereco);

        System.out.println("Endereço add com sucesso!");
    }
}
