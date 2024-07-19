package LambdaExpression;
@FunctionalInterface
interface interDemoII{
    public void add(int a, int b);
}
public class LambdaDemoII {
    public static void main(String[] args) {
        interDemoII it=(int a, int b)->{
            System.out.println("using Lambda ExpressionsZ");
            System.out.println("The Addition is :"+(a+b));
        };
        it.add(10,20);
    }
}
