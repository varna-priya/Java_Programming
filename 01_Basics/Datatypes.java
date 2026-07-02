public class DataTypes {
    public static void main(String[] args) {

        byte semester = 6;
        short attendance = 92;
        int registerNumber = 240123;
        long phoneNumber = 9876543210L;

        float projectScore = 94.5f;
        double cgpa = 8.76;

        char section = 'A';
        boolean internshipCompleted = true;

        String studentName = "Varna Priya";

        System.out.println("========== Student Academic Report ==========");
        System.out.println("Name                 : " + studentName);
        System.out.println("Register Number      : " + registerNumber);
        System.out.println("Semester             : " + semester);
        System.out.println("Section              : " + section);
        System.out.println("Attendance           : " + attendance + "%");
        System.out.println("Project Score        : " + projectScore);
        System.out.println("CGPA                 : " + cgpa);
        System.out.println("Phone Number         : " + phoneNumber);
        System.out.println("Internship Completed : " + internshipCompleted);
    }
}
