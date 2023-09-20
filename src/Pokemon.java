public abstract class Pokemon {
    // Fields
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;

    // Constructor
    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    // Getters/accessors & Setters/mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void superclassMethod() {
        System.out.println("This is a method from the superclass!");
    }

    // Abstract methods
    public abstract void makeSound();

    public abstract void eatFood();


}
