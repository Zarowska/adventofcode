public class Day2 {
    public static void main(String[] args) {

        int quantityValidPasswords = 0;
        int quantityValidPasswordsPart2 = 0;
        ListPasswords myList = new ListPasswords();

        myList = ListPasswords.createListFromFile("file.txt");

        for (int i = 0; i < myList.countLines(); i++) {
            if (PasswordPolicy.checkPasswordPolicy(myList.getLine(i))) {
                quantityValidPasswords++;
            };
        }

        System.out.println("The first part of the task: Quantity valid passwords is equal to " + quantityValidPasswords);

        for (int i = 0; i < myList.countLines(); i++) {
            if (PasswordPolicyPart2.checkPasswordPolicy(myList.getLine(i))) {
                quantityValidPasswordsPart2++;
            };
        }

        System.out.println("The second part of the task: Quantity valid passwords is equal to " + quantityValidPasswordsPart2);
    }
}