 import util.Input;

    public class InputTest {
        public static void main(String[] args) {
            Input input = new Input();

            String userInput = input.getString("Hey, you! Enter your name.. ");
            System.out.println("Hello, " + userInput + "!");


            boolean userConfirm = input.yesNo("Do you wish to proceed? (yes/no): ");
            if (userConfirm) {

            int userTacos = input.getInt("How many tacos de carne asada do you usually eat? ", 1, 12);
            System.out.println("I usually eat " + userTacos + " too!");


            double userMoney = input.getDouble("How much do you think a used guitar costs? Include cents! ", 1.00, 10000.00);
            System.out.println("$" + userMoney + " sounds about right. Thank you for your cooperation!");
            } else {

                System.out.println("Boo!");
            }
        }
}
