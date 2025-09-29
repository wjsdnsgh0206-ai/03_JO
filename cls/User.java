package main.java.cls;

import java.util.Arrays;
import java.util.Scanner;

import main.java.ref.Ref;

public class User {
	//사람 클래스, 필요한 속성
	//이름, 키, 나이, 성별
	public String name = "홍길동";
	public int height = 180;
	public int age = 20;
	public char gender = '남';
	
	public User() {
		
	}
	public User(String name) {
		System.out.println("매개변수 있음 1개");
	}
	public User(String name, int height, int age, char gender) {
		System.out.println("User 객체 생성");
		this.name = name;
		this.height = height;
		this.age = age;
		this.gender = gender;
	}
	
	
	public void getUserInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(gender);
	}
	
	public void runUserAction() {
		System.out.println(name+"이 걷는다.");
	}
	
	public void stopUserAction() {
		System.out.println(name+"이 멈춘다.");
	}
	
	
	public void intArr1(int...arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public void intArr2(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public void runUserApp() {
		boolean run = true;
		UserDTO userDTO = new UserDTO();
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("1. 회원정보, 2. 차량정보, 3. 재산정보, 4. 직업정보, 5. 은행");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("> 회원정보");
				System.out.println("1. 회원조회, 2. 입력, 3. 수정, 4. 삭제");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					System.out.println("> 회원조회");
					System.out.println(userDTO.toString());
					System.out.println("> 입력");
					System.out.println("> 이름");
					userDTO.setName(sc.next());
					System.out.println("> 성별");
					userDTO.setGender(sc.next());
					System.out.println("> 국적");
					userDTO.setNation(sc.next());
					System.out.println("> 키");
					userDTO.setHeight(sc.nextInt());
					System.out.println("> 몸무게");
					userDTO.setWeight(sc.nextInt());
					System.out.println("> 혈액형");
					userDTO.setBloodType(sc.next());
					System.out.println("> MBTI");
					userDTO.setMbti(sc.next());
					
				} else if(num2 == 2) {
					continue;
				} else if(num2 == 3) {
					continue;
				} else if(num2 == 4) {
					continue;
				} else {
					continue;
				}
				
			} else if(num == 2) {
				// 차 목록 조회, 차구매, 차 판매, 뒤로가기
				System.out.println("> 차량정보");
				System.out.println("1. ");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					continue;
				} else if(num2 == 2) {
					continue;
				} else if(num2 == 3) {
					continue;
				} else if(num2 == 4) {
					continue;
				} else {
					continue;
				}
				
			} else if(num == 3) {
				// 재산 조회(차 구매일시, 취직, 이직, 퇴직 일시 등)
				System.out.println("> 재산정보");
				System.out.println("1. ");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					continue;
				} else if(num2 == 2) {
					continue;
				} else if(num2 == 3) {
					continue;
				} else if(num2 == 4) {
					continue;
				} else {
					continue;
				}
				
			} else if(num == 4) {
				// 직업 조회, 취직, 이직, 퇴사 , 월금 협상하기
				System.out.println("> 직업정보");
				System.out.println("1. ");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					continue;
				} else if(num2 == 2) {
					continue;
				} else if(num2 == 3) {
					continue;
				} else if(num2 == 4) {
					continue;
				} else {
					continue;
				}
				
			}  else if(num == 5) {
				System.out.println("은행");
				Ref ref = new Ref();
				ref.bankRun(userDTO);
			} else {
				run = false;
			}
		}
	}
}





