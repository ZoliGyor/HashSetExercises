public class Main 
{    
    public static void main(String[] args)
    {
        Exercises set1 = new Exercises();
        Exercises set2 = new Exercises();

        set1.exercise1(set1.getSet(), "DM");
        set1.exercise2(set1.getSet());
        set1.exercise3(set1.getSet());
        set2.exercise4(set2.getSet());
        set1.exercise5(set1.getSet());
        set1.exercise6(set1.getSet(), set2.getSet());
        set1.exercise7(set1.getSet());
        set1.exercise8(set1.getSet());
        set1.exercise9(set1.getSet());
        set1.exercise10(set1.getSet(), set1.getSet());

        set2.exercise1(set2.getSet(), "DM");
        set1.exercise11(set1.getSet(), set2.getSet());
        
        set1.exercise12(set1.getSet());
        // just a test to see if this works :)
    }
}
