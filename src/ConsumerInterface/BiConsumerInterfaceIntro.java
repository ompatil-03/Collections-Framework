package ConsumerInterface;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceIntro implements BiConsumer<Integer,String> {
    public static void main(String[] args) {
        BiConsumerInterfaceIntro bi=new BiConsumerInterfaceIntro();
        bi.accept(1,"java");

        BiConsumer<Integer,String>bc=(a,b)-> System.out.println(a+" :: "+b);
        bc.accept(2,"JavaScript");
    }
    @Override
    public void accept(Integer integer, String s) {
        System.out.println(integer+" :: "+s);
    }
}
