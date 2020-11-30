package Examples.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_interface {
    public static void main (String[] args) {
        List<String> ls = new ArrayList<>();

        // There are two ways to add List element.
        ls.add("B");
        ls.add("M");
        ls.add("A");
        ls.add(1, "K");
        ls.add(0, "S");
        ls.add("T");
        ls.add("M");
        System.out.println(ls);

        // find the number of elements in the list
        // When talking about the number of elements of Array, say "length of Array"
        // When talking about the number of elements in Lists, say "List's size"
        System.out.println(ls.size());

        // Checking if a list is empty
        System.out.println(ls.isEmpty());//false

        // Deleting an element from a list using index
        // If you use remove() with index and print it on the screen, Java will write the deleted element to the screen
        System.out.println(ls.remove(2)); // K
        System.out.println(ls);//[S, B, M, A, T]

        // To delete an element from a list with an element name.
        System.out.println(ls.remove("T"));//true
        System.out.println(ls);//[S, B, M, A]

        // We cannot delete an element that is not in the list, it will respond as false. the list does not change
        System.out.println(ls.remove("X"));//false
        System.out.println(ls);//[S, B, M, A]
        if (ls.remove("X")) {            //false
            System.out.println("Deleted..");
        } else {
            System.out.println("There is no such element to delete"); //There is no such element to delete
        }

        ls.remove("M");
        System.out.println(ls);//[S, B, A, M]

        // Checking whether the desired element in a list exists
        System.out.println(ls.contains("B"));//true
        System.out.println(ls.contains("X"));//false

        // Replacing a list's element using index
        System.out.println(ls.set(1, "Blue"));//B
        System.out.println(ls);//[S, Blue, A, M]

        // Sorting items in a list
        Collections.sort(ls);// <==== dont forgett!!!
        System.out.println(ls);//[A, Blue, M, S]

        // delete all items in a list
        ls.clear();
        System.out.println(ls);//[]


        //Let's create two integer lists. [1, 3, 1, 2]    [3, 2, 4, 4, 5]

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(1);
        list1.add(2);
        System.out.println(list1); // [1, 3, 1, 2]

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(4);
        list2.add(4);
        list2.add(5);
        System.out.println(list2); // [3, 2, 4, 4, 5]

        // Adding one list to the end of another list
        list1.addAll(list2);
        System.out.println(list1);        //[1, 3, 1, 2, 3, 2, 4, 4, 5]

        // Adding a list to the desired index of another list
        list1.addAll(1, list2);
        System.out.println(list1);        //[1, 3, 2, 4, 4, 5, 3, 1, 2, 3, 2, 4, 4, 5]

        // Delete items from a list in another list
        list1.removeAll(list2); //[1, 3, 2, 4, 4, 5, 3, 1, 2, 3, 2, 4, 4, 5]
        System.out.println(list1);//[1, 1]
        System.out.println(list2);//[3, 2, 4, 4, 5]

        // check if one list is equal to another list
        System.out.println(list1.equals(list2));//false

        System.out.println(list2.containsAll(list1));//false

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(2);
        System.out.println(list3);//[3, 2]

        System.out.println(list2.containsAll(list3));//true

        // get() method returns the element given index
        System.out.println(list2.get(1));//2

        // indexOf() method returns the index of the first appearance of the given element.
        System.out.println(list2.indexOf(4));//2

        //lastIndexOf() method returns the index of the last view of the given element.
        System.out.println(list2.lastIndexOf(4));//3


        // subList (index1, index2) method returns the part of the list from index1 to index2.
        // including index1, excluding index2.
        System.out.println(list2.subList(1, 3));//[2, 4]


        // Converting Array to List

        String arr[] = {"Blue", "Red", "Yellow", "Grey"};

        // We use the asList() method from the Arrays class to convert Array to a list.
        List<String> l1 = Arrays.asList(arr);
        System.out.println(l1);                //[Blue, Red, Yellow, Grey]

        // Methods that change size cannot be used in lists generated from Array.
        //For example; Like add(), remove(), clear() ...
        // If you use it will give Java Run Time Error (UnsupportedOperationException)

        // l1.add("Antrasit");
        // System.out.println(l1);

        // Converting List to Array
        String arrayFromList[] = l1.toArray(new String[0]);
        System.out.println(Arrays.toString(arrayFromList));    //[Blue, Red, Yellow, Grey]

        // NOTE: When the remove () method is used in integer lists,
        // the value placed inside the remove() method is always index It is taken as.
        // It is not considered as an element.

        List<Integer> l2 = new ArrayList<>();
        l2.add(5);
        l2.add(2);
        l2.add(4);
        l2.add(3);
        l2.add(1);
        System.out.println(l2);//[5, 2, 4, 3, 1]
        System.out.println(l2.remove(4));// 1  // this is index 4
        System.out.println(l2);//[5, 2, 4, 3]

		/*
		 * List vs ArrayList in Java
		LIST <==>	ARRAYLIST
		1- List is an Interface.<==> ArrayList is a Class.
		2- List interface extends the Collection framework.
		   <==> ArrayList extends AbstractList class and implements List interface.
		3- List cannot be instantiated.<==> ArrayList can be instantiated.
		4- List interface is used to create a list of elements(objects) which are associated with their index numbers.
		   <==> ArrayList class is used to create a dynamic array that contains objects.
		5- List interface creates a collection of elements that are stored in a sequence and
		   they are identified and accessed using the index.
		   <==> ArrayList creates an array of objects where the array can grow dynamically.
		*/
    }
}
