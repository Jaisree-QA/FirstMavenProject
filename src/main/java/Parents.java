class Parents {
    void parentMethod(String message) {
        System.out.println("Parent Method: " + message);
    }
}

class Child extends Parents {
    void childMethod() {
        super.parentMethod("Calling from Child"); // Calling parentMethod with an argument using super
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
    }
}


