class Main {
    public static void main(String[] args) {
        //Polimorfismo
        /* Ex. criado por mim: imagina uma casa com 3 filhas chamadas "Maria".
            Se a mãe falar: "Maria, escreva!".
            Todas as Marias irão escrever, mas de forma diferente e do jeito delas.
            */

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }
        System.out.println("");

        // expemplo de quando o método não está em todads as classes
        System.out.println(" Método não existe em todas as classes");
        for (ClasseMae classe : classes) {
            classe.metodo2();

            /* Haverá apenas polimorfismo na Classe Filha 2, pois ela tem esse método 2,
            mas definido de uma forma diferente. Então, quando a classeMãe chama o método, ele
            irá ser executado de forma diferente. Já no caso da Classe Filha 1, não existe este método.

            Ex. criado por mim: imagina uma mãe com filhas chamadas "Maria".
            Se a mãe falar: "Maria, escreva!".
            Todas as Marias irão escrever, mas de forma diferente e do jeito delas.
            Porém, se uma Maria não sabe escrever a palavra, ela copiará a Mãe.


             */

        }
        /* Sobrescrita Pura*/
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

            /*Aqui não haverá polimorfismo, pois trabalha diretamente com a
            classe em que o método exite. Começo a chamar o método2() da ClasseFilha2, ao invés
            do tipo da ClasseFilha2.
            Ex. Maria está independente e teve filhxs.
             */



    }

}
