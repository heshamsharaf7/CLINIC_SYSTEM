package Clinic;

import UesClasses.DoublyLinkedList;

import java.util.ArrayList;

/**
 * Created by ameen on 3/21/2021.
 */
public class Patient extends Person {

    DoublyLinkedList<Patient> list=new DoublyLinkedList<>();
    public Patient(String name, String Phone_no,
                   int person_id, String address, int age, String Gender) {
        super(name, Phone_no, person_id, address, age, Gender);

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


    public Patient delatePatient()
    {

        return list.removeFirst();
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }}



