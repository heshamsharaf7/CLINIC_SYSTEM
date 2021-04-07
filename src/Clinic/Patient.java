package Clinic;

import UesClasses.DoublyLinkedList;

import java.util.ArrayList;

/**
 * Created by ameen on 3/21/2021.
 */
public class Patient extends Person {
    ArrayList<Patient> patient;
    DoublyLinkedList<Patient> list=new DoublyLinkedList<>();
    public Patient(String name, String Phone_no,
                   int person_id, String address, int age, String Gender) {
        super(name, Phone_no, person_id, address, age, Gender);
        patient=new ArrayList<>();
    }

    public Patient() {
        super();
    }


    public void Addpatient(String name, String Phone_no,
                           int person_id, String address, int age, String Gender){
        Patient b=new Patient(name, Phone_no, person_id, address, age, Gender);
        list.addFirst(b);
    }

    public Patient viewPatient()
    {

        return list.first();
    }
    public int numperOfPatient()

    {
       return list.size();
    }

    //     public Patient SearchPatient(int id)
//     {
//         for(Patient p:patient)
//         {
//         if(p.getPerson_id()==id){
//             return p;
//         }}
//         return null;  }
    public Patient SearchPatient(int id)
    {

        return null;
    }
    public Patient delatePatient()
    {

        return list.removeFirst();
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }


    public boolean editPatient( int id,String name, String Phone_no,
                                int person_id, String address, int age, String Gender)
    {
        for (int i = 0; i <patient.size() ; i++) {
            if (patient.get(i).getPerson_id()==id)
            { patient.get(i).editPatient(id, name, Phone_no, person_id, address, age, Gender);
                return  true;}
        }

        return false;
    }

//       public void addorder(int oID, String title, String desc, Student oStudent){
//     Order e= new Order(oID, title, desc, oStudent);
//       orders.add(e);
//
//   }
//    public String  viewOrders1()
//    {
//        return orders.toString();
//    }
//public void viewOrders()
//{
//    for (Order o:orders
//         ) {
//        System.out.println(o);
//    }
//}
//public Order searchOrder(int oID)
//{
//    for (Order o:orders
//         ) {
//        if(o.getoID()==oID)
//            return o;
//
//    }
//    return null;
//}
//
//public boolean deletOrder(int oID)
//{
//    for (int i = 0; i <orders.size() ; i++) {
//
//        if(orders.get(i).getoID()==oID)
//        { orders.remove(i);
//        return  true;}
//    }
//
//return false;
//
//
//}
//public boolean editOrder(int oID,String nTitle)
//    {
//        for (int i = 0; i <orders.size() ; i++) {
//            if (orders.get(i).getoID()==oID)
//            { orders.get(i).setTitle(nTitle);
//                return  true;}
//        }
//
//        return false;
//    }




}
