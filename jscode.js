// is-a Relationship
class Animal {
    sound() {
        console.log("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Dog "is-a" Animal
    wagTail() {
        console.log("Dog is wagging its tail");
    }
}

// has-a  Relationship
class Smartphone {
    constructor() {
        // Smartphone "has-a" Battery
        this.battery = new Battery();
    }
}

class Battery {
    charge() {
        console.log("Battery is charging");
    }
}

// uses-a Relationship 
class MusicPlayer {
    play(song) {
        // MusicPlayer "uses-a" Smartphone
        console.log(`Playing ${song}`);
    }
}

function main() {
    const dog = new Dog();
    dog.sound(); 
    dog.wagTail(); 

    const smartphone = new Smartphone();
    smartphone.battery.charge(); 

    const musicPlayer = new MusicPlayer();
    musicPlayer.play("My Favorite Song");
}

main();
