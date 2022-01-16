package myhomework3;

public class Option4 {
    public static void main(String[] args) {
//        Есть массив символов
//        1) Вывести на консоль только гласные из этого массива
        char[] abcdef = {'a', 'b', 'c', 'd', 'e', 'f'};
        for(int i=0; i<abcdef.length;i++){
            if(abcdef[i]=='a'|| abcdef[i]=='e'){
                System.out.println(abcdef[i]);
            }
        }
    }
}
