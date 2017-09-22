package lesson8.course;

import java.util.Date;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class Demo {
    public SpecialStudent createHighestParent() {
        SpecialStudent course = new Course(new Date(), "Java Core", 8, "Andru",
                new Student[]{new Student("jenya", "Utkin", 2, new Course[] {})});
        return course;
    }
    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent= new SpecialStudent();
    }
}
