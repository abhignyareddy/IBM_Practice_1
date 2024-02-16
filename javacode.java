// Animal class
class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound...");
    }
}

// Cat class inheriting from Animal
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

// House class
class House {
    private Room room;
    private String address;

    House(Room room, String address) {
        this.room = room;
        this.address = address;
    }

    void openDoor() {
        System.out.println("The door to " + address + " is open.");
    }

    void enterRoom() {
        System.out.println("Entering " + room.getName() + ".");
    }
}

// Room class
class Room {
    private String name;

    Room(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

// Chef class
class Chef {
    private String name;
    private Knife knife;

    Chef(String name, Knife knife) {
        this.name = name;
        this.knife = knife;
    }

    void cook() {
        System.out.println(name + " is cooking with her " + knife.getName() + ".");
    }
}

// Knife class
class Knife {
    private String name;

    Knife(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        //*is a relationship
        Animal cat = new Cat("Whiskers");
        cat.makeSound(); // Outputs "Whiskers makes a sound..."

        //*has a relationship
        Room livingRoom = new Room("Living Room");
        House house = new House(livingRoom, "123 Main St.");
        house.openDoor(); // Outputs "The door to 123 Main St. is open."
        house.enterRoom(); // Outputs "Entering Living Room."

        //*uses a relationship
        Chef chef = new Chef("Abhi", new Knife("Chef's Knife"));
        chef.cook(); // Outputs "Abhi is cooking with her Chef's Knife."
    }
}