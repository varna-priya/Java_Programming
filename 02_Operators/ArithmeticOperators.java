public class ArithmeticOperators {
    public static void main(String[] args) {

        int itemPrice = 250;
        int quantity = 3;

        int total = itemPrice * quantity;
        int discount = 100;
        int finalAmount = total - discount;

        System.out.println("===== Shopping Bill =====");
        System.out.println("Item Price      : ₹" + itemPrice);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Total Price     : ₹" + total);
        System.out.println("Discount        : ₹" + discount);
        System.out.println("Final Amount    : ₹" + finalAmount);

        System.out.println("\nArithmetic Operations");
        System.out.println("Addition        : " + (20 + 10));
        System.out.println("Subtraction     : " + (20 - 10));
        System.out.println("Multiplication  : " + (20 * 10));
        System.out.println("Division        : " + (20 / 10));
        System.out.println("Modulus         : " + (20 % 3));
    }
}
