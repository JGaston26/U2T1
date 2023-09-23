public class studentRunner {
    public static void main(String[]args)
    {
        student Student1 = new student("Justin", 16, 3.8);
        student Student2 = new student("James",18,2.9);

        Student1.introduce();
        Student1.stats();
        Student1.eval();

        System.out.println();

        Student2.introduce();
        Student2.stats();
        Student2.eval();
    }
}
