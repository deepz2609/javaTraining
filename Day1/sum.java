public class sum {
    public static void main(String[] args) {
        //sum and count of digit in given number
        int a=12345;
        int count=0;
        int sum=0;
        int b;
        int product = 0;
        while(a>9) {
            sum =0;
            while (a > 0) {
                count++;
                sum += (a % 10);
                a = a / 10;

            }
            a=sum;
        }
        System.out.println("sum = "+sum+" count = "+count);
    }
    }
