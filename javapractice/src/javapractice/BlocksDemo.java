package javapractice;

public class BlocksDemo 
{
	//creating static block
	static {
	System.out.println("static block 1 is executed");	
	}
	
	//creating instance block
	{
		System.out.println("instance block 1 is executed");
	}
	
	//creating constructor
		BlocksDemo() 
		{
			System.out.println("Constructor is executed");	
			{
				System.out.println("Instance block in Constructor is executed");	
			}
		}
	//creating instance block
	{
		System.out.println("instance block 2 is executed");
	}
	
	static 
	{
		System.out.println("static block 2 is executed");	
	}
	
		public static void main(String[] args) 
		{
			BlocksDemo object1=new BlocksDemo();
			System.out.println("-----After creating another object---------------");
			BlocksDemo object2=new BlocksDemo();
			System.out.println("-----After creating another object-2---------------");

		}

}
