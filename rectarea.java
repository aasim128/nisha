class rectangle
{
	int length, width;
	void setdata(int x, int y)
	{
	 length=x;
	 width=y;
	}
	 int getarea( )
	{ 
	 return(length * width);
	}
}
class rectarea 
{
 	public static void main(String[]args)
	{
	rectangle r1=new rectangle();
	r1.length=30;
	r1.width=20;
	int x= r1.getarea( );
	rectangle r2=new rectangle();
	r2.length=30;
	r2.width=80;
	int y= r2.getarea( );
	System.out.println("the area of a rectangle is"+x);
	System.out.println("the area of a rectangle is"+y);
	}
}

	
	 