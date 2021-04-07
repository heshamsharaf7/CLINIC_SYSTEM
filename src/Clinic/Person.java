package Clinic;

/**
 * Created by ameen on 3/21/2021.
 */
public  abstract class Person {
    String name;
    private  String Phone_no;
    private int  person_id;
    private String address;
    private int age;
    private String Gender;

    public Person(String name, String Phone_no, int person_id, String address, int age, String Gender) {
        this.name = name;
        this.Phone_no = Phone_no;
        this.person_id = person_id;
        this.address = address;
        this.age = age;
        this.Gender = Gender;
    }
    public Person(){};
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String Phone_no) {
        this.Phone_no = Phone_no;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name +
                ", Phone_no=" + Phone_no + ", person_id="
                + person_id + ", address=" + address +
                ", age=" + age + ", Gender=" + Gender + '}';
    }

}
