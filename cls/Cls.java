package main.java.cls;

public class Cls {
	
	// 사람 클래스, 필요한 속성
	// 이름, 키, 나이, 성별
	public String name = "홍길동";
	public int height = 180;
	public int age = 80;
	public char gender = '남';
	
	public Cls(String mainName, int maineHight, int mainAge, char mainGender){
		System.out.println("Cls 객체 생성");
		System.out.println(mainName);
		System.out.println(maineHight);
		System.out.println(mainAge);
		System.out.println(mainGender);
		
		// this = 클래스 내부에 있는 구성요소
		// 클래스 내부에 있는 것을 명시해줌
		this.name = mainName;
		this.height = maineHight;
		this.age = mainAge;
		this.gender = mainGender;
	}
	
	
	
	  public void getUserInfo() { 
		  System.out.println(name);
		  System.out.println(height);
		  System.out.println(age);
		  System.out.println(gender);
		  }
	  
	  public void runUserAction() { 
		  System.out.println(name + "이 걷는다"); 
	  }
	  
	  public void stopUserAction() { 
		  System.out.println(name + "이 멈춘다"); 
	  }
	 
	  
	  
	  
	
	
}
