import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaFunctions {
    public static void main(String[] args) {
        List<String> users=new ArrayList<>();
        users.add("Mert");
        users.add("Faruk");
        users.add("Salih");
        users.add("Akif");
        users.add("Burak");

        users.forEach(n-> System.out.println(n));
        users.forEach(System.out::println);
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(6);

        List<Integer> filteredList=numbers.stream().filter(each->each%2==0).filter(each->each%3==0).toList();
        System.out.println(filteredList);
        List<Integer>filteredList1=numbers.stream().filter(each->each%2==1).toList();
        System.out.println(filteredList1);
        List<String> users1=users.stream().filter(each->each.length()>=5).toList();
        System.out.println(users1);

        Optional<Integer> summation=numbers.stream().reduce(Integer::sum);
        System.out.println(summation);
        Optional<Integer> multiply=numbers.stream().reduce((a,b)->a*b);
        System.out.println(multiply);

        List<Integer> numbers2=new ArrayList<>();

        numbers.forEach(n->numbers2.add(n*2));

        List<Integer>filteredList2=numbers.stream().filter(n->n%2==0).filter(n->n%3==0).toList();
        System.out.println(filteredList2);

        List<Integer>filteredList3=numbers.stream().map(p->p*p).toList();
        System.out.println(filteredList3);

        List<Integer> summation1=numbers.stream().reduce(Integer::sum).stream().toList();

        System.out.println(summation1);










    }
}
