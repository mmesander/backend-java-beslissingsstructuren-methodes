public class Main {
    public static void main(String[] args) {
        int number = 0;
        int input1 = 4;
        int input2 = 8;
        String name = "Mark Mesander";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
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

    private static void positiveOrZeroOrNegative(int number) {
        if (number < 0) {
            System.out.println("The number is negative!");
        } else if (number == 0) {
            System.out.println("The number is zero!");
        } else {
            System.out.println("The number is positive");
        }
    }

    private static void bartender(String name) {
        switch (name) {
            case "Mark Mesander":
                System.out.println("Het favoriete drankje van " + name + " is whiskey!");
                break;
            case "Emeraude Mesander":
                System.out.println("Het favoriete drankje van " + name + " is een pornstar martini!");
                break;
            case "Rutger Siebbeles":
                System.out.println("Het favoriete drankje van " + name + " is een cosmopolitan!");
                break;
            case "Rik van den Braak":
                System.out.println("Het favoriete drankje van " + name + " is een liefmans!");
                break;
            default:
                System.out.println("Het favoriete drankje van deze persoon is niet bekend!");
        }
    }
}



