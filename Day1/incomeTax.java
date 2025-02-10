
public class incomeTax {
    public static void main(String[] args){
        /*
        * program that calculate income tax based on the following
        * income <= 2,50,000;NO tax
        * 2,50,000 - 5,00,000; 5%
        * 5,00,000 - 10,00,000; 20%
        * Above 10,00,000;30%
        * */
        int income =2000000;
        float tax;
        if(income<=250000){
            System.out.println("No tax");
        }
        else if(income>250000&&income<=500000){
            tax= (float) (income*0.05);
            System.out.println("tax: "+tax);
            System.out.println("Remaining Amount:"+(income-tax));
        }
        else if(income>500000&&income<=1000000){
            tax= (float) (income*0.2);
            System.out.println("tax: "+tax);
            System.out.println("Remaining Amount:"+(income-tax));
        }
        else if(income>1000000){
            tax= (float) (income*0.3);
            System.out.println("tax: "+tax);
            System.out.println("Remaining Amount:"+(income-tax));
        }
        else{
            System.out.println("Enter correct item..!");
        }
    }
}
