package com.example.pattern.creational.Builder;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }else if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("Bhaskar Jha").setSubjects().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2).setAge(24).setName("Shreyash Jha").setFatherName("Suyash Jha").setMotherName("Suhani Jha").setSubjects().build();
    }

}
