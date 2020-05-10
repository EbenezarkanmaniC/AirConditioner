import java.util.*;
import java.lang.*; 

class AirConditioner
{
	int temp=30;
	char x;
	
	void setTemp(char x)
	{
			
		if(x=='i')
		{
			if(temp>=30)
				System.out.println("Cannot change tempurature");
			else
			{
			  temp=temp+1;
			System.out.println("Now the temperature is "+temp); 
			}
		}
		if(x=='d')
		{
			if(temp<=17)
				System.out.println("Cannot change tempurature");
			else
			{
			temp=temp-1;
			System.out.println("Now the temperature is "+temp);
			}
		}
	}
	void turnOn()
	{
		
				int flag=1;	
				Scanner sc=new Scanner(System.in);
				do
				{
					System.out.println("Do you want to increase or decrease temperature INCREASE==> i  DECREASE==> d  else press 'e'");
					x=sc.next().charAt(0);
					if(x=='i' ||x=='d')
					  setTemp(x);
					else 
						
						flag=0;
				}while(flag==1);
		
	}
	public static void main(String aa[])
	{
	    int s;
		Scanner sc=new Scanner(System.in);
		AirConditioner ac=new AirConditioner(); 
		System.out.print("1.ON 2.OFF Air conditioner");
		s=sc.nextInt();
		if(s==1)
			ac.turnOn();
		else 
			System.exit(0);
	}

}