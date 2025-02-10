public class xylem {
    public static void main(String[] args) {
    int a =1645;
    int b= a%10;
    int sum=0;
    int sum1 =0;
    a=a/10;
//    while(a>0){
//        if(a>9) {
//            sum += a % 10;
//            a=a/10;
//        }
//        else {
//            sum1 = b+ a%10;
//            a=a/10;
//        }
//    }
        //or
        while(a>9){
            sum+=a%10;
            a=a/10;
        }
        sum1=a+b;

    if(sum1==sum){
        System.out.println("its a xylem no");
    }
    else{
        System.out.println("its a phloem no");

    }
    }
    }
