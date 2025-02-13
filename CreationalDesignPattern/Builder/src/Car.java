class Car {
    private String engine;
    private String color;
    private int wheels;
    private boolean sunroof;

    // Constructor بيكون private عشان ما نقدرش نعمل object من غير builder.
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
        this.wheels = builder.wheels;
        this.sunroof = builder.sunroof;
    }

    // هنا ممكن نضيف getters لو عايزين نستخدم البيانات في أماكن تانية
    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    // 2. نعمل class builder:
    public static class CarBuilder {
        private String engine;
        private String color;
        private int wheels = 4;  // Default value
        private boolean sunroof = false;

        // Builder method عشان نحدد كل خصيصة للسيارة
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        // طريقة عشان نبني السيارة بالنهاية
        public Car build() {
            return new Car(this);
        }
    }
}