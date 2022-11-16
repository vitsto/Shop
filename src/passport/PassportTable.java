package passport;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PassportTable {
    Set<Passport> passports;

    public PassportTable() {
        this.passports = new HashSet<>();
    }

    public void addPassport(Passport passport) {
        if (!passports.add(passport)) {
            passports.remove(passport);
            passports.add(passport);
        }
    }

    public Passport getPassport(String number) {
        for (Passport p : passports) {
            if (p.getNumber().equals(number))
                return p;
        }
        return null;
    }
}
