import java.util.Scanner;

public class VolumesMenu
{
   public static void main(String [] args)
      {
          Scanner input = new Scanner(System.in);
          int selection;
        
       do
         {
             menuPrompt();
             selection = input.nextInt();
            
       switch (selection)
               {
                  case 1:
                     System.out.printf("cuboid(2, 4, 6): volume = %.2f%n", Volumes.cubiod(2,4,6));
                     break;
                  case 2:
                     System.out.printf("cuboid(4): volume = %.2f%n", Volumes.cubiod(4));
                     break;
                  case 3:
                     System.out.printf("ellipsoid(2, 4, 6): volume = %.2f%n", Volumes.ellipsoid(2,4,6)); 
                     break;
                  case 4:
                     System.out.printf("ellipsoid (4): volume = %.2f%n", Volumes.ellipsoid(4));
                     break;
                  case 5:
                     System.out.printf("cylinder(3, 4): volume = %.2f%n", Volumes.cylinder(3,4));
                     break;
                  case 6:
                     System.out.printf("cone(6, 5): volume = %.2f%n", Volumes.cone(6,5)); 
                     break;   
                  case 0:
                     System.out.print("Good Bye!");
                     break;
                  default:
                     System.out.printf("Invalid input%n");
                     break;
               }
            
         }while(selection != 0);      
  	}

      
      
public static void menuPrompt()
	{   
	    System.out.printf("%-25s%-25s%n", "1 .. cuboid (2, 4, 6)", "2 .. cuboid(4)");
       System.out.printf("%-25s%-25s%n", "3 .. ellipsoid(2, 4, 6)", "4 .. ellipsoid (4)");
		 System.out.printf("%-25s%-25s%n", "5 .. cylinder(3,4)", "6 .. cone (6, 5)");
		 System.out.printf("0 .. exit%n");
		 System.out.print ("Your choice: ");
	}
}