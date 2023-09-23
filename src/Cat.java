public class Cat {

    private final int age;
    private final String name;
    private final double weight;

    public Cat(String catName, int catAge, double catWeight)
    {
        name = catName;
        age = catAge;
        weight = catWeight;
    }
    public void introduce()
    {
        if (age > 7) {
        System.out.println("Hello my name is " + name + " and I am an older cat, Meow!" );
    }else{
            System.out.println("Hello my name is " + name + " and I am a younger cat, Meow!" );
        }

    }

    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

}
