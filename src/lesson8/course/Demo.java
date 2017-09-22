package lesson8.course;

import java.util.Date;


public class Demo {
    public static void main(String[] args) {

    }
    public Student createHighestParent() {
        Student student = new Student("jenya", "Utkin", 2, new Course[]{});
        return student;
    }
    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent= new SpecialStudent("Jenya", "Utkin", 2, new Course[]{}, 909,"ps1x0209@gmail.com");
        return specialStudent;
    }
}
