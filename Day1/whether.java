public class whether {
    public static void main(String[] args) {
//   write a program that accept a temperature in celsius and categorizes it
//
//	. Below 0C:"Freezing"
//                . 0c to 15c: "Cold"
//                . 16c to 30c: "warm"
//                . Above 30c: "hot"
//
//        use the else if ladder
        int temperature =224;
        if(temperature < 16 && 0  < temperature) {
            System.out.println("cold");
        } else if (15<temperature&&temperature<31){
            System.out.println("warm");

        } else if (temperature>30) {
            System.out.println("hot");
        }
    }
}
