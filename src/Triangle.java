import java.sql.SQLOutput;

public class Triangle extends Figure {
    public Triangle(double a, double b, double c) {
        super(a, b, c);


    }

    @Override
    void countPer() {
        per = a + b + c;

    }

    double getPer(){
        return per;
    }

    public double getSqr() {
        return sqr;
    }



    @Override
    void countSquare() {
        p = per / 2;
        sqr = Math.sqrt(p * (p - a) * (p - b) * (p - c));


    }
}
