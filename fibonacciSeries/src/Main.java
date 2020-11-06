public class Main {

    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,....

        int a = 0;
        int b = 1;

        System.out.println(0);

        for(int i=1; i<20; i++){

            int c = a + b;
            a = b;
            b = c;

            System.out.println(a);
        }

    }
}
