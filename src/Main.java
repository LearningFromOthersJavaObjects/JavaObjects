import objects.Person;

/**
 * Created by z on 14/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Person person2 = new Person();
        System.out.println(person2.getName()+ " " + person2.getLast_name()+" : "+ person2.getAge() + " years old");
        Person person = new Person("German ","Catro");
        person.saludar("Jhon");
        System.out.println(person.getName());
        Person person1=new Person(-45);
        System.out.println(person1.getAge());

    }
}
