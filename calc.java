import java.util.Scanner;

public class calc{

    public static void main(String[] args) {
    	float a, b, res;
	char choice, ch;
        
	Scanner scan = new Scanner(System.in);

	do{
		
		System.out.print("1. ADD TWO NUMBERS\n");
		System.out.print("2. EXIT\n");
		System.out.print("Enter Your Choice : ");
		choice = scan.next().charAt(0);	

		switch(choice){
			
			case '1' : System.out.print("Enter Two Number : ");
				   a = scan.nextFloat();
				   b = scan.nextFloat();
				   res = a+b;
				   System.out.print("Result = "+res+"\n");	
				   break;
			
			case '2' : System.exit(0);
				   break;
		
			default : System.out.print("INVALID CHOICE!!!");
				  break;
		}
    
	 }while(choice !=2);


    }		
}
