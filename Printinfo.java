import java.util.*;
public class Printinfo{
	/**
	 * @param args
	 */
	public static void main(String[] args){
		//��Ҫ���û���һ��ͨ������¼���������
		Scanner input = new Scanner(System.in);
		//ʹ��input����ַ���
		System.out.print("������������");
		String name = input.next();
		
		System.out.print("�Ա�");
		String sex = input.next();
		
		System.out.print("���䣺");
		int age = input.nextInt();
		
		System.out.print("�ɼ���");
		double score = input.nextDouble();
		
		
		System.out.println("������"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("���䣺"+age);
		System.out.println("���Է�����"+score);
	}
}