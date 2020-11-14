package assignments.repl_it;

/*
    A database (DB), in the most general sense, is an organized collection of data. ...
    In other words, a database is used by an organization as a method of storing,
    managing and retrieving information.
    When you work data in databases, you can read, add, edit, delete data.

    Lame database.
    This method gets 4 strings and returns a string.
    This method creates a very basic database interaction.
    you can add, edit and remove data from the database.
    all this using only String and string methods.
    an example database may look like this:
    1data#2moredata#3yet more data

    if we use split("#") it will turn into an array.
    as a database table it will look like this:
    1data
    2moredata
    3yet more data

    each row has a number id (1, 2 ,3) in above example.
    each row of data is separated by #
    data in each row is right after id

    parameters:
    String db : holds the whole lame database as a string. You will modify this parameter
     value depending on operation requested

    String op : op is short for operation, the operation the method will do on the database,
    there are 3 : add, edit and delete. For any other operation, return the database as is.

    String id : holds the id of the database row we want to manipulate, we use the id to find the
    database row we want to manipulate

    String data : holds a string of data we will use for the add or edit operations

    example use of the method:

    m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
    returns:  1etsy#2wooden#3spoon#4aaa
    (since operation is 'add', we added '#4aaa' to the end and return)

    m.lameDb("1test#2bla#3foo","edit","2","bbb")
    returns:  1test#2bbb#3foo
    (since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)


    m.lameDb("1tst#2bla#3foo","delete","1","")
    returns:  #2bla#3foo

    m.lameDb("1tst#2bla#3foo","none","1","")
    returns:  1tst#2bla#3foo

 */

import java.util.Arrays;

public class repl_187_Methods_with_String_10_lame_db {
    public static void main (String[] args) {
        System.out.println(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa"));
        System.out.println(lameDb("1tst#2bla#3foo", "edit", "2", "bbb"));
        System.out.println(lameDb("1tst#2bla#3foo", "delete", "1", ""));
        System.out.println(lameDb("1tst#2bla#3foo", "none", "1", ""));
    }

    public static String lameDb (String db, String op, String id, String data) {
        String result = "";
        String[] dbPart = db.split("#");
        if (op.equals("add")) {
            result = db + "#" + id + data;
        } else if (op.equals("edit")) {
            dbPart[Integer.parseInt(id) - 1] = id + data;
            for (int i = 0; i < dbPart.length; i++) {
                if (i > 0) {
                    result += "#" + dbPart[i];
                } else {
                    result += dbPart[i];
                }
            }
        } else if (op.equals("delete")) {
            dbPart[Integer.parseInt(id) - 1] = null;
            for (int i = 0; i < dbPart.length; i++) {
                if (Integer.parseInt(id) - 1 != i) {
                    if (i > 0) {
                        result += "#" + dbPart[i];
                    } else {
                        result += dbPart[i];
                    }
                }
            }
        } else {
            result = db;
        }
        return result;
    }
}
