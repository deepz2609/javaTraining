//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int amt = 1670;
        if (amt >= 500) {
            int fiveHundred = amt / 500;
            amt = amt%500;
            System.out.println("no of 500 notes are:"+fiveHundred);
        }
        if (amt >= 100) {
            int fiveHundred = amt / 100;
            amt = amt%100;
            System.out.println("no of 100 notes are:"+fiveHundred);
        }
        if (amt >= 50) {
            int fiveHundred = amt / 50;
            amt = amt%50;
            System.out.println("no of 50 notes are:"+fiveHundred);
        }
        if (amt >= 20) {
            int fiveHundred = amt / 20;
            amt = amt%500;
            System.out.println("no of 20 notes are:"+fiveHundred);
        }


    }
}