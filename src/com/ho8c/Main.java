package com.ho8c;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
       LeadSetCreator test = new LeadSetCreator("C:/Users/chris.sites/Desktop/PLink Documents/AAN 2017/leads.csv");
       ClientSetCreator cTest = new ClientSetCreator("C:/Users/chris.sites/Desktop/clientList.csv");
       ArrayList<Lead> leads = test.getLeadSet();
       ArrayList<Client> clients = cTest.getClientSet();
       String[] headers = test.getHeaders();
       String[] clientHeaders = cTest.getHeaders();

        for (String heads:headers) {
            System.out.print(heads + " | ");
        }
        System.out.println();

        for (Lead lead: leads) {
            System.out.print("Source: " + lead.getSource() + " | ");
            System.out.print("Specialty: " + lead.getSpecialty() + " | ");
            System.out.print("Conference: " + lead.getConference() + " | ");
            System.out.print("Date:" + lead.getDate() + " | ");
            System.out.print("Prefix: " + lead.getPrefix() + " | ");
            System.out.print("First Name: " + lead.getFirstName() + " | ");
            System.out.print("Middle Name: " + lead.getMiddleName() + " | ");
            System.out.print("Last Name: " + lead.getLastName() + " | ");
            System.out.print("Degree: " + lead.getDegree() + " | ");
            System.out.print("Company: " + lead.getCompany() + " | ");
            System.out.print("Address 1: " + lead.getAddress1() + " | ");
            System.out.print("Address 2: " + lead.getAddress2() + " | ");
            System.out.print("City: " + lead.getCity() + " | ");
            System.out.print("State: " + lead.getState() + " | ");
            System.out.print("Zip: " + lead.getZip() + " | ");
            System.out.print("Country: " + lead.getCountry() + " | ");
            System.out.print("Phone#: " + lead.getPhone() + " | ");
            System.out.print("Fax#: " + lead.getFax() + " | ");
            System.out.print("E-Mail: " + lead.getEmail() + " | ");
            System.out.print("Notes: " + lead.getNotes() + " | ");
            System.out.print("Geo Int: " + lead.getGeoInt() + " | ");
            System.out.print("Availability: " + lead.getAvailability() + " | ");
            System.out.println("Pro Status: " + lead.getStatus());
        }

        System.out.println(leads.size());

        for (String heads:clientHeaders) {
            System.out.print(heads + " | ");
        }
        System.out.println();

        for (Client client: clients) {
            System.out.print("Opportunity Name: " + client.getOpportunityName() + " | ");
            System.out.print("Type: " + client.getType() + " | ");
            System.out.println("Account Name: " + client.getAccountName() + " | ");
        }
        System.out.println(clients.size());
    }
}

