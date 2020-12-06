package a_review.week12;

public class Login {

    public static void main(String[] args) {
        Credentials obj1 = new Credentials();
		 /*
        System.out.println("Username entered: "+ obj1.userName); // not visible
        System.out.println("Password entered: "+ obj1.passWord); // not visible

        System.out.println("=========================================");
        obj1.userName = "B123456"; // not visible
        obj1.passWord = "789456"; // not visible

        System.out.println("Username entered: "+ obj1.userName); // not visible
        System.out.println("Password entered: "+ obj1.passWord); // not visible
    */


        System.out.println("UserName entered :" + obj1.getUserName());
        System.out.println("Password entered :" + obj1.getPassWord());

        obj1.setUserName("newuser");
        obj1.SetPassWord("newpass");
        System.out.println("___________________________________________");
        System.out.println("New getUserName entered :" + obj1.getUserName());
        System.out.println("New Password entered :" + obj1.getPassWord());
    }

}
