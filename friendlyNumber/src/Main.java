public class Main {

    public static void main(String[] args) {
	    //220-284, 1184-1210, 2620-2924, 5020-5564
        int number1 = 1184;
        int number2 = 1000;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < number1; i++) {
            if(number1 % i == 0) {
                sum1 += i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if(number2 % j == 0) {
                sum2 += j;
            }
        }

        if(sum1 == number2 && sum2 == number1) {
            System.out.println("Number1 and number2 are friendly number.");
        }
        else {
            System.out.println("Number1 and number2 aren't friendly number.");
        }
    }
}
