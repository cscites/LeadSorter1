package com.ho8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by chris on 5/23/17.
 */
public class LeadSetCreator {
    private HashSet<Lead>leads = new HashSet<>();
    public LeadSetCreator(String source) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(source));
        scanner.useDelimiter(",");
        scanner.nextLine();
        while(scanner.hasNextLine()){
            String showSource = scanner.next();
            String specialty = scanner.next();
            String conference = scanner.next();
            String date = scanner.next();
            String prefix = scanner.next();
            String firstName = scanner.next();
            String middleName = scanner.next();
            String lastName = scanner.next();
            String degree = scanner.next();
            String company = scanner.next();
            String address1 = scanner.next();
            String address2 = scanner.next();
            String city = scanner.next();
            String state = scanner.next();
            String zip = scanner.next();
            String country = scanner.next();
            String phone = scanner.next();
            String fax = scanner.next();
            String email = scanner.next();
            String notes = scanner.next();
            String geoInt = scanner.next();
            String availability = scanner.next();
            String status = scanner.next();
            Lead candidate = new Lead(showSource, specialty, conference, date, prefix, firstName, middleName,
                    lastName, degree, company, address1, address2, city, state, zip, country, phone, fax,
                    email, notes, geoInt, availability, status);
            leads.add(candidate);
            scanner.nextLine();

        }
        scanner.close();
    }


    HashSet getLeadSet(){
        return leads;
    }
}
