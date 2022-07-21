class Main {
    public static void main(String[] args) {
        //Polimorfismo
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }
        System.out.println("");
    }

}
