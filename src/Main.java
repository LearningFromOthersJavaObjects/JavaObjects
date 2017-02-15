import objects.objects.josker.superclass.Person;

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
        System.out.println(person.bailar(12,12));
        person.List();

        int i=1;
        int j=2;
        int k=3;
        int m=2;
        System.out.println ((j >= i) || (k == m));

        int il =7;
        char c= 'w';
        System.out.println((il >= 6) && (c == 'w'));

        byte  is = 1;
        byte js = 1;
        int ks = is+js;
        System.out.println(ks);

    }
}
