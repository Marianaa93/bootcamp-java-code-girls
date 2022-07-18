public class Main {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;

        float f1 = 4.5f;
        float f2 = 3.7f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        // inteiros
        System.out.println("INTEIROS");
        System.out.println("i1>i2:" + (i1 > i2));
        System.out.println("i1<i2:" + (i1 < i2));
        System.out.println("i1==i2:" + (i1 == i2));
        System.out.println("i1>=i2:" + (i1 >= i2));


        //float
        System.out.println("FLOATS");
        System.out.println("f1>f2:" + (f1 > f2));
        System.out.println("f1<f2:" + (f1 < f2));
        System.out.println("f1==f2:" + (f1 == f2));
        System.out.println("f1>=f2:" + (f1 >= f2));

        System.out.println("CHARS");
        System.out.println("c1>c2:" + (c1 > c2));
        System.out.println("c1<c2:" + (c1 < c2));
        System.out.println("c1==c2:" + (c1 == c2));
        System.out.println("c1>=c2:" + (c1 >= c2));

        System.out.println("BOOLEANS");
        System.out.println("b1==b2:" + (b1 == b2));

        //operadores lógicos
        boolean b4 = true;
        boolean b5 = false;
        boolean b6 = true;
        boolean b7 = false;

        System.out.println("OPERAÇÕES LÓGICAS");
        System.out.println("b4&&b5:" + (b4 && b5));
        System.out.println("b4&&b6:" + (b4 && b6));
        System.out.println("b5||b6:" + (b5||b6));
        System.out.println("b4^b6:" + (b4^b6));
        System.out.println("b7^b4" + (b7^b4));
        System.out.println("!b4:" + (!b4));
        System.out.println("!b5:" + (!b5));
        System.out.println("(i1>i2)||(f2<f1):" +((i1>i2)||(f2<f1)));
        System.out.println("(i1+i2)<(f2-f1):" +((i1+i2)<(f2-f1)));





    }

}
