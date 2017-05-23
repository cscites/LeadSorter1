package com.ho8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException{
        String source;
        String specialty;
        String conference;
        String date;
        String prefix;
        String firstName;cd
        String middleName;
        String lastName;
        String degree;
        String company;
        String address1;
        String address2;
        String city;
        String state;
        String zip;
        String country;
        String phone;
        String fax;
        String email;
        String notes;
        String geoInt;
        String availability;
        String status;
        HashSet<Lead>leads = new HashSet<>();
        Scanner scanner = new Scanner(new File("/home/chris/Desktop/AAN 2017/leads.csv"));
        scanner.useDelimiter(",");
        scanner.nextLine();
        while(scanner.hasNextLine()){
            source = scanner.next();
            specialty = scanner.next();
            conference = scanner.next();
            date = scanner.next();
            prefix = scanner.next();
            firstName = scanner.next();
            middleName = scanner.next();
            lastName = scanner.next();
            degree = scanner.next();
            company = scanner.next();
            address1 = scanner.next();
            address2 = scanner.next();
            city = scanner.next();
            state = scanner.next();
            zip = scanner.next();
            country = scanner.next();
            phone = scanner.next();
            fax = scanner.next();
            email = scanner.next();
            notes = scanner.next();
            geoInt = scanner.next();
            availability = scanner.next();
            status = scanner.next();
            Lead candidate = new Lead(source, specialty, conference, date, prefix, firstName, middleName,
                    lastName, degree, company, address1, address2, city, state, zip, country, phone, fax,
                    email, notes, geoInt, availability, status);
            leads.add(candidate);
            scanner.nextLine();

        }
        scanner.close();

        for (Lead lead: leads) {
            System.out.print(lead.getPrefix() + " ");
            System.out.print(lead.getFirstName() + " ");
            System.out.println(lead.getLastName());
        }



    }
}

