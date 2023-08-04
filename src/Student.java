public class Student extends Person{
    @Override
    public void inputData() {
        System.out.println("Triển khai phương thức trừu tượng inputData được khai báo ở Person");
    }

    @Override
    public void displayData() {
        System.out.println("Triển khai phương thức trừu tượng displayData đuợc khai báo ở Person");
    }

    @Override
    public int add(int number1, int number2) {
        return 0;
    }

}
