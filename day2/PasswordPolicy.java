public class PasswordPolicy {

    public static boolean checkPasswordPolicy(String arg) {

        String myStr = arg;
        boolean passwordIsValid = false;
        int amountObligatoryCharInPass = 0;

        int leastTime = Integer.parseInt(myStr.substring(0, myStr.indexOf("-")));
        int mostTime = Integer.parseInt(myStr.substring(myStr.indexOf("-") + 1, myStr.indexOf(" ")));
        char passwordMustContain = myStr.charAt(myStr.indexOf(" ") + 1);
        String password = myStr.substring(myStr.indexOf(" ", myStr.indexOf(" ") + 1) + 1, myStr.length());

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == passwordMustContain) {
                amountObligatoryCharInPass++;
            }
        }

        if (amountObligatoryCharInPass >= leastTime && amountObligatoryCharInPass <= mostTime) {
            passwordIsValid = true;
        }

        return (passwordIsValid);
    }
}  