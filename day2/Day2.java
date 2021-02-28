public class Day2 {
    public static void main(String[] args) {

     int quantityValidPasswords = 0;
     ListPasswords myList = new ListPasswords();

     myList = ListPasswords.createListFromFile("file.txt");

     for (int i = 0; i < myList.countLines(); i++) {
         if (PasswordPolicy.checkPasswordPolicy(myList.getLine(i))) {
             quantityValidPasswords++;
         };
     }

     System.out.println("Quantity valid passwords is equal to " + quantityValidPasswords + ". The first part of the task.");
 }
}