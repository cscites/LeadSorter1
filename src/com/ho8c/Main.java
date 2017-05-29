package com.ho8c;

import java.io.FileNotFoundException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       HashSet<Lead>leads = new LeadSetCreator("/home/chris/Desktop/AAN 2017/leads.csv").getLeadSet();


        for (Lead lead: leads) {
            System.out.print(lead.getSource() + " | ");
            System.out.print(lead.getSpecialty() + " | ");
            System.out.print(lead.getConference() + " | ");
            System.out.print(lead.getDate() + " | ");
            System.out.print(lead.getPrefix() + " | ");
            System.out.print(lead.getFirstName() + " | ");
            System.out.print(lead.getMiddleName() + " | ");
            System.out.print(lead.getLastName() + " | ");
            System.out.print(lead.getDegree() + " | ");
            System.out.print(lead.getCompany() + " | ");
            System.out.print(lead.getAddress1() + " | ");
            System.out.print(lead.getAddress2() + " | ");
            System.out.print(lead.getCity() + " | ");
            System.out.print(lead.getState() + " | ");
            System.out.print(lead.getZip() + " | ");
            System.out.print(lead.getCountry() + " | ");
            System.out.print(lead.getPhone() + " | ");
            System.out.print(lead.getFax() + " | ");
            System.out.print(lead.getEmail() + " | ");
            System.out.print(lead.getNotes() + " | ");
            System.out.print(lead.getGeoInt() + " | ");
            System.out.print(lead.getAvailability() + " | ");
            System.out.println(lead.getStatus());
        }

        System.out.println(leads.size());
    }
}

