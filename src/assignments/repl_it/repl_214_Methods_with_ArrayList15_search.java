package assignments.repl_it;

import java.util.ArrayList;

public class repl_214_Methods_with_ArrayList15_search {
    public static String search (ArrayList<String> r, String find) {
        String result = "";
        for (int i = 0; i < r.size(); i++) {

            if (r.get(i).contains(find)) {
                result = r.get(i);
            }
        }
        if (result.isEmpty()) {
            result = "search failed";
        }
        return result;
    }//end wineSeller

    public static void main (String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr, "foo");
        System.out.print(find_tst);//foo bar


    }//end main
}

/*
search method accepts ArrayList of Strings and String find.
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"

for example:

search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)

hint:
use contains string method to test if element has word value in it.
 */
