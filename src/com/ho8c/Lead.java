package com.ho8c;

/**
 * Created by chris on 5/21/17.
 */
public class Lead {
    private String source;
    private String specialty;
    private String conference;
    private String date;
    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String degree;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String fax;
    private String email;
    private String notes;
    private String geoInt;
    private String availability;
    private String status;
    public Lead(String source, String specialty, String conference, String date, String prefix, String firstName,
                String middleName, String lastName, String degree, String company, String address1,
                String address2, String city, String state, String zip, String country,
                String phone, String fax, String email, String notes, String geoInt,
                String availability, String status){
        this.source = source;
        this.specialty = specialty;
        this.conference = conference;
        this.date = date;
        this.prefix = prefix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.degree = degree;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.notes = notes;
        this.geoInt = geoInt;
        this.availability = availability;
        this.status = status;
    }

    public String getSource(){
        return source;
    }

    public String getSpecialty(){
        return specialty;
    }

    public String getConference(){
        return conference;
    }

    public String getDate(){
        return date;
    }

    public String getPrefix(){
        return prefix;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDegree(){
        return degree;
    }

    public String getCompany(){
        return company;
    }

    public String getAddress1(){
        return address1;
    }

    public String getAddress2(){
        return address2;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZip(){
        return zip;
    }

    public String getCountry(){
        return country;
    }

    public String getPhone(){
        return phone;
    }

    public String getFax(){
        return fax;
    }

    public String getEmail(){
        return email;
    }

    public String getNotes(){
        return notes;
    }

    public String getGeoInt(){
        return geoInt;
    }

    public String getAvailability(){
        return availability;
    }

    public String getStatus(){
        return status;
    }
}

