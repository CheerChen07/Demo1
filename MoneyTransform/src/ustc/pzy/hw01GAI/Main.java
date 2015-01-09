package ustc.pzy.hw01GAI;

import java.util.Scanner;

public class Main {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
//haahhhahasfdsd This is me.HAHAHAHAHA
//jiugai 中文试试
		Transform tf=new Transform();

		System.out.println("请输入一个阿拉伯金额");
		Scanner sc=new Scanner(System.in);
//		double value=sc.nextDouble();
		String money=sc.nextLine();
		while(!(money.equals("end"))){
			System.out.println(tf.CNValueOf(money));
			money=sc.nextLine();
		}
		
		sc.close();
		
//		if(value/1000000000>0){
//			System.out.println(value/1000000000);
//			System.out.println("wrong");
//			System.exit(0);
//		}
//		System.out.println(value);
//		tf.TransformInterger(value);
		
	}

}
