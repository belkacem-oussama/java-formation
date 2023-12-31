public class MainClass {
    public static void main(String[] args) {
        int firstInt = 80;

        switch (firstInt) {
            case 80: System.out.println("First int is 80.");
                break;
            case 90: System.out.println("First int is 90.");
            default:
                break;
        }
    }
}

//Output => "First int is 80."