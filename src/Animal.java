public class Animal {
    String food;
    String location;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("Such an animal is making noise");
    }
    public void eat(){
        System.out.println("Such an animal is eating");
    }
    public void sleep(){
        System.out.println("Such an animal is sleeping");
    }


    public static void main(String[] main){
        Veterinary vet = new Veterinary();

        Animal[] animals;
        animals = new Animal[]{
                new Dog("Cats", "Dog House", true),
                new Cat("Mouses", "home", 100),
                new Horse("Grass", "Steppe", 43)
        };

        for(Animal animal:animals){
            vet.treatAnimal(animal);
            System.out.println();
        }


    }
}

class Veterinary{
    void treatAnimal(Animal animal){
        System.out.println("Treating animal information about " + animal.getClass());
        System.out.println("Food: " + animal.food);
        System.out.println("Location: " + animal.location);
    }
}

class Dog extends Animal{
    boolean isFriendly;
    public Dog(String food, String location, boolean isFriendly) {
        super(food, location);
        this.isFriendly = isFriendly;
    }
}


class Cat extends Animal{
    int purringVolume;
    public Cat(String food, String location, int purringVolume) {
        super(food, location);
        this.purringVolume = purringVolume;
    }
}


class Horse extends Animal{
    int hoofSize;
    public Horse(String food, String location, int hoofSize) {
        super(food, location);
        this.hoofSize = hoofSize;
    }
}

/*
Animals
 Create the Animal class and the Dog, Cat, Horse classes extending it.
The Animal class contains food, location variables and makeNoise, eat, sleep methods. The makeNoise method, for example, might print "Such an animal is sleeping" to the console.
Dog, Cat, Horse override the makeNoise, eat methods.
Add variables to the Dog, Cat, Horse classes that characterize only these animals.
Create a Veterinary class, in which define the void treatAnimal(Animal animal) method. Let this method print out the food and location of the animal that came to the reception.
In the main method, create an array of type Animal, in which write down the animals of all the types you have. In the cycle, send them to the vet.*/