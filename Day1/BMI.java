public class BMI {
    public static void main(String[] args) {
    /*Decelop a program that categorizes BMI values

	. BMI < 18.5: "underweight"
	. 18.5 <=BMI <24.9: normal weight
	. 25<=BMI <29.9:over weight
	. Bmi >=30: obese
	*/
        float BMI =23;
        if(BMI<18.5){
            System.out.println("underweight");
        } else if (18.4 <BMI&&BMI <24.9) {
            System.out.println("normal weight");
        }
        else if (24<BMI&&BMI <30) {
            System.out.println("over weight");
        }
        else if (BMI>30) {
            System.out.println("obess");
        }

    }
    }
