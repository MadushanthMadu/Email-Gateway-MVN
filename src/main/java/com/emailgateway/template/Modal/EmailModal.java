package com.emailgateway.template.Modal;

public class EmailModal {

    private String FirstName;
    private String LastName;
    private String DOB;
    private String Gender;
    private String City;
    private String Tel_Number;
    private String Email;
    private String Profession;
    private String Skills;

    public EmailModal() {
    }

    public EmailModal(String firstName, String lastName, String DOB, String gender, String city, String tel_Number, String email, String profession, String skills) {
        FirstName = firstName;
        LastName = lastName;
        this.DOB = DOB;
        Gender = gender;
        City = city;
        Tel_Number = tel_Number;
        Email = email;
        Profession = profession;
        Skills = skills;
    }

    @Override
    public String toString() {
        return "FirstName = " + FirstName +
                "\nLastName = " + LastName +
                "\nDOB = " + DOB +
                "\nGender = " + Gender +
                "\nCity = " + City +
                "\nTel_Number = " + Tel_Number +
                "\nEmail = " + Email +
                "\nProfession = " + Profession +
                "\nSkills = " + Skills;
    }
}
