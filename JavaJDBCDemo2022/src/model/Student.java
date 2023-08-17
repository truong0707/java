/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
// Viết code sao dữ liệu student từ DB đổ về Class Student. Viet class Student gom các 
// thuộc name, course
public class Student {
    private String no;
    private String name;
    private String course;

    public Student() {
    }

    public Student(String no, String name, String course) {
        this.no = no;
        this.name = name;
        this.course = course;
    }
    
    // insert code --> Getter and Setter --> set all

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    // insert code  -> toString()

    @Override
    public String toString() {
        return "Student{" + "no=" + no + ", name=" + name + ", course=" + course + '}';
    }
    
    
}
