package lesson9.employee;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class Company {
    private String name;
    private String countryFounded;

    protected String code;

    public int someField;

    public Company(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    public String getName() {
        return name;
    }


    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
