import java.util.Scanner;
class stack
{
	int[]arr;
	int size;
	int t1,t2;
	
	stack(int n)
	{
		size =n;
		arr =new int [n];
		t1=n/2+1;
		t2=n/2;
	}
	void push1(int p)
	{
		if(t1>0)
		{
			t1--;
			arr[t1]=p;
		}
		else
		{
			System.out.print("");
			return;
		}
	}
	void push2(int p)
	{
		if (t2<size-1)
		{
			t2++;
			arr[t2]=p;
		}
		else
		{
			System.out.print("");
			return;
		}
	}
	int pop1()
	{
		if (t1>=0){
			int p =arr[t1];
			t1--;
			return p;
		}
		else{
			System.out.print("stack under");
			System.exit(1);
		}
		return 0;
	}
	int pop2()
	{
		if (t2<size){
			int p =arr[t2];
			t2++;
			return p;
		}
		else{
			System.out.print("stack under");
			System.exit(1);
		}
		return 0;
	}
	
	
	public static void main(String[]args)
	{
		stack ts= new stack(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		
		System.out.println("popped element from stack1 is 11" );
		ts.push2(40);
		
		
		System.out.println("popped element from stack2 is 40" );
	}
}
		
		
		
		
		