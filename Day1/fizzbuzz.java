public class fizzbuzz {
    public static void main(String[] args) {
        //fizz buzz
        int a=1;
        while(a<=15){
            if(a%3==0&&a%5==0){
                System.out.println("FizzBuzz");
            } else if (a%5==0) {
                System.out.println("Fizz");
            } else if (a%3==0) {
                System.out.println("Bizz");
            }else {
                System.out.println(a);
            }
            a++;
        }
    }
}
