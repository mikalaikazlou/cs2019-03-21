package by.it.kozlov.lesson06;

/**
 * Created by user on 08.04.2019.
 */
public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}

    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
    }


