public class Test2{
	public static void main(String[]args){
		byte data = (byte) 200;
		char c = 'a';
		int b = 10;
		int num = c;								//这样可以打出字母的ASCII码
		System.out.println(data);					//res = -56
		System.out.println(num);
		System.out.println(1.1 * (double)1.1);		//儅計算時都爲int型   給其中一個强轉為double后可獲得精確計算結果
		System.out.println(c < b);					//对比时使用的是美国信息交换标准代码ASCII码😂
		System.out.println("5" + 2);				//结果为52
	}
}