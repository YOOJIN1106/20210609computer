/*
 * 
 *  	���� ����
 *  	======
 *  
 *  	=======================================================
 *  					���� ����(�޸�)				���� ����
 *  	========================================================
 * 		�ν����Ͻ� ���� 
 *  	========================================================
 *  	��������(��������)
 *  	=======================================================
 *  	��������
 *  	=======================================================
 * 
 * 		�ν��Ͻ� ����
 * 		class ClassName{
 * 			�������� ������;
 * 			static �������� ������;	��������=> Ŭ���� ��ü���� ���	
 * 
 * 
 * 		������ �޼ҵ��()	
 * 		{
 *			�������� 
 * 		}
 * }
 * 
 * 	class ClassName{ 
 * 		String name="ȫ�浿";
 * 		void Print()
 * 		{
 * 			String name="�ڹ���"
 * 			System.out.println(name);
 *   	}
 *   
 * }
 *  
 */

class Movie{
	String title;
	String director;
	String genre;
	String actor;
	String grade;
	boolean isShow;
	
	
}
public class Mainclass2 {

	public static void main(String[] args) {
		Movie m1=new Movie(); //m1=> title,director,actor,genre,grade,isShow
		System.out.println("m1="+m1); //���� �ּҰ� ���
		m1.title="�߽�����";
		m1.director="��â��";
		m1.actor="������,������,����,��â��,����ȣ";
		m1.genre="������/���";
		m1.grade="15���̻������";
		m1.isShow=true;
		
		System.out.println("��ȭ��:" +m1.title);
		System.out.println("����:" +m1.director);
		System.out.println("�⿬:" +m1.actor);
		System.out.println("�帣:" +m1.genre);
		System.out.println("���:" +m1.grade);
		System.out.println(m1.isShow==true?"����":"��������");
		
		Movie m2=new Movie();
		System.out.println("m2="+m2);
		m2.title="�߽�����";
		m2.director="��â��";
		m2.actor="������,������,����,��â��,����ȣ";
		m2.genre="������/���";
		m2.grade="15���̻������";
		m2.isShow=false;
		System.out.println("��ȭ��:" +m2.title);
		System.out.println("����:" +m2.director);
		System.out.println("�⿬:" +m2.actor);
		System.out.println("�帣:" +m2.genre);
		System.out.println("���:" +m2.grade);
		System.out.println(m1.isShow==false?"����":"��������");

	}

}
