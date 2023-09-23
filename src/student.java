public class student {

    private final String NAME;

    private final int AGE;

    private final double GPA;

        public student(String studentsName, int studentAge, double studentsGPA)
        {
            NAME = studentsName;
            AGE = studentAge;
            GPA = studentsGPA;

        }

        public void introduce()
        {
           System.out.println("Hey, my name is " + NAME);
        }

        public void stats()
        {
            System.out.println("Students Name: " + NAME);
            System.out.println("Students Age: " + AGE);
            System.out.println("Students GPA: " + GPA);
        }

        public void eval()
        {
            if(GPA >= 3.0)
            {
                System.out.println("I have a high GPA!");
            }else{
                System.out.println("I don't have a high GPA, but I'll work to make it higher!");
            }

        }
}
