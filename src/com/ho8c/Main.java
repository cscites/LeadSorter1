package com.ho8c;

import java.io.FileNotFoundException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        HashSet<Lead>leads = new LeadSetCreator("/home/chris/Desktop/AAN 2017/leads.csv").getLeadSet();


        for (Lead lead: leads) {
            System.out.print(lead.getPrefix() + " ");
            System.out.print(lead.getFirstName() + " ");
            System.out.println(lead.getLastName());
        }
    }
}

