package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String password = "dfkj4kh";
        int countChars = password.length();
        if (countChars < 8) {
            System.out.println("Символов меньше 8!!!");
            return;
        }
        String alfabetUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int countUpperLetters = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentCharFromRassword = password.charAt(i);
            if (alfabetUpper.contains(currentCharFromRassword + "")) {
                countUpperLetters++;
            }
        }
        if (countUpperLetters == 0) {
            System.out.println("Пароль не содержит заглавную букву!!!");
            return;
        }
    }
}
