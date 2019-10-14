package com.example.personactivity;

import com.example.personactivity.Person;

public class PersonData {

    private Person data;
    public PersonData()
    {
        data=new Person("Somya Singh","Ucc cork","123456654","somya.jpg",
        "http://www.cs.ucc.ie");
    }

    public Person getData()
    {
        return data;
    }

}
