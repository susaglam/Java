package assignments.repl_it;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class repl_213_Methods_with_ArrayList_14_remove_instances {
	public static ArrayList< Integer > removeInst ( ArrayList< Integer > r, Integer n ) {
        Iterator itr = r.iterator();
        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (x == n)
                itr.remove();
        }
//        System.out.println(r.indexOf(r));

//        while (r.contains(n)) {
//            r.remove(n);
//        }
		
//		for ( Integer f : r ) {
//			if ( f == n ) {
//				r.remove(f);
//			}
//		}

//        for (int i = 0; i < r.size(); i++) {
//            for (int j = 0; j < r.size(); j++) {
//                if (r.get(j).equals(n)) {
//                    r.remove(j);
//                }
//            }
//        }
		return r;
	}
	
	public static void main ( String[] args ) {
		
		ArrayList< Integer > arr = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3, 1, 4 };
		arr.addAll(Arrays.asList(nums));
		
		System.out.print(removeInst(arr, 1));
	}//end main
}
    /*
        This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.
        It removes any instance of the number it gets from the arraylist.
        for example:
        romoveInst([1,1,2,3,1,4],1)
        returns: [2,3,4]

        romoveInst([3,4,3,3],4)
        returns: [3,3,3]
    */
