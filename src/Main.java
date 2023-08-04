public class Main {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public void inputData() {
                System.out.println("Thực thi inputData");
            }

            @Override
            public void displayData() {
                System.out.println("Thực thi displaydata");
            }

            @Override
            public int add(int number1, int number2) {
                return 0;
            }
        };
    }
}