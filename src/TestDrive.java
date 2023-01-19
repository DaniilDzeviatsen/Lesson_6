public class TestDrive {
    public static void main(String[] args) {
        Triangle tr = new Triangle(3, 4, 5);
        tr.countPer();
        tr.countSquare();

        System.out.println(tr.getPer());
        System.out.println(tr.getSqr());
        Circle cir = new Circle(3);
        cir.countPer();
        cir.countSquare();
        System.out.println(cir.getPer());
        System.out.println(cir.getSqr());
        Rectangle rec = new Rectangle(5, 8);
        rec.countPer();
        rec.countSquare();
        System.out.println(rec.getPer());
        System.out.println(rec.getSqr());
        Figure[] arr = new Figure[5];
        arr[0] = new Circle(3);
        arr[1]=new Triangle(3,4,5);
        arr[2]=new Rectangle(3,4);
        arr[3]=new Circle(5);
        arr[4]=new Rectangle(5,6);
        double sum=0;
        for (int u=0; u<5; u++){
            arr[u].countPer();
            sum=sum+arr[u].getPer();
        }



        System.out.println(sum);
    }
}
