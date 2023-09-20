// https://bulbapedia.bulbagarden.net/wiki/Main_Page
public class Main {

    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 2, 200, "Berries", "Pika! Pika!", 2.11, 4);
        FirePokemon charmander = new FirePokemon("Charmander", 4, 401, "Fire berries", "Sound", 4, 3);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 5, 510, "Glass of water", "Water sound", 3, 8);
        GrassPokemon tangela = new GrassPokemon("Tangela", 7, 850, "Grass", "Grass sounds", 3, 10);

        // Subclass methods
        pikachu.electroBall();
        pikachu.thunderPunch();
        pikachu.eatFood();
        pikachu.makeSound();

        pikachu.superclassMethod();

    }

}
