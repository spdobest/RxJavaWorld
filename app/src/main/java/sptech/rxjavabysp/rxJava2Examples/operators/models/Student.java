package sptech.rxjavabysp.rxJava2Examples.operators.models;

public class Student {
    String name;
    String age;

    public Student(String name, String email,  String age,String registrationNo) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.registrationNo = registrationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    String email;
    String registrationNo;

}
