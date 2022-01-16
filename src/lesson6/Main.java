package lesson6;

public class Main {
    public static void main(String[] args) {
//        формула создания объекта
        Treugolnik tr1 = new Treugolnik();
        Treugolnik tr2 = new Treugolnik();
        tr1.setA(12);
        tr1.setB(10);
        tr1.setC(12);

        tr2.setA(5);
        tr2.setB(6);
        tr2.setC(7);
        System.out.println(tr1.ploshad());
        System.out.println(tr2.ploshad());
    }
}
