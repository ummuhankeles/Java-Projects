public class Main {

    public static void main(String[] args) {
        //6,28,496...

        int number = 6;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }

        if(sum == number) {
            System.out.println("Number is perfect number.");
        }
        else {
            System.out.println("Number isn't perfect number.");
        }
    }
}
