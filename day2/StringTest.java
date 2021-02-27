public class StringTest {

    public static void main(String[] args) {

        String myStr = "4-5 t: ftttttrvts";

        // System.out.println(myStr.indexOf("-"));
        // System.out.println(myStr.indexOf(" "));
        // System.out.println(myStr.indexOf(":"));
        // System.out.println(myStr.indexOf(" ", myStr.indexOf(" ")+1));
        // System.out.println(myStr.length());

        //System.out.println(myStr.substring(0, myStr.indexOf("-")));
        //System.out.println(myStr.substring(myStr.indexOf("-") + 1, myStr.indexOf(" ")));
        //System.out.println(myStr.substring(myStr.indexOf(" ") + 1, myStr.indexOf(":")));
        //System.out.println(myStr.substring(myStr.indexOf(" ", myStr.indexOf(" ") + 1) + 1, myStr.length()));

        int leastTime = Integer.parseInt(myStr.substring(0, myStr.indexOf("-")));
        System.out.println("leastTime "+ leastTime);
        int mostTime = Integer.parseInt(myStr.substring(myStr.indexOf("-") + 1, myStr.indexOf(" ")));
        System.out.println("mostTime " + mostTime);
        String passwordMustContain = myStr.substring(myStr.indexOf(" ") + 1, myStr.indexOf(":"));
        System.out.println("passwordMustContain "+passwordMustContain);
        String password = myStr.substring(myStr.indexOf(" ", myStr.indexOf(" ") + 1) + 1, myStr.length());
        System.out.println("password " + password);


    }

}