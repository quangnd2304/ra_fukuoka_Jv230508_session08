public abstract class Person {
    private String id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Phương thức trừu tượng, không có thân, không có phần triển khai
    public abstract void inputData();
    public abstract void displayData();
    public void talk(){
        System.out.println("Xin chào các bạn");
    }
    public abstract int add(int number1,int number2);
}
