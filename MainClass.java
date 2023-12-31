public class MainClass {
    public static void main(String[] args) {
        // int firstSmallInt = 10;
        // long firstLongInt = 1000000000;

        // float firstFloat = 3.4f;
        // double firstDouble = 3.4;

        // char firstChar = 'O';
        // String firstString = "I am O";

        // boolean firstTrue = true;
        // boolean firstFalse = false;

        // int[] firstIntArray = {1, 2, 3, 4, 5};
        // String[] firstStringArray = {"Java", "is", "Strong"};

        class User {
            String userName;
            int userAge;
        }

        User firstUser = new User();
        firstUser.userName = "Oussama";
        firstUser.userAge = 26;

        System.out.println("Hello, je m'appelle " + firstUser.userName + " et j'ai " + firstUser.userAge + " ans.");
    }
}