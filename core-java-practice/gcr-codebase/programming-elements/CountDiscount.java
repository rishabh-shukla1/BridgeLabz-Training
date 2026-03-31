package programming_elements;

public class CountDiscount {
	public static void main(String[] args) {

        int fee = 125000;
        // discount percent
        int disP = 10;

         // discount calculation
        int disc = (fee * disP) / 100;
        
        int finalFee = fee - disc;

        System.out.println("The discount amount is INR " + disc +
                           " and final discounted fee is INR " + finalFee);
    }

}
