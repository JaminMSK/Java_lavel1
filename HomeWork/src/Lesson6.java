public class Lesson6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Murzik"),
                new Dog("Bobik")
        };
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    public  int run() {
        return  200;
    }
    @Override
    public  String swim() {
        return "кот не умеет плавать";
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    public  int run() {
        return  500;
    }
    @Override
    public  String swim() {
        return  "10м.";
    }
}

interface IAnimal {
    int run();
    String swim();
}

 abstract class Animal implements IAnimal{
    protected String name;

    Animal(String name){
        this.name = name;
    }
     @Override
     public  String toString() {
         return name + " " + "может пройти: " + run() + "м. и " + " может проплыть: " + swim();
     }
}