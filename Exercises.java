import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Exercises
{
    private HashSet<String> set = new HashSet<String>();

    public Exercises()
    {
        set.add("Matt");
        System.out.println(set);
    }

    public void exercise1(HashSet<String> set, String element)
    {
        System.out.println("1st exercise: Write a Java program to append the specified element to the end of a hash set");
        set.add(element);
        System.out.println(set);
        System.out.println();
    }

    public void exercise2(HashSet<String> set)
    {
        System.out.println("2nd exercise: Write a Java program to iterate through all elements in a hash list");
        System.out.println(set);
        System.out.println();
    }

    public void exercise3(HashSet<String> set)
    {
        System.out.println("3rd exercise: Write a Java program to get the number of elements in a hash set");
        System.out.println("The number of elements in the list is: " + set.size());
        System.out.println();
    }

    public void exercise4(HashSet<String> set)
    {
        System.out.println("4th exercise: Write a Java program to empty an hash set");
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println();
    }

    public void exercise5(HashSet<String> set)
    {
        System.out.println("5th exercise: Write a Java program to test a hash set is empty or not");
        System.out.println("The set is: " + set);
        if(set.isEmpty()){
            System.out.println("The set is empty");
        }else{
            System.out.println("The set is not empty");
        }
        System.out.println();
    }

    public void exercise6(HashSet<String> set1, HashSet<String> set2)
    {
        System.out.println("Write a Java program to clone a hash set to another hash set");
        System.out.println("The first set is currently is: " + set1);
        System.out.println("The second set is currently is: " + set2);
        set2 = (HashSet<String>)set1.clone();
        System.out.println("The second set after cloning: " + set2);
        System.out.println();
    }

    public void exercise7(HashSet<String> set)
    {
        System.out.println("7th exercise: Write a Java program to convert a hash set to an array");
        String[] arrayFromSet = new String[set.size()];
        arrayFromSet = set.toArray(arrayFromSet);
        for(int i = 0; i < arrayFromSet.length; i++){
            System.out.println(arrayFromSet[i]);
        }
        System.out.println();
    }


    public void exercise8(HashSet<String> set)
    {
        System.out.println("8th exercise: Write a Java program to convert a hash set to a tree set");
        Set<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
        System.out.println();
    }

    
    public void exercise9(HashSet<String> set)
    {
        System.out.println("9th exercise: Write a Java program to convert a hash set to a List/ArrayList");
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);
        System.out.println();
    }


    public HashSet<String> getSet()
    {
        return set;
    }
}