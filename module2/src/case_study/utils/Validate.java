package case_study.utils;

public class Validate {
    public static boolean validateIDNameOfServiceVilla(String a) {
        final String ID_NAME_SERVICE_VILLA_REGEX = "^[S][V]{2}[L][-]\\d{4}";
        if (a.matches(ID_NAME_SERVICE_VILLA_REGEX)) {
            return true;
        } else {
            System.err.println();
            return false;
        }
    }

    public static boolean validateIDNameOfServiceHouse(String a) {
        final String ID_NAME_SERVICE_HOUSE_REGEX = "^[S][V][H][O][-]\\d{4}";
        if (a.matches(ID_NAME_SERVICE_HOUSE_REGEX)) {
            return true;
        } else {
            System.err.println();
            return false;
        }
    }

    public static boolean validateIDNameOfServiceRoom(String a) {
        final String ID_NAME_SERVICE_ROOM_REGEX = "^[S][V][R][O][-]\\d{4}";
        if (a.matches(ID_NAME_SERVICE_ROOM_REGEX)) {
            return true;
        } else {
            System.err.println();
            return false;
        }
    }


    public static boolean validateNameService(String nameService) {
        final String SERVICE_NAME_REGEX = "^[A-Z][A-z]*";

        if (nameService.matches(SERVICE_NAME_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again!");
            return false;
        }

    }

    public static boolean validateTypeOfRent(String typeRent) {
        final String TYPE_RENT_REGEX = "^[A-Z][A-z]*";

        if (typeRent.matches(TYPE_RENT_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again!");
            return false;
        }

    }


    public static boolean validateIdCard(String idCard) {
        final String ID_CARD_REGEX = "\\d{9}";
        if (idCard.matches(ID_CARD_REGEX)) {
            return true;
        } else {
            System.err.println("ID card must be in 9-digit! Please enter again! ");
            return false;
        }
    }

    public static boolean validateMaximumPeople(int maxPeople) {
        if (maxPeople > 0 && maxPeople < 20) {
            return true;
        } else {
            System.err.println("People must be greater than 0 and less than 20! Please enter again!");
            return false;
        }
    }

    public static boolean validateNumberFloor(int numberFloor) {
        if (numberFloor > 0) {
            return true;
        } else {
            System.err.println("Number of floor must be greater than 0! Please enter again!");
            return false;
        }
    }

    public static boolean validateRoomRate(int roomRate) {
        if (roomRate > 0) {
            return true;
        } else {
            System.err.println("Room rate must be greater than 0! Please enter again!");
            return false;
        }
    }

    public static boolean validateArea(double area) {
        if (area > 30) {
            return true;
        } else {
            System.err.println("Area must be greater than 30!! Please enter again!");
            return false;
        }
    }

    public static boolean validatePoolArea(double poolArea) {
        if (poolArea > 30) {
            return true;
        } else {
            System.err.println("Pool area must be greater than 30!! Please enter again!");
            return false;
        }
    }

    public static boolean validateDateOfBirth(String dateOfBirth) {
        final String DATE_OF_BIRTH_REGEX = "(([1-2]{1}+[\\d]{1})|(0+[1-9]{1})|(3+[0-1]))+(/)+((0+[1-9]{1})|(1+[0-2]{1}))+(/)+[\\d]{4}";
        try {
            if (!dateOfBirth.matches(DATE_OF_BIRTH_REGEX)) {
                throw new DateFormatException("Wrong format, please enter again.");
            }
        } catch (DateFormatException e) {
            System.err.println(e.getMessage() + "(dd/mm/yyyy)");
            return false;
        }
        return true;
    }
}

//
//        //Tính số ngày từ ngày sinh đến hiện tại :
//        String[] arrayDate = dateOfBirth.split("/");
//        int day = Integer.parseInt(arrayDate[0]);
//        int month = Integer.parseInt(arrayDate[1]);
//        int year = Integer.parseInt(arrayDate[2]);
//        DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        Date currentDate = new Date();
//        Date date1;
//        Date date2;
//        long getDayDiff = 0;
//        try {
//            String startDate = "" + day + "-" + month + "-" + year;
//            String endDate = simpleDateFormat.format(currentDate);
//            date1 = simpleDateFormat.parse(startDate);
//            date2 = simpleDateFormat.parse(endDate);
//            long getDiff = date2.getTime() - date1.getTime();
//
//            getDayDiff = getDiff / (24 * 60 * 60 * 1000);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        boolean checkDateMin = getDayDiff / 365 < 18;
//        boolean checkDateMax = getDayDiff / 365 > 100;
//        try {
//            if (checkDateMax) {
//                throw new AgeFormatException("Age must be less than 100, please enter again !");
//            }
//        } catch (AgeFormatException e) {
//            System.err.println(e.getString());
//            return false;
//        }
//        try {
//            if (checkDateMin) {
//                throw new AgeFormatException("Age must be greater than 18, please enter again !");
//            }
//        } catch (AgeFormatException e) {
//            System.err.println(e.getString());
//            return false;
//        }
//        return true;
//    }
//}