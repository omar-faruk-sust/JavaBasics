package Animal;

public class Dog extends Animal {
    private String color;
    private String name;

    public Dog(String name, boolean veg, String food, int legs) {
        super(name, veg, food, legs);
        this.color = "White";
        this.name = name;
    }

    public Dog(String name, boolean veg, String food, int legs, String color){
        super(name, veg, food, legs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String getNickName() {
        return "Jhon";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
