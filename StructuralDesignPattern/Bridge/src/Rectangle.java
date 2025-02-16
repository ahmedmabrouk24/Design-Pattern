class Rectangle implements Shape {
    private Color color;

    // Constructor بياخد اللون
    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Rectangle with color: ");
        color.applyColor();  // هنطبق اللون الخاص بالشكل
    }
}