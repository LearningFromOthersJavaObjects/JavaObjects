package objects.objects.josker.superclass;

import java.util.ArrayList;

/**
 * Created by z on 14/02/17.
 */
public class Person {
    private String name;
    private String last_name;
    private int age;
    private String addrees;
    private  String country;

    public Person(String name, String last_name, int age, String addrees, String country) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.addrees = addrees;
        this.country = country;
    }

    public String getAddrees() {
        return addrees;

    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Person() {
        name="German";
        last_name="Castro vilchez";
        age=21;

    }

    public Person(String name, String last_name) {
        this.name = name;
        this.last_name = last_name;
    }

    public Person(int age) {
        if (age>0){
            this.age = age;

        }else {
            System.out.println("Edad debe ser mayor a 0");
            this.age=0;
        }
    }


    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void saludar(String saludo){
        System.out.println("Buenos dias "+ saludo);
    }
    public void cantar(){
    }
    public int bailar(int pasos, int vueltas){
        if (pasos>0){
            setAge(5);
            setName("German");
            System.out.println(getName()+ " " +getAge()  );
        }else {
            setAge(0);
        }
       return pasos*vueltas;

    }
    public void List(){
        ArrayList<Person> personArrayList= new ArrayList<Person>();
        personArrayList.add(new Person("Rusbles","Ccaca",13,"jr junin","juliaca"));
        personArrayList.add(new Person("Yuselenin","Anquise",13, "Jiron junin","Juliaca"));
        for (Person person:
             personArrayList) {
            System.out.println(getName()+" " +getLast_name() +" "+getAge() + " " + getAddrees() +" " + getCountry());
        }

    }

}
