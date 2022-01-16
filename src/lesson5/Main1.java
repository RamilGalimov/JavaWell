package lesson5;

public class Main1 {
    public static void main(String[] args) {
        String email = "kshfdj@skdhf@lfj.codf";
        String[] splitByDog = email.split("@");
        if (splitByDog.length == 1) {
            System.out.println("Эмаил не содержит собачек!");
            return;
        }
        if (splitByDog.length > 2) {
            System.out.println("Эмаил содержит больше чем одну собачку!");
            return;
        }
        if (email.startsWith(".") || email.endsWith(".") || splitByDog[0].endsWith(".") || splitByDog[1].startsWith(".")) {

            System.out.println("В эмаиле точка не в нужном месте!");
            return;
        }
    }
}
