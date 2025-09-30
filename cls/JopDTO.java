package main.java.cls;

public class JopDTO {
	private String jopType; // 직업 분류
	private String companyName; // 회사명
	private String status; // 직급
	private String year; // 입사연도
	private int money; // 급여
	
	public String getJopType() {
		return jopType;
	}
	public void setJopType(String jopType) {
		this.jopType = jopType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "JopDTO [jopType=" + jopType + ", companyName=" + companyName + ", status=" + status + ", year=" + year
				+ ", money=" + money + "]";
	}
}
