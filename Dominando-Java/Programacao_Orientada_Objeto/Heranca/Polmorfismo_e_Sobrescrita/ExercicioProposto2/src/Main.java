 class Main {
     public static void main(String[] args) {


         Funcionario funcionario = new Funcionario();

         /*Três upcasts
         É possivel fazer isso de forma implícita, pois, por exemplo, não haverá perda de dado.
         O que tem em Vendedor, terá, pelo menos uma parte, em Funcionário (classe mãe)
         (ler da direita para esquerda);*/

         Funcionario vendedor = new Vendedor();
         Funcionario gerente =  new Gerente();
         Funcionario faxineiro = new Faxineiro();

        /* Downcast: pega a mãe e transforma na filha (ler da direita para esquerda).

        Neste caso, "vendedor é uma subclasse de FUncionário, e provavelmente tem muitas
        informações de vendedor que não estão em Funcionario. Consequentemente, ao fazer o downcase
         de Funcionário para Vendedor, informações podem ser perdidades de vendedor, já que,
          o programa não saberá o que fazer com elas.
         */
//         Vendedor vendedor = (Vendedor) new Funcionario();


     }
}
