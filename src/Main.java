public class Main {
    public static void main(String[] args) {
        int number = -12;
        int input1 = 4;
        int input2 = 8;
        String name = "Mark Mesander";

        hello();
        positiveOrNegative(number);
    }

    private static void hello() {
        System.out.println("Hello world!");
    }

    private static void positiveOrNegative(int number){
        if (number >= 0) {
            System.out.println("The number is positive!");
        } else {
            System.out.println("The number is negative!");
        }
    }
}



