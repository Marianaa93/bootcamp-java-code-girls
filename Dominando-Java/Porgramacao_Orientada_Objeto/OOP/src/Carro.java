class Carro {

        String cor;
        String modelo;
        int capacidadeTanque;

        //construtor tem que estar abaixo dos atributos
    Carro(){

    }

    Carro(String cor,String modelo, int capacidadeTanque){
       this.cor = cor;
       this.modelo=modelo;
       this.capacidadeTanque=capacidadeTanque;

    }




    //depois vem o get e sets

     String getCor() {
        return cor;
    }

     void setCor(String cor) {
        this.cor = cor;
    }

     String getModelo() {
        return modelo;
    }

     void setModelo(String modelo) {
        this.modelo = modelo;
    }

     int getCapacidadeTanque() {
        return capacidadeTanque;
    }

     void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // método do total para encher o tanque

    double totalValorTanque(double valorCombustivel){
         return capacidadeTanque * valorCombustivel;


         //criar objeto

    }
}
