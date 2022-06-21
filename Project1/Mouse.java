package Project1;

public class Mouse extends abstractAnimal {
    private String mouseColor;

    public Mouse(String mouseColor) {
        this.setMouseColor(mouseColor);
    }

    public String getMouseColor() {
        return mouseColor;
    }

    public void setMouseColor(String mouseColor) {
        this.mouseColor = mouseColor;
    }

    @Override
    public String makeSound() {
        return "chitz";
    }
}
