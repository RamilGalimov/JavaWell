package myhomework2;

public class Option4 {
    public static void main(String[] args) {
        int sumOddNumber=0;
        int quantityOddNumber=0;
        for(int i=0; i<=100; i++){
            if(i%2==1){
                sumOddNumber=sumOddNumber+i;
                quantityOddNumber++;
            }

        }
        System.out.println("Среднее значение всех нечетных чисел:"+(sumOddNumber/quantityOddNumber++));
    }
}
