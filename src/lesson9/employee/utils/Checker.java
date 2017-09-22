package lesson9.employee.utils;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class Checker {
    int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {
        if (companyNamesValidatedCount > 10) {
            return false;
        }
        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";
    }
}
