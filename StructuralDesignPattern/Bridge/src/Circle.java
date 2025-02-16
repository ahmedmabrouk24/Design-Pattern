class Circle implements Shape {
    private Color color;

    // Constructor بياخد اللون
    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle with color: ");
        color.applyColor();  // هنطبق اللون الخاص بالشكل
    }
}