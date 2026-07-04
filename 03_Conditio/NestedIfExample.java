public class NestedIfExample {
    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        System.out.println("===== Nested IF Example =====");

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Eligible to Drive");
            } else {
                System.out.println("License Required");
            }

        } else {
            System.out.println("Not Eligible Due to Age");
        }
    }
}
