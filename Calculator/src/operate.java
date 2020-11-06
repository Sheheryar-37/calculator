import java.util.Scanner;

class operate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj=new calculator();
Scanner input =new Scanner(System.in);
 
  
   System.out.println("which type of calculator want");
   System.out.println("press 1 for int");
   System.out.println("press 2 for double");
   int choice=input.nextInt();
   if(choice==1){
	   System.out.println("enter first number");
	   int a=input.nextInt();
	   System.out.println("enter second number");
	   int b=input.nextInt();
	   System.out.println("enter 1 to add 2 to subtract 3 to multiply 4 to divide");
	   int ch=input.nextInt();
	 if(ch==1) {
		 System.out.println("answer is"+obj.add(a,b));	 
	 }
	  
   if(ch==2) {
	   System.out.println("answer is"+obj.sub(a,b));   
   }
   
if(ch==3) {
	System.out.println("answer is"+obj.mul(a,b));   
   }

if(ch==4) {
	System.out.println("answer is"+obj.div(a,b));   
}
  
   
   
	}
   
   if(choice==2){
	  
	   double a=input.nextDouble();
	   double b=input.nextDouble();
	  
	   System.out.println("enter 1 to add, 2 to subtract, 3 to multiply or 4 to divide");
	   int ch=input.nextInt();
	 if(ch==1) {
		 System.out.println("answer is"+obj.add(a,b));	 
	 }
	  
   if(ch==2) {
	   System.out.println("answer is"+obj.sub(a,b));   
   }
   
if(ch==3) {
	System.out.println("answer is"+obj.mul(a,b));   
   }

if(ch==4) {
	System.out.println("answer is"+obj.div(a,b));   
}
}
	}
}



      class calculator {
		
		public int add (int x,int y){
			return x+y;
		}
		public double add (double x,double y){
			return x+y;
		}
		public int sub (int x,int y){
			return x-y;
		}
		public double sub (double x,double y){
			return x-y;
		}
		public int mul (int x,int y){
			return x*y;
		}
		public double mul (double x,double y){
			return x*y;
		}
		public int div (int x,int y){
			return x/y;
		}
		public double div (double x,double y){
			return x/y;
		}
		
	}


	

 
