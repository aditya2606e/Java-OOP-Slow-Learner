
class Student {
    String name, PRN, division, branch;

    // No-argument constructor
    Student() {
        name = "Aditya";
        PRN = "389";
        division = "C";
        branch = "CSE";
    }

    // Parameterized constructor
    Student(String n, String p, String d, String b) {
        name = n;
        PRN = p;
        division = d;
        branch = b;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("PRN: " + PRN);
        System.out.println("Division: " + division);
        System.out.println("Branch: " + branch);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Yash", "308", "C", "CSE");

        System.out.println("No-Argument Constructor:");
        s1.display();

        System.out.println("Parameterized Constructor:");
        s2.display();
    }
}
