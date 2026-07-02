public class RelationalOperators {
    public static void main(String[] args) {

        int studentMarks = 82;
        int passMark = 50;

        System.out.println("===== Exam Result =====");
        System.out.println("Student Marks : " + studentMarks);
        System.out.println("Pass Mark     : " + passMark);

        System.out.println("\nRelational Operators");
        System.out.println("Marks > Pass Mark  : " + (studentMarks > passMark));
        System.out.println("Marks < Pass Mark  : " + (studentMarks < passMark));
        System.out.println("Marks >= Pass Mark : " + (studentMarks >= passMark));
        System.out.println("Marks <= Pass Mark : " + (studentMarks <= passMark));
        System.out.println("Marks == Pass Mark : " + (studentMarks == passMark));
        System.out.println("Marks != Pass Mark : " + (studentMarks != passMark));
    }
}
