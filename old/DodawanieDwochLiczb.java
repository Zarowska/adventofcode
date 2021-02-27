public class DodawanieDwochLiczb {


    public  static  void  main (String[] arg) {

        System.out.println("Pierwszy argument "+arg[0]);
        System.out.println("Drugi argument "+arg[1]);

        try
        {
        Integer x =  Integer.parseInt(arg[0]);
        Integer y =  Integer.parseInt(arg[1]);
        Integer suma = x+y;
        Integer iloczyn = x*y;
        System.out.println( arg[0]+"+"+arg[1] + "=" + suma);
        System.out.println( arg[0]+"*"+arg[1] + "=" + iloczyn);
        }
        catch (NumberFormatException e)
        { System.err.println("The number entered incorrectly");
        }


}
}