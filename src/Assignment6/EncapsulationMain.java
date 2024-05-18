package Assignment6;

class Name {
    private String firstName = "Jhon";

    private String lastName = "Rishat";

    public String getFullname() {
        return firstName + " " + lastName;
    }
}

class Nationality extends Name {

    public void setCountry(String country) {
        System.out.println("I am from " + country);
    }
}

class Man extends Nationality {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class EncapsulationMain {
    public static void main(String[] args) {
        Man p1 = new Man();
        System.out.println("My name is " + p1.getFullname());

        p1.setAge(24);
        System.out.println("My age is " + p1.getAge());

        p1.setCountry("Bangladesh");
    }
}
