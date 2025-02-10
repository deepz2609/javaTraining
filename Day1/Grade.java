public class Grade {
    public static void main(String[] args) {
//     Write a program t0 accept marks(out of 100) and printsthe grade using else if ladder as follows:
//    ->Marks>=90;Grade A
//    ->Marks>=75:Grade B
//    ->Marks>=60:Grade C
//    ->Marks<50:Grade F
        int Marks =89;
        if(Marks>=90){
            System.out.println("Grade A");
        }
        else if(Marks>=75){
            System.out.println("Grade B");
        }
        else if(Marks>=75){
            System.out.println("Grade c");
        }
        else if(Marks<50){
            System.out.println("Grade f");
        }

    }
}
