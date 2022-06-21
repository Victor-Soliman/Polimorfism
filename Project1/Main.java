package Project1;

public class Main {
    public static void main(String[] args) {
        iAnimal myCat = new Cat();
        iAnimal myDog = new Dog();
        Mouse myMouse = new Mouse("Brown");

        System.out.println("Voce pisica : " + myCat.makeSound());
        System.out.println("Voce caine : " + myDog.makeSound());
        System.out.println("Voce soarece : " + myMouse.makeSound());

        System.out.println("Culoare soarece : " + myMouse.getMouseColor());
    }
}
