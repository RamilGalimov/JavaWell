package lesson7.homework;

public class Menu {
    private String name;
    private Bludo[] bludos = new Bludo[100];

    public Menu() {
    }

    public Menu(String name, Bludo[] bludos) {
        this.name = name;
        this.bludos = bludos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bludo[] getBludos() {
        return bludos;
    }

    public void setBludos(Bludo[] bludos) {
        this.bludos = bludos;
    }

    public void containsBludo(Bludo bludo1) {
        for (int i = 0; i < bludos.length; i++) {
            if (bludos[i] == null) {
                bludos[i] = bludo1;
                break;
            }
        }

    }
}
