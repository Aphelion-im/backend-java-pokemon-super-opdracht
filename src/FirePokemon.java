public class FirePokemon extends Pokemon {

    private double height;
    private double weight;

    public FirePokemon(String name, int level, int hp, String food, String sound, double height, double weight) {
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
    public void inferno() {
        System.out.println(this.getName() + " creates an inferno");
    }

    public void pyroBall() {
        System.out.println(this.getName() + " creates a pyro ball!");
    }
}
