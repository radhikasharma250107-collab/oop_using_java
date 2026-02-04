class Student {

    Integer roll;   
    String name;

    Student() {
        roll = 0;
        name = "Unknown";
    }

    Student(Integer r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(1, "Rad");

        s1.display();
        s2.display();
    }
}
