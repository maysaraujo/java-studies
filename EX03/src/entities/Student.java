package entities;

public class Student {
    public String name;
    public double noteA;
    public double noteB;
    public double noteC;
    public double notes() {
        return noteA + noteB + noteC;
    }
    public double points() {
        if (notes() >= 60) {
            System.out.println("FINAL GRADE = " + notes());
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE: " + notes());
            System.out.println("FAILED");
            System.out.printf("MISSING: %.2f POINTS\n", 60 - notes());
        }
        return 0;
    }

    public String toString() {
        return name + "\n" +
                noteA + "\n" + noteB +
                "\n" + noteC;
    }

}
