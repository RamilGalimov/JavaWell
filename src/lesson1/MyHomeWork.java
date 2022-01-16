package lesson1;

public class MyHomeWork {
    public static void main(String[] args) {
        int money = 1000;
        int pricepizza = 230;
        int pricegum = 26;
        double pricecandy = 2.5;
        int numberpizza = money / pricepizza;
        int changeafterbuyingpizza = money - pricepizza * numberpizza;
        int numbergum = changeafterbuyingpizza / pricegum;
        int changeafterbuyingpizzaandgum = money - numberpizza * pricepizza - numbergum * pricegum;
        int numbercandy = (int) (changeafterbuyingpizzaandgum / pricecandy);
        System.out.println("Можем купить пицц:" + numberpizza);
        System.out.println("Можем купить жвачек:" + numbergum);
        System.out.println("Можем купить конфет:" + numbercandy);
        int finalchange = money - numberpizza * pricepizza - numbergum * pricegum - numbercandy * (int) pricecandy;
        System.out.println("Итоговая сдача:" + finalchange);
    }
}
