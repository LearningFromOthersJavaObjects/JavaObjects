package objects;

/**
 * Created by z on 14/02/17.
 */
public class Person {
    private String name;
    private String last_name;
    private int age;





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
    public void bailar(){}
    public void estudiar(){}
}
