public class StringTest {

    public static void main(String[] args) {

        String myStr = "4-5 t: ftttttrvts";

        int leastTime = Integer.parseInt(myStr.substring(0, myStr.indexOf("-")));
        System.out.println("leastTime "+ leastTime);
        int mostTime = Integer.parseInt(myStr.substring(myStr.indexOf("-") + 1, myStr.indexOf(" ")));
        System.out.println("mostTime " + mostTime);

        char passwordMustContain = myStr.charAt(myStr.indexOf(" ") + 1);
        System.out.println("passwordMustContain "+passwordMustContain);

        String password = myStr.substring(myStr.indexOf(" ", myStr.indexOf(" ") + 1) + 1, myStr.length());
        System.out.println("password " + password);

        int amountObligatoryCharInPass = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == passwordMustContain) {
                amountObligatoryCharInPass++;
            }
         }

         System.out.println("amountObligatoryCharInPass " + amountObligatoryCharInPass);

         if (amountObligatoryCharInPass >= leastTime && amountObligatoryCharInPass <= mostTime )  {
            System.out.println("ok ");

         }
     
     }

}