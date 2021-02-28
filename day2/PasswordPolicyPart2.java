public class PasswordPolicyPart2 {

    public static boolean checkPasswordPolicy(String arg) {

        String myStr = arg;
        boolean passwordIsValid = false;

        int firstTime = Integer.parseInt(myStr.substring(0, myStr.indexOf("-")));
        int secondTime = Integer.parseInt(myStr.substring(myStr.indexOf("-") + 1, myStr.indexOf(" ")));
        char passwordMustContain = myStr.charAt(myStr.indexOf(" ") + 1);
        String password = myStr.substring(myStr.indexOf(" ", myStr.indexOf(" ") + 1) + 1, myStr.length());

        if (password.charAt(firstTime - 1) == passwordMustContain
                || password.charAt(secondTime - 1) == passwordMustContain) {
            passwordIsValid = true;
        }
        if (password.charAt(firstTime - 1) == passwordMustContain
                && password.charAt(secondTime - 1) == passwordMustContain) {
            passwordIsValid = false;
        }

        return (passwordIsValid);
    }
}