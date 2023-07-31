package com.cc.java;

public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(){
        
    }

    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String value) {
        switch (value) {
            case "firstName":
                return this.firstName;
            case "role":
                return this.role;
            case "familyName":
                return this.familyName;
            case "yearOfEntry":
                return String.valueOf(yearOfEntry);
            default:
                return "Unknown value.";
        }
    }
}
