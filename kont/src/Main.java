//import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
//        List<Person>personList = new LinkedList<>();
            List<Person>personList=new ArrayList<>();
            personList.add(new Person(
               "Andrzej","Kowalski",
                   LocalDate.of(1980,1,1)
            ));
        System.out.println(personList.get(0));
        personList.add(new Person(
                "Bartek","Kowalski",
                LocalDate.of(2010,5,12)
        ));        personList.add(new Person(
                "Ola","Kowalska",
                LocalDate.of(2012,8,7)
        ));
        personList.add(new Person(
           "Adam","Kowalski",
           LocalDate.of(2011,2,1)
        ));

        System.out.println(personList.get(0).adopt(personList.get(1)));
        System.out.println(personList.get(0).adopt(personList.get(1)));
        System.out.println(personList.get(0).adopt(personList.get(0)));
        System.out.println(personList.get(0).adopt(personList.get(2)));



        System.out.println(personList.size());
        for (Person p:personList){
            System.out.println(p);

            System.out.println();
            System.out.println(personList.get(0).getyoungestChild());
            System.out.println(personList.get(1).getyoungestChild());

            System.out.println(personList.get(0).getChildren());
        }
    }
}