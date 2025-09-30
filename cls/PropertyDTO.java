package main.java.cls;

public class PropertyDTO {
	private String residential; // 주거구분 아파트, 주택, 상가
	private int housePrice; // 가격
	private int houseArea; // 집 면적
	private String account = "111-1111-1111"; // 계좌번호
	private String accountPwd = "1111"; // 계좌비밀번호
	private String accountPrice = "0"; // 잔액
	
	public String getResidential() {
		return residential;
	}
	public void setResidential(String residential) {
		this.residential = residential;
	}
	public int getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}
	public int getHouseArea() {
		return houseArea;
	}
	public void setHouseArea(int houseArea) {
		this.houseArea = houseArea;
	}
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
	public String getAccountPrice() {
		return accountPrice;
	}
	public void setAccountPrice(String accountPrice) {
		this.accountPrice = accountPrice;
	}

	@Override
	public String toString() {
		return "PropertyDTO [residential=" + residential + ", housePrice=" + housePrice + ", houseArea=" + houseArea
				+ ", account=" + account + ", accountPwd=" + accountPwd + ", accountPrice=" + accountPrice + "]";
	}
	
	
}
