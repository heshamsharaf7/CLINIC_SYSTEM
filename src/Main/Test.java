package Main;

import Clinic.ManageApointment;
import Clinic.Patient;

/**
 * Created by ameen on 3/21/2021.
 */
public class Test {
    public static void main(String[] args) {
        Patient p=new Patient();
         p.Addpatient("Ameen","777878",101,"sana",30,"male");
         p.Addpatient("saif","777878",101,"sana",30,"male");
         p.Addpatient("Amehjen","777878",101,"sana",30,"male");
         p.Addpatient("Ameen","777878",101,"sana",30,"male");
         p.viewPatient();


    }



}
