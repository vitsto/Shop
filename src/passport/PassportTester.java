package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PassportTester {
    public static void main(String[] args) {
        PassportTable passports = new PassportTable();
        Passport passport1 = new Passport("123", "Иванов", "Иван", "Иванович",
                LocalDate.of(1975, 1, 18));
        passports.addPassport(passport1);

        Passport passport2 = new Passport("456", "Петров", "Петр", "Петрович",
                LocalDate.of(1986, 9, 3));
        passports.addPassport(passport2);

        Passport passport3 = new Passport("123", "Сидоров", "Сидор", "Сидорович",
                LocalDate.of(2002, 1, 1));
        passports.addPassport(passport3);

        Passport passport4 = passports.getPassport("123");
        System.out.println(passport4);

    }
}
