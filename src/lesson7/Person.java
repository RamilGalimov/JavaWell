package lesson7;

public class Person {
    //    1-поля класса
    private int age;
    private String name;
    private String surname;

    //    2-конструкторы (особый метод, который вызывается в момент создания объекта (после слова new))
    public Person() {

    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;

    }

    public Person(int age, String surname, String name) {
        this.age = age;
        this.name = name;
        this.surname = surname;

    }

    public Person(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return this.age;

    }
    //    3-методы
}
