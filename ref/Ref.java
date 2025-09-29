package main.java.ref;

import java.time.LocalDateTime;
import java.util.Scanner;

import main.java.cls.UserDTO;
import main.java.loop.Loop;

public class Ref {
	public String[][] accountInfoArr2 = {	
			{"102-555-4444", "홍길동", "1111", "0", ""},
			{"122-555-4444", "홍길동2", "2222", "0", ""},
			{"133-555-4444", "홍길동3", "3333", "0", ""},
			{"144-555-4444", "홍길동4", "4444", "0", ""},
			{"155-555-4444", "홍길동5", "5555", "0", ""},
			{"166-555-4444", "홍길동6", "6666", "0", ""},
			{"177-555-4444", "홍길동7", "7777", "0", ""},
			{"188-555-4444", "홍길동8", "8888", "0", ""},
	};
	
	
	public void example1() {
		String name = new String();
		boolean result = name.equals("홍길동");
		System.out.println(result);

		Loop lp = new Loop();
		lp.example3();
	}

	public void example2() {
		String[] nameList = new String[10];

		nameList[0] = "홍길동0";
		nameList[1] = null;
		nameList[2] = "홍길동2";
		nameList[3] = "홍길동3";
		nameList[4] = "홍길동4";
		nameList[5] = "홍길동5";
		nameList[6] = "홍길동6";
		nameList[7] = "홍길동8";
		nameList[8] = "홍길동9";
		nameList[9] = "홍길동10";

		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i] == null) {
				continue;
			}
			if (nameList[i].equals("홍길동5")) {
				continue;
			}
			if (nameList[i].equals("홍길동10")) {
				continue;
			}
			System.out.println(nameList[i]);
		}

	}
	
	public void example3() {
		String name ="홍길동";
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		String[] nameArr = {"홍길동", "이길동", "삼길동", "홍길동2"};
		String[] findArr = new String[10];
		String[] shllowNameArr = nameArr;
		int count = 0;
		for (int i = 0; i < nameArr.length; i++) {
			char data = nameArr[i].charAt(0);
			if(data == '홍') {
				findArr[count++] = nameArr[i];
			}
		}
		System.out.println("===========================");
		for (int i = 0; i < findArr.length; i++) {
			findArr[i] = "황길동";
			System.out.println(findArr[i]);
		}
		System.out.println("===========================");
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
		System.out.println("===========================");
		for (int i = 0; i < shllowNameArr.length; i++) {
			shllowNameArr[i] = "황길동";
			System.out.println(shllowNameArr[i]);
		}
		System.out.println("===========================");
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
	}
	
	/**
	 * 문자열의 길이를 확인하는 or 제공하는 메소드.
	 * @author 전은호
	 * @param x
	 * @return x
	 * @exception 배열 잘못다루면 큰일남.
	 * 
	 * */
	public void example4() {
		String name = "홍길동";
		String[] nameArr = {"홍길동", "이길동", "삼길동", "홍길동2", "콰우저우쳉", "트랄라레로 트랄랄라"};
		System.out.println(name.length());
		for (int i = 0; i < nameArr.length; i++) {
			if(nameArr[i].length() > 5) {
				System.out.println("수정 실패");
			} else {
				System.out.println("수정 성공");
			}
		}
	}
	
	public void example5() {
		String name = "홍길동@";
		System.out.println(name);
		name = name.replace("!", "");
		name = name.replace("@", "");
		System.out.println(name);
		// replace(); 
		// replaceAll();
	}
	
	public void example6() {
		String text = "오늘은 월요일이고 이번주만 넘기면 추석이다 야호!";
		System.out.println(text);
		text = text.substring(0);
		text = text.substring(4, 7);
		System.out.println(text);
		//월요일만 출력
	}
	
	public void example7() {
		String text = "오늘은 월요일이고 이번주만 넘기면 추석이다 야호!";
		if(text.indexOf("@") > -1) {
			System.out.println("일치하는 데이터가 존재합니다.");
		} else {
			System.out.println("일치하는 데이터가 없습니다.");
		}
		System.out.println(text.indexOf("@"));
	}
	
	public void example8() {
		String text = "홍길동,이길동,삼길동,사길동,오길동";
		System.out.println(text);
		String[] nameArr = text.split(",");
		for (int i = 0; i < nameArr.length; i++) {
			if(nameArr[i].equals("오길동")) {
				System.out.print(nameArr[i]);
			} else {
				System.out.print(nameArr[i]+",");
			}
		}
	}
	
	public void bankRun(UserDTO userDTO) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		// 사람 : 8
		// 정보 : 5 계좌, 사람이름, 비밀번호, 잔액, 입출력내역
		//[0][0] = 계좌
		//[0][1] = 사람이름
		//[0][2] = 비밀번호
		//[0][3] = 잔액
		//[0][4] = 입출력내역
		String[][] accountInfoArr = {	
				{"111-1111-1111", "홍길동", "1111", "0", ""},
		};
		
		while(run) {
			System.out.println("1. 입금, 2. 출금, 3. 목록조회, 4. 조회, 5. 입출금내역");
			int choiceNum = sc.nextInt();
			if(choiceNum == 1) {
				System.out.println("입금을 선택하셨습니다.");
				
				System.out.println("계좌번호를 입력해주세요.");
				String accountAddr = sc.next();
				String resultAccVer = accountVerify(accountInfoArr, accountAddr);
				if(resultAccVer == null) {
					continue;
				}
				
				System.out.println("비밀번호를 입력해주세요.");
				String resultAccPwdVer = accountPwdVerify(accountInfoArr, sc);
				if(resultAccPwdVer == null) {
					continue;
				}
				
				addAccountMoney(userDTO, sc);
			} else if(choiceNum == 2){
				System.out.println("출금을 선택하셨습니다.");
				
				System.out.println("계좌번호를 입력해주세요.");
				String accountAddr = sc.next();
				String resultAccVer = accountVerify(accountInfoArr, accountAddr);
				if(resultAccVer == null) {
					continue;
				}
				
				System.out.println("비밀번호를 입력해주세요.");
				String resultAccPwdVer = accountPwdVerify(accountInfoArr, sc);
				if(resultAccPwdVer == null) {
					continue;
				}
				
				removeAccountMoney(userDTO, sc);
			} else if(choiceNum == 3){
				System.out.println("목록조회를 선택하셨습니다.");
				for (int i = 0; i < accountInfoArr.length; i++) {
					for (int j = 0; j < accountInfoArr[i].length; j++) {
						System.out.printf("%12s", accountInfoArr[i][j]);
					}
					System.out.println();
				}
			} else if(choiceNum == 4){
				System.out.println("조회를 선택하셨습니다.");
				
				System.out.println("계좌번호를 입력해주세요.");
				String accountAddr = sc.next();
				String resultAccVer = accountVerify(accountInfoArr, accountAddr);
				if(resultAccVer == null) {
					continue;
				}
				
				System.out.println("비밀번호를 입력해주세요.");
				String resultAccPwdVer = accountPwdVerify(accountInfoArr, sc);
				if(resultAccPwdVer == null) {
					continue;
				}
				
				getAccountInfo(userDTO);
				
			} else if(choiceNum == 5){
				System.out.println("입출금 내역을 선택하셨습니다.");
				
				System.out.println("계좌번호를 입력해주세요.");
				String accountAddr = sc.next();
				String resultAccVer = accountVerify(accountInfoArr, accountAddr);
				if(resultAccVer == null) {
					continue;
				}
				
				System.out.println("비밀번호를 입력해주세요.");
				String resultAccPwdVer = accountPwdVerify(accountInfoArr, sc);
				if(resultAccPwdVer == null) {
					continue;
				}
				
				getAccountHistory(accountInfoArr, resultAccVer, resultAccPwdVer);
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println("종료");
				run = false;
			}
		}
	}
	
	public void getAccountHistory(String[][] accountInfoArr, String accountAddr, String accountPwd) {
		for (int i = 0; i < accountInfoArr.length; i++) {
			if (accountInfoArr[i][0].equals(accountAddr) && accountInfoArr[i][2].equals(accountPwd)) {
				System.out.println(accountInfoArr[i][1] + "님 입출금 내역 조회 > ");
	            if(accountInfoArr[i][4].indexOf(",") > -1) {
	            	String[] balanceHistory = accountInfoArr[i][4].split(",");
	            	for (int j = 0; j < balanceHistory.length; j++) {
						System.out.println(balanceHistory[j]);
					}
	            } else {
	            	System.out.println("입출금 내역이 없습니다.");
	            }
		        break;
            }
		}
	}
	public void addAccountMoney(UserDTO userDTO, Scanner sc) {
		System.out.println("입금하시려는 금액을 입력해주세요.");
		
		int addMoney = 0;
        int accountMoney = Integer.parseInt(userDTO.getPropertyDTO().getAccountPrice());
        addMoney = sc.nextInt();
        accountMoney += addMoney;
        userDTO.getPropertyDTO().setAccountPrice(Integer.toString(accountMoney));
        System.out.println("현재잔액 > " + userDTO.getPropertyDTO().getAccountPrice());
	}
	
	public void removeAccountMoney(UserDTO userDTO, Scanner sc) {
		System.out.println("출금하시려는 금액을 입력해주세요.");
		
		int removeMoney = 0;
        int accountMoney = Integer.parseInt(userDTO.getPropertyDTO().getAccountPrice());
		while (true) {
			removeMoney = sc.nextInt();
			if (removeMoney > accountMoney) {
				System.out.println("출금하시려는 금액이 잔액보다 큽니다.");
				System.out.println("다시 입력해주세요.");
			} else {
				break;
			}
		}
       
        accountMoney -= removeMoney;
        userDTO.getPropertyDTO().setAccountPrice(Integer.toString(accountMoney));
        System.out.println("현재잔액 > " + userDTO.getPropertyDTO().getAccountPrice());
        
	}
	
	public void getAccountInfo(UserDTO userDTO) {
		System.out.println(userDTO.getPropertyDTO().toString());
	}
	
	public String accountPwdVerify(String[][] accountInfoArr, Scanner sc) {
		int cnt = 0;
	    while (cnt < 3) {
	    	String accountPwd = sc.next();
	        for (int i = 0; i < accountInfoArr.length; i++) {
	            if (accountInfoArr[i][2].equals(accountPwd)) {
	                return accountInfoArr[i][2];
	            }
	        }
	        cnt++;
	        if (cnt >= 3) {
	            System.out.println("3회 이상 시도하였습니다. 종료.");
	            return null;
	        }
	        System.out.println("비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
	    }
	    return null;
	}

	public String accountVerify(String[][] accountInfoArr, String accountAddr) {
		for (int i = 0; i < accountInfoArr.length; i++) {
			if(accountInfoArr[i][0].equals(accountAddr)) {
				return accountInfoArr[i][0];
			}
		}
		System.out.println("일치하는 계좌번호가 없습니다.");
		return null;
	}
	
//	public void subString(int index) {
//		
//	}
//	
//	public void subString(double index) {
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
