


public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    public double area() {
        return sideA * sideB;
    }

    public int compareTo(Rectangle other) {
        double thisArea = this.area();
        double otherArea = other.area();
        return Double.compare(thisArea, otherArea);
    }

    public boolean isSimilarTo(Rectangle other) {
        double thisRatio = this.sideA / this.sideB;
        double otherRatio = other.sideA / other.sideB;
        return Math.abs(thisRatio - otherRatio) < 0.0001;  // use a small epsilon to compare the ratios
    }
}
