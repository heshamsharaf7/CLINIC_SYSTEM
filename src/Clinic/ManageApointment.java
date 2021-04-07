package Clinic;

import java.util.ArrayList;

/**
 * Created by ameen on 3/21/2021.
 */
public class ManageApointment {
    ArrayList<Appointment> App ;

    public ManageApointment() {
        App=new ArrayList<>();
    }
    public void AddAppoointment( int ID,Patient PDetails, String date, double price)
    {

        Appointment D=new Appointment(PDetails, date, price);

//         for (Appointment f:App)
//          {
//          if( f.getPDetails() .getPerson_id()== ID)
//        {
//         D.setDate(date);
//        }
//        else {
        App.add(D);
    }
       /* if(PDetails.getPerson_id()== PDetails.getPerson_id())
        {
         D.setDate(date);
        }
        else {*/
    //App.add(D);//}


    public  void viewPatient()
    {
        for (Appointment f:App)
        {
            System.out.println(f);
        }
    }
    public String ViewAppointment()
    {
        return App.toString();
    }
    public Appointment searchPatient(int ID)
    {
        for (Appointment f:App)
        {
            if(f.getPDetails().getPerson_id()==ID)

                return f;

        }
        return null;
    }
    public boolean delateAppointement(int ID)
    {
        for (int i = 0; i <App.size() ; i++) {
            if(App.get(i).getPDetails().getPerson_id()==ID)
            { App.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean editAppointement(int Id,String date)
    {
        for (int i = 0; i <App.size() ; i++)
        {
            if(App.get(i).getPDetails().getPerson_id()==Id)
            {
                App.get(i).setDate(date);
                return true;
            }

        }
        return false;
    }
}
