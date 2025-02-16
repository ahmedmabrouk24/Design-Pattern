public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());  // دائرة حمراء
        Shape blueRectangle = new Rectangle(new Blue());  // مستطيل أزرق

        redCircle.draw();  // هنطبع "Drawing Circle with color: Red"
        blueRectangle.draw();  // هنطبع "Drawing Rectangle with color: Blue"
    }
}
