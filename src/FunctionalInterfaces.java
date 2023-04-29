import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.Math.max;

@FunctionalInterface
interface ComparingTheNumbers{
    void comparing(int a,int b);

}
@FunctionalInterface
interface Multiplying{
    void carpma(int a,int b);
}


public class FunctionalInterfaces {
    public static void main(String[] args) {

       //cmp.comparing(2,7);

       //System.out.println(summing.summingTheNumbers(23, 45));

       //mty.carpma(45,50);

       //System.out.println(summing1.summingTheNumbers(23, 34));

       //talk.accept("Faruk");

        division.accept(25);

        System.out.println(exp.apply(8));
        System.out.println(exponential.apply(11));

        System.out.println(checkEven.test(67));

        System.out.println(getCheckEven.test(24));

    }

    static ComparingTheNumbers cmp=new ComparingTheNumbers() {
        @Override
        public void comparing(int a, int b) {
            int maxNumber=max(a,b);
            System.out.println(maxNumber);

        }
    };

    static ComparingTheNumbers cmp1= (a,b)-> System.out.println(max(a,b));
    static Summing summing=(a,b)-> a+b;

    static Summing summing1 =Integer::sum;

    static Multiplying mty=BasicOperations::multiply;

    static Consumer<String> talk=new Consumer<String>() {
        @Override
        public void accept(String name) {
            System.out.println("hello I am "+name);
        }
    };

    static Consumer<String> getTalk=(each-> System.out.println("hello I am "+each));

    static Consumer<Integer> division=new Consumer<Integer>() {
        @Override
        public void accept(Integer number) {
            if (number!=0)
                System.out.println(100/number);
            else
                System.out.println("sayı bölü sıfır tanımsızdır");


        }
    };

    static Consumer<Integer> getDivision=each->{
        if (each!=0)
            System.out.println(100/each);
        else
            System.out.println("sayı bölü sıfır tanımsızdır");

    };


    static Function<Integer,String> exp=n-> "ürün adedi: "+n;
    static Function<Integer,Integer>exponential=each->each*each;

    static Predicate<Integer> checkEven=each->each%2==0;

    static Predicate<Integer> getCheckEven=BasicOperations::isEven;





}