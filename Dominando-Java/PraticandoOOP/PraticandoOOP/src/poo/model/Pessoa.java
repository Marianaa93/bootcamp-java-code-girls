package poo.model;

public class Pessoa {

    public  enum TipoPessoa{FISICA, JURIDICA}
    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser vazio");
        }
        this.documento = documento;
    }
}
