public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person("Ahmad", "1001");
        Person p2 = new Student("Khalid", "2002");
        Person p3 = new Lecturer("Dr. Ali", "3003");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}