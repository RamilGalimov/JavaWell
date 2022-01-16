package lesson7.homework;

public class Main<bludo1> {
    public static void main(String[] args) {
        Bludo bludo1 = new Bludo();

        bludo1.setName("Жареная говядина");
        bludo1.setWeight(400);
        bludo1.setPrice(500);
        bludo1.setIngredients("Говядина, масло, лук, соль, перец, кориандр");

        Bludo bludo2 = new Bludo();

        bludo2.setName("Курица Пикассо");
        bludo2.setWeight(350);
        bludo2.setPrice(300);
        bludo2.setIngredients("Курица, масло, лук, перец, помидоры, соль, сливки, сыр");

        Menu menu = new Menu();
        menu.setName("Горячие закуски");
        menu.containsBludo(bludo1);
        menu.containsBludo(bludo2);

    }
}
