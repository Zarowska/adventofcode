public class Day2 {
    public static void main(String[] args) {

        ListPasswords list2 = new ListPasswords();
      
        list2 = ListPasswords.createListFromFile("file.txt");
        System.out.println("countLines: " + list2.countLines());
   
       
        System.out.println("list2: "+ list2);
    
    }
        }
    