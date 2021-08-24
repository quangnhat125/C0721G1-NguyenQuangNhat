package _07_abstract_class.thuc_hanh.Animal;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "Chicken: cuk-cuk";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}