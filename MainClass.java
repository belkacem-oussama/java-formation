public class MainClass {
    public static void main(String[] args) {
        int firstInt = 80;
        int secondInt = 100;
        String firstString = "Match !";

        if ((firstInt + secondInt) == 189 ) {
            System.out.println(firstString);
        } else if (firstInt == 80) {
            System.out.println("First int is 80.");
        } 
        else {
            System.out.println("Nothing ...");
        }
    }
}

//Output => "First int is 80."