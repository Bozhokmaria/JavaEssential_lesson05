package practise;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 10, true);
        Animal animal1 = new Animal("Cat", 10, true);

        Animal animal2 = new Animal("Cat1", 11, true);

        System.out.println(animal.equals(animal1));
        System.out.println(animal.equals(animal2));
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal));

        System.out.println(animal.hashCode());
        System.out.println(animal1.hashCode());
        
        System.out.println(animal2.hashCode());
    }
}
