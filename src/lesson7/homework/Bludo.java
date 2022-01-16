package lesson7.homework;

import java.util.Set;

public class Bludo {
    private String name;
    private int weight;
    private int price;
    private String ingredients;
    private String photo;

    public Bludo() {
    }

    public Bludo(String name, int weight, int price, String ingredients, String photo) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.ingredients = ingredients;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
