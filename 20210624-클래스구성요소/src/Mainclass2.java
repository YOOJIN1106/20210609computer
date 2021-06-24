/*
 * 
 *  	변수 종류
 *  	======
 *  
 *  	=======================================================
 *  					변수 생성(메모리)				변수 유지
 *  	========================================================
 * 		인스터턴스 변수 
 *  	========================================================
 *  	정적변수(공유변수)
 *  	=======================================================
 *  	지역변수
 *  	=======================================================
 * 
 * 		인스턴스 변수
 * 		class ClassName{
 * 			데이터형 변수명;
 * 			static 데이터형 변수명;	전역변수=> 클래스 전체에서 사용	
 * 
 * 
 * 		리턴형 메소드명()	
 * 		{
 *			지역변수 
 * 		}
 * }
 * 
 * 	class ClassName{ 
 * 		String name="홍길동";
 * 		void Print()
 * 		{
 * 			String name="박문수"
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
		System.out.println("m1="+m1); //실제 주소값 출력
		m1.title="발신제한";
		m1.director="김창주";
		m1.actor="조우진,이재인,진경,지창욱,김지호";
		m1.genre="스릴러/드라마";
		m1.grade="15세이상관람가";
		m1.isShow=true;
		
		System.out.println("영화명:" +m1.title);
		System.out.println("감독:" +m1.director);
		System.out.println("출연:" +m1.actor);
		System.out.println("장르:" +m1.genre);
		System.out.println("등급:" +m1.grade);
		System.out.println(m1.isShow==true?"상영중":"개봉예정");
		
		Movie m2=new Movie();
		System.out.println("m2="+m2);
		m2.title="발신제한";
		m2.director="김창주";
		m2.actor="조우진,이재인,진경,지창욱,김지호";
		m2.genre="스릴러/드라마";
		m2.grade="15세이상관람가";
		m2.isShow=false;
		System.out.println("영화명:" +m2.title);
		System.out.println("감독:" +m2.director);
		System.out.println("출연:" +m2.actor);
		System.out.println("장르:" +m2.genre);
		System.out.println("등급:" +m2.grade);
		System.out.println(m1.isShow==false?"상영중":"개봉예정");

	}

}
