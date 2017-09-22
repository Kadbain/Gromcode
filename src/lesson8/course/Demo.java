package lesson8.course;

import java.util.Date;


public class Demo {
    public static void main(String[] args) {

    }
    public Course createHighestParent() {
        Course course = new Course(new Date(), "Java Core", 8, "Andru",
                new Student[]{new Student("jenya", "Utkin", 2, new Course[]{}),
                              new Student("Vanya", "Putin", 2, new Course[]{})});
        return course;
    }
    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent= new SpecialStudent("Jenya", "Utkin", 2, new Course[]{}, 909,"ps1x0209@gmail.com");
        return specialStudent;
    }
}
