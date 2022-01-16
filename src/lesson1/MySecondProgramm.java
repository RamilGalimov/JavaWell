package lesson1;

public class MySecondProgramm {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        int c = 5;

        boolean isRavnostoroniyTriangle = a == b && b == c && c == a;
        System.out.println(isRavnostoroniyTriangle);
    }
}
