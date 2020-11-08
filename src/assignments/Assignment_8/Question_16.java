package assignments.Assignment_8;

public class Question_16 {
    public static void main (String[] args) {
        /*
        Question-16

        To book a room first it needs to be available for rent and
        make sure its available at the date selected:
        the room is already booked between 7/1/2018 - 7/8/2018
        and not available accepting bookings only for year of 2018

        example:
        simpleRoomBook(false,2,1,2018)
        return false

        simpleRoomBook(true,2,1,2018)
        return true

        simpleRoomBook(true,7,2,2018)
        return false
        */

        System.out.println(simpleRoomBook(false,2,1,2018));//false
        System.out.println(simpleRoomBook(true,2,1,2018));//true
        System.out.println(simpleRoomBook(true,7,2,2018));//false
    }

    public static boolean simpleRoomBook (boolean a, int day, int month, int year) {
        if (year == 2018) {
            return a;
        } else {
            return false;
        }
    }
}
