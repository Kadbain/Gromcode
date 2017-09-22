package lesson8.course;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String collegeName, int rating, long id, long secretKey, String email) {
        super(collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }
}
