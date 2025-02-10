public class expo {
    public static void main(String[] args) {
    int base = 2;
    int exp = 4;
    int op = 1;
    while(exp>0){
        op*=base;
        exp--;
    }

    System.out.println(op);
    }
}
