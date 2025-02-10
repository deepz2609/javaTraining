public class unit {
    public static void main(String[] args){
        /*provide electricity bill based on units
        *first 50 unit ->0.20
        *next 150 -> 0.50
        *next 250 ->1.20
        * */
        int unit = 200;
        float billAmt;
        if(unit<=50){
            billAmt = (float) (unit*0.20);
            System.out.println("The bill Amount is"+billAmt);
        }
        else if(unit>50 && unit<=150){
            billAmt = (float) ((float) (unit*0.20)+((unit-50)*0.50));
            System.out.println("The bill Amount is"+billAmt);
        }
        else if(unit>150&& unit<=250){
            billAmt = (float) ((unit*0.2)+(unit-50)*0.50+(unit-150)*1.2);
            System.out.println("The bill Amount is"+billAmt);
        }
    }
}
