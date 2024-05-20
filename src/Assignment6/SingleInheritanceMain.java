package Assignment6;

class SingleInheritanceParent {
    public String parentsProperty() {
        return "We are parent and we have a house!";
    }
}

class SingleInheritanceChild extends SingleInheritanceParent {
    public String childrenProperty() {
        return "I am a child and i have my own Apartment.";
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        SingleInheritanceChild child = new SingleInheritanceChild();
        System.out.println(child.childrenProperty());
        System.out.println(child.parentsProperty());
    }
}
