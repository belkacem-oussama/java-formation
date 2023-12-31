public class MainClass {
    public static void main(String[] args) {
        int firstInt = 0;

        while (firstInt < 6) {
            System.out.println("firstInt < 6, look : " + firstInt);
            ++firstInt;
        }
    }
}

//Output =>
// firstInt < 6, look : 0
// firstInt < 6, look : 1
// firstInt < 6, look : 2
// firstInt < 6, look : 3
// firstInt < 6, look : 4
// firstInt < 6, look : 5