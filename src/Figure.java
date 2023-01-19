public abstract class Figure {
   protected double a,b,c, rad,per,sqr, p;
    public Figure(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public Figure(double a, double b){
        this.a=a;
        this.b=b;

    }
    public Figure(double rad){
        this.rad=rad;
    }
    abstract double countPer();
    abstract double countSquare();

public double getPer(){
    return per;
}
}
