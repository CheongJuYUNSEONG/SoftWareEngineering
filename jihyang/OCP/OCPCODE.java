package jihyang.OCP;

public class OCPCODE {
	    public static void main(String[] args) {
	    	HelloAnimal hello = new HelloAnimal();

	        Animal cat = new Cat();
	        Animal dog = new Dog();

	        Animal sheep = new Sheep();
	        Animal lion = new Lion();

	        hello.hello(cat);
	        hello.hello(dog);
	        hello.hello(sheep);
	        hello.hello(lion);
	    }
}
abstract class Animal {
    abstract void speak();
}

class Cat extends Animal {
    void speak() {
        System.out.println("냐옹");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Sheep extends Animal {
    void speak() {
        System.out.println("매에에");
    }
}

class Lion extends Animal {
    void speak() {
        System.out.println("어흥");
    }
}
class HelloAnimal {
    void hello(Animal animal) {
        animal.speak();
    }
}
