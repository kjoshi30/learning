import java.util.Scanner;
class shape{
	int length,breadth,height;
	public shape(int a,int b,int c){
		length 	= a;
		breadth = b;
		height 	= c;
	}
	
	public int volume(){
		return a*b*c;
	}
}
	
class cube{
	public static void main(String args[]){
		/*
			extend shape class and caluclate volume of a cube
		*/
		System.out.println("ENter dimensions:");
		Scanner x = new Scanner(System.in);
		int c = x.nextInt();
		int d = x.nextInt();
		int f = x.nextInt();
		
		shape cube = new shape(c,d,f);
		System.out.printl(cube.volume());
	}
}