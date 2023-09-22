public class CatRunner {

    public static void main(String[]args)
    {
        Cat cat1 = new Cat("Penelope",12,15.75);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Simba",1,4.6);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
