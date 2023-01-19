public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);


    }

    @Override
    double countPer() {
        per = 2 * (a + b);
        return per;
    }

    double getPer() {
        return per;
    }

    double countSquare() {
        sqr = a * b;
        return sqr;
    }

    double getSqr() {
        return sqr;
    }
}
