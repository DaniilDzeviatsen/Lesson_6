public class Circle extends Figure {
    public Circle(int rad) {
        super(rad);


    }

    @Override
    double countPer() {
        per = 2 * 3.14 * rad;
        return per;
    }

    double getPer() {
        return per;
    }

    @Override
    double countSquare() {
        sqr = 3.14 * rad * rad;
        return sqr;
    }

    double getSqr() {
        return sqr;
    }
}
