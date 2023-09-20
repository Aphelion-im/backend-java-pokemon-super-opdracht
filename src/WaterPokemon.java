public class WaterPokemon extends Pokemon {

    private double height;
    private double weight;

    public WaterPokemon(String name, int level, int hp, String food, String sound, double height, double weight) {
        super(name, level, hp, food, sound);
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says " + this.getSound());
    }

    @Override
    public void eatFood() {
        System.out.println(this.getName() + " eats " + this.getFood());
    }

    // Attacks
    public void hydroPump() {
        System.out.println(this.getName() + " creates a hydro pump!");
    }

    public void rainDance() {
        System.out.println(this.getName() + " does a rain dance!");
    }
}
