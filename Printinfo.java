import java.util.*;
public class Printinfo{
	/**
	 * @param args
	 */
	public static void main(String[] args){
		//需要给用户开一个通过键盘录入程序的入口
		Scanner input = new Scanner(System.in);
		//使用input获得字符串
		System.out.print("请输入姓名：");
		String name = input.next();
		
		System.out.print("性别：");
		String sex = input.next();
		
		System.out.print("年龄：");
		int age = input.nextInt();
		
		System.out.print("成绩：");
		double score = input.nextDouble();
		
		
		System.out.println("姓名："+name);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
		System.out.println("考试分数："+score);
	}
}