Animal[] animals = new Animals[5];

animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();
//we can put any subclass of animal in the animal array

for (Animal animal : animals){
    animal.eat();
    animal.roam();
}