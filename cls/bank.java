package main.java.cls;

public class bank {
	private String account = "111-1111-1111"; // 계좌번호
	private String accountPwd = "1111"; // 계좌비밀번호
	private String inoutlist = ""; // 입출력내역
	
	public String getAccount() {
		return account;
	}



	public void setAccount(String account) {
		this.account = account;
	}



	public String getAccountPwd() {
		return accountPwd;
	}



	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}



	public String getInoutlist() {
		return inoutlist;
	}



	public void setInoutlist(String inoutlist) {
		this.inoutlist = inoutlist;
	}




	
	@Override
	public String toString() {
		return "bank [account=" + account + ", accountPwd=" + accountPwd + ", inoutlist=" + inoutlist + "]";
	}
	

}
