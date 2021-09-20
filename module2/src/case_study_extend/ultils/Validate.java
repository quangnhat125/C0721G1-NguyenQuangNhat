package case_study_extend.ultils;

import case_study_extend.models.Car;

import java.util.ArrayList;
import java.util.List;

public class Validate {
    public static boolean ValidateLicensePlateTruck(String a) {
        final String TRUCK_PLATE_REGEX = "([0][1-9]|[1-9][0-9])[C][-]\\d{3}[.]\\d{2}";
        try {
            if (!a.matches(TRUCK_PLATE_REGEX)) {
                throw new ValidateException("Sai!");
            }

        } catch (ValidateException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
    public boolean validateEmail(String email) {
//        final String EMAIL_REGEX = "^[A-z]{1}((\\w)*(([.]?)|([_]?))(\\w)*)[@][\\w]+([.][\\w]{2,}){1,5}";
        final String EMAIL_REGEX = "^[A-z]{1}((\\w)*[.]?(\\w)*|(\\w)*[-]?(\\w)*)@[a-z0-9]+([.][a-z]{2,3}){1,5}";
        if (email.matches(EMAIL_REGEX)) {
            return true;
        } else {
            System.err.println("Loi!");
            return false;
        }
    }

//    public static <E> String returnLicensePlate(String path, List<E> eList) {
//        List<E> listLicense = (List<E>) ReadFile.ReadCSVToString(path);
//        List<String> stringList = new ArrayList<>();
//        for (E e : listLicense) {
//            stringList.add();
//        }
//
//    }
}

