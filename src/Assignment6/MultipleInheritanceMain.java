package Assignment6;

class District {
    public String getDistrictName() {
        return "Your district name is Narsingdi";
    }
}

class Division extends District {
    public String getDivisionName() {
        return "Your division name is Dhaka";
    }
}

class Country extends Division {
    public String getCountryName() {
        return "Your country name is Bangladesh";
    }
}

public class MultipleInheritanceMain {
    public static void main(String[] args) {
        Country yourCountry = new Country();
        System.out.println(yourCountry.getCountryName());
        System.out.println(yourCountry.getDivisionName());
        System.out.println(yourCountry.getDistrictName());

        System.out.println("######################");
        Division yourDivision = new Division();
        System.out.println(yourDivision.getDivisionName());
        System.out.println(yourDivision.getDistrictName());

        System.out.println("######################");
        District yourDistrict = new District();
        System.out.println(yourDistrict.getDistrictName());
    }
}
