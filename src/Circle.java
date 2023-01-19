public class Circle extends Figure {
    public Circle(int rad) {
        super(rad);


    }

    @Override
    void countPer() {
        per = 2 * 3.14 * rad;

    }

    public double getPer() {
        return per;
    }

    @Override
    void countSquare() {
        sqr = 3.14 * rad * rad;

    }

    double getSqr() {
        return sqr;
    }
}
