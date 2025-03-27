import java.time.LocalDate;
import java.util.*;

public class Person implements Comparable<Person> {
    private final String name, surname;
    private final LocalDate birth;
    private final Set<Person> children;

    public Person(String name, String surname, LocalDate birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.children = new HashSet<>();
    }
    public boolean adopt(Person p){
        if(this ==p)
            return false;

       return children.add(p);
    }

    public Person getyoungestChild() {
        if (children.isEmpty())
            return null;

        return Collections.max(children);
//        Person youngest = null;
//        for (Person child : children) {
//            if (youngest == null || child.birth.isAfter(youngest.birth)) {
//                youngest = child;
//            }
//        }
//        return youngest;
       }

       public List<Person> getChildren(){
        return children.stream().sorted().toList();

       }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + birth +
                ", children=" + children +
                '}';
    }
    @Override
    public int compareTo(Person o){
        return this.birth.compareTo(o.birth);
        }
        public String getFullName(){
        return name +" "+ surname;
        }
    }

