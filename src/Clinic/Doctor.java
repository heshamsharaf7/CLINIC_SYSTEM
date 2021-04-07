package Clinic;

/**
 * Created by ameen on 3/21/2021.
 */
public class Doctor extends Person {
    private String detials;



    public String getDetials() {
        return detials;
    }

    public void setDetials(String detials) {
        this.detials = detials;
    }
    public Doctor(){
        super();};
    public Doctor(String name, String Phone_no,
                  int person_id, String address, int age, String Gender) {
        super(name, Phone_no, person_id, address, age, Gender);
    }
}
