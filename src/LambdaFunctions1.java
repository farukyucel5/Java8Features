import java.util.*;

public class LambdaFunctions1 {
    public static <set> void main(String[] args) {

       // List<Integer> numbers= Arrays.asList(1,2,3,2,4,5,1,5,5,6,7);
       // Set<Integer> uniqueNumbers=new HashSet<>();
       // List<Integer> nonDublicateNumbers=new ArrayList<>();
//
       // for (Integer each:numbers){
       //     if (uniqueNumbers.add(each))
       //         nonDublicateNumbers.add(each);
       // }
//
       // System.out.println(nonDublicateNumbers);
//
       // nonDublicateNumbers=numbers.stream().distinct().toList();
       // System.out.println(nonDublicateNumbers);


        //===================================================

     // List<Integer> numbers= Arrays.asList(1,2,3,2,4,5,1,5,5,6,7);
     // int maxNumber=Integer.MIN_VALUE;

     // for (Integer number:numbers){
     //     if (number>maxNumber)
     //         maxNumber=number;
     // }

     // System.out.println(maxNumber);

     // int maxNumber1=numbers.stream().max(Integer::compareTo).orElseThrow();
     // System.out.println(maxNumber1);

     // int minNumber=numbers.stream().min(Integer::compareTo).orElseThrow();
     // System.out.println(minNumber);

     // int maxNumber2=numbers.stream().reduce(Integer.MIN_VALUE,Integer::max);
     // System.out.println(maxNumber2);
     // int minNumber1=numbers.stream().reduce(Integer.MAX_VALUE,Integer::min);
     // System.out.println(minNumber1);



     // int sum=numbers.stream().reduce(0,Integer::sum);
     // System.out.println(sum);

     // int summation=0;

     // for (Integer each:numbers){
     //     summation+=each;
     // }
     // System.out.println(summation);

        //================================================

        List<String> stringList=Arrays.asList("apple","banana","orange","pear","fig","grape");

        List<String> stringList1=new ArrayList<>();

        for (String s:stringList){
            if (s.startsWith("f"))
                stringList1.add(s);
        }
        System.out.println(stringList1);

        stringList1=stringList.stream().filter(s->s.startsWith("f")).toList();
        System.out.println(stringList1);







    }
}
