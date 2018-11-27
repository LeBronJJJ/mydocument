public class Test3{
	public static void main (String[] args){
		myprint(1);
		myprint(2);
		myprint(3);
		myprint(4);
	}
	
	public static void myprint(int x){
		if(x == 2){
			return;
		}
		else
			System.out.println(x);
	}
}