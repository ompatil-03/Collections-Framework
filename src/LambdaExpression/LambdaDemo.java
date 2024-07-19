package LambdaExpression;
@FunctionalInterface
interface interDemo{
    public void disp();
}
public class LambdaDemo {
    public static void main(String[] args) {
        interDemo im=()->{
            System.out.println("Display Method using Lambda Expressions !");
        };
        im.disp();
    }
}
