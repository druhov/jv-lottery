package core.basesyntax;

class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Number: " + number;
    }
}
