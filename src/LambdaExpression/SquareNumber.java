package LambdaExpression;
interface square{
    void squr(int a);
}
public class SquareNumber {
    public static void main(String[] args) {
        square sq=(int a)->{
            System.out.println("Square of "+a+" is "+(a*a));
        };
        sq.squr(10);
    }

}
