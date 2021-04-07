package Clinic;

/**
 * Created by ameen on 3/21/2021.
 */
public class Appointment {
    private Patient PDetails;
    // private Doctors dDetails;
    private String date;
    private double price;

    public Appointment(Patient PDetails, String date, double price) {
        this.PDetails = PDetails;
        this.date = date;
        this.price = price;
    }

    public Patient getPDetails() {
        return PDetails;
    }

    public void setPDetails(Patient PDetails) {
        this.PDetails = PDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Appointment{" + "PDetails=" + PDetails
                + ", date=" + date + ", price=" + price + '}';
    }


}


