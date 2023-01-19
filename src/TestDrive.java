public class TestDrive {
    public static void main(String[] args) {
        Triangle tr=new Triangle(3,4,5);



        System.out.println(tr.getPer());
        System.out.println(tr.getSqr());
        Circle cir=new Circle(3);
        cir.countPer();
        cir.countSquare();
        System.out.println(cir.getPer());
        System.out.println(cir.getSqr());
        Rectangle rec=new Rectangle(5,8);
        rec.countPer();
        rec.countSquare();
        System.out.println(rec.getPer());
        System.out.println(rec.getSqr());
        Figure [] arr=new Figure[5];
        arr [0]= new Triangle (3,7,9);
        arr[1]=new Circle(5);
        arr[2]=new Rectangle(4,6);
        arr[3]=new Circle(7);
        arr[4]=new Triangle(4,4,4);
        System.out.println(arr[0].getPer()+arr[1].getPer()+arr[2].per+arr[3].per+arr[4].per);
    }
}
