package ss15_xulyngoaile_debug;

public class Triangle {
    private double canhA;
    private double canhB;
    private double canhC;

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    public Triangle(double canhA, double canhB, double canhC) throws IllegalTriangleException {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
        if (canhA < 0 || canhB < 0 || canhC < 0) {
            throw new IllegalTriangleException("Side cannot less than 0");
        }
        if (canhA + canhB < canhC || canhA + canhC < canhB || canhB + canhC < canhA) {
            throw new IllegalTriangleException("Sum of 2 side cannot less than remind side");
        }


    }

    public double getPerimeter() {
        return canhA + canhB + canhC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "canhA=" + canhA +
                ", canhB=" + canhB +
                ", canhC=" + canhC +
                '}';
    }
}
