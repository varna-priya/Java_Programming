public class LogicalOperators {
    public static void main(String[] args) {

        boolean hasHallTicket = true;
        boolean hasCollegeID = true;
        boolean feePaid = false;

        System.out.println("===== Exam Eligibility =====");

        System.out.println("Eligible for Exam        : " + (hasHallTicket && hasCollegeID));
        System.out.println("Special Permission       : " + (hasHallTicket || feePaid));
        System.out.println("Fee Pending              : " + (!feePaid));
    }
}
