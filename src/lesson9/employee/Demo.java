package lesson9.employee;

import lesson9.employee.utils.Checker;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Company company = new Company("Artem", "Ukraine");
        System.out.println(company.getCountryFounded());
        System.out.println(company.getName());

//        company.name = "IBM";

        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.getName()));
//        System.out.println(checker.companyNamesValidatedCount);

    }
}
