package com.company;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    private static void filtr(Collection<Employer> c) {
        for(int i = 0; i < c.size(); i++) {
            Employer emp = c.get(i);
            if(c.get(i).getSalary() <= 4000) System.out.println(c.get(i));
        }
    }

    public static void main(String[] args) {
        Collection<Employer> collOfEmp = new LinkedList<>();

        collOfEmp.add(new Employer("Jan Kowalski", 4000));
        collOfEmp.add(new Employer("Monika Kwiatkowska", 3000));
        collOfEmp.add(new Employer("Janusz Drygała", 400));
        collOfEmp.add(new Employer("Krzysztof Nowak", 5000));
        collOfEmp.add(new Employer("Rafał Komorniczkowski", 40000));

        filtr(collOfEmp);
    }
}
