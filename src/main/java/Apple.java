class Apple implements Fruit {
    private String color;
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getInfo() {
        return "Apple[color=" + color + ", weight=" + weight + "]";
    }
}

