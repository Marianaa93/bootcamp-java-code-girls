package definindo_variaveis;

public class Main {
    public static void main(String[] args) {

        System.out.println("Variáveis");
        variaveis();
        System.out.println("PrePos");
        prePos();

        System.out.println("Aritimético");
        aritimetico();

        System.out.println("Atribuição");
        atribuicao();

        System.out.println("Precedência");
        precedencia();

    }

    private static void variaveis() {
        int i = 2;
        int I = 2;
        final int CONSTANTE_VARIAVEL = 4;
        System.out.println("i:" + i);
        System.out.println("I:" + I);
        System.out.println("Constante:" + CONSTANTE_VARIAVEL);

//        Tipos de variáveis
        byte b = 14;
        short s = 15785;
        int m = 15;
        float n = 0.25F;
        double d = 0.2654156415145415415415441454;
        System.out.println("b:" + b);
        System.out.println("s:" + s);
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("d:" + d);

//        Textual
        char c = 'T';
        String str = "Bootcamp code girls";

//        Boolean
        boolean w = true;


        System.out.println("c:" + c);
        System.out.println("str:" + str);
        System.out.println("w:" + w);


    }

    private static void prePos() {
        int k = 10;

        int i = ++k;
        int j = k++;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }

    private static void aritimetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = c % b;

        System.out.println("r1:" + r1);
        System.out.println("r2:" + r2);
        System.out.println("r3:" + r3);
        System.out.println("r4:" + r4);
    }

    private static void atribuicao() {
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);

        i += 5; //i=i+5
        j -= 3; //j=j-3
        d /= 2.7d; //d = d/2.7d
        l *= 3; // l=l*3
        k %= 2; // k=k%2

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;
        System.out.println("k atual:" + k);
        System.out.println("i atual:" + i);
    }

    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10+19*30->580
        System.out.println(" i++ + --j * k:" + a);

        int b = k / --i % 3 + 1; //30/10%3+1->1
        System.out.println("B:" + b);
        int c = 2;
        c *= i += 5; // c=2*i; i=i+5-> c=2*i; i=10+5; -> c=2*15;c=30
        System.out.println("c:" + c);

    }


}



