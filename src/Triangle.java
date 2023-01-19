public class Triangle extends Figure{
        public Triangle(double a, double b, double c){
        super(a,b,c);


    }
    @Override
    double countPer() {
        per = a + b + c;
return per;
    }
    public double getPer(){

            return per;
            }
            public double getSqr(){
            return sqr;
            }
            public void setSide(double a, double b, double c){
            this.a=a;
            this.b=b;
            this.c=c;
            }

    @Override
    double countSquare() {
        p=per/2;
        sqr=Math.sqrt(p*(p-a)*(p-b)*(p-c));
return sqr;
    }
}
