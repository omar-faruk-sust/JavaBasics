package Assignment6;

class Person {
    String name;
    String phoneNumber;
}

class Employee extends Person {
    int employeeNumber;
    float hourlyPay;
}

class Customer extends Person {
    String[] itemsPurchased = {"Mobile"};
}

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Customer customer = new Customer();

        person.name = "Omar Rishat";
        person.phoneNumber = "514-555-2328";
        System.out.println(person.name + "'s mobile no is: " + person.phoneNumber);

        System.out.println("######################");

        employee.name = "Tony Ahmed"; // attribute inherited from Person
        employee.phoneNumber = "514-555-1200"; // attribute inherited from Person
        employee.employeeNumber = 232867; // own attribute
        employee.hourlyPay = 6.75f; // own attribute

        System.out.println(
                employee.name + "'s mobile no is: " + employee.phoneNumber
                + " and employee no is:  " + employee.employeeNumber + "get paid/hour:" + employee.hourlyPay);

        System.out.println("######################");

        customer.name = "Jishan Ahmed"; // attribute inherited from Person
        customer.phoneNumber = "514-555-0000"; // attribute inherited from Person
        // customer.itemsPurchased[1] = "Computer"; // own attribute

        System.out.println(
                customer.name + "'s mobile no is: " + customer.phoneNumber
                        + " and purchased items: " + customer.itemsPurchased[0] );
    }
}
