public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);


    }

    @Override
    void countPer() {
        per = 2 * (a + b);

    }

    public double getPer() {
return per;
    }

    void countSquare() {
        sqr = a * b;

    }

    double getSqr() {
        return sqr;
    }
}
