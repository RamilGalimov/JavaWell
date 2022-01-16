package lesson5;

public class MathOperations {
    /**
     * 1-модификатор доступа (одно из 4-х слов)
     * public-виден всему проекту, то есть открыт
     * ________-видно внутри пакета
     * protected-видно внутри пакета и дочерним классам
     * private-виден только внутри текущего класса
     * 2-static (ставится или нет)
     * 3-возвращаемый тип (пример int, String или слово void если его нет)
     * 4-название метода
     * 5-входящие параметры (int a, String name)
     * 6-тело выполнения метода
     */
    public static int perimetrTreug(int a, int b, int c) {
        return a + b + c;
    }
}
