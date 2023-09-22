public class Cat {

    private int age;
    private String name;
    private double weight;

    public Cat(String catName, int catAge, double catWeight)
    {
        name = catName;
        age = catAge;
        weight = catWeight;
    }
    public void introduce()
    {
        System.out.println("Hello my name is " + name + " Meow" );
    }

    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

}
