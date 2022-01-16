package myhomework4;

public class Option3 {
    public static void main(String[] args) {
//        Имеется адрес электонной почты:"altenGof@bk.ru"
//        1) Проверяем на наличие собачки:
        String email = "altenGof@bk.ru";
        if (email.indexOf("@") == 8) {
            System.out.println("Есть собачка!");
        }
//        2) Проверяем на наличие точки:
        if (email.contains(".")) {
            System.out.println("Есть точка!");
        }
//        3) Проверяем количество символов:
        int countCharacters = email.length();
        if (countCharacters < 15) {
            System.out.println("Символов меньше 15!");
        }
//        4) Проверяем окончание адреса почты:
        if (email.endsWith(".ru")) {
            System.out.println("Это адрес почты!");
        }
//        5) Проверяем правильгость начала адреса почты:
        if (email.startsWith(".")) {
            System.out.println("Данный адрес почты не подходит!");
        } else {
            System.out.println("Данный адрес почты подходит!");
        }
//        6) Проверяем количество заглавных букв:
        String alfabetUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int countUpperLetters = 0;
        for (int i = 0; i < email.length(); i++) {
            char currentCharFromEmail = email.charAt(i);
            if (alfabetUpper.contains(currentCharFromEmail + "")) {
                countUpperLetters++;
            }
        }
        System.out.println("Заглавных букв в адресе почты:" + countUpperLetters++);
//        7) Проверяем количество собачек:
        String[] splitByDog = email.split("@");
        if(splitByDog.length<=2){
            System.out.println("Адрес почты содержит одну собачку!");
        }


    }
}
