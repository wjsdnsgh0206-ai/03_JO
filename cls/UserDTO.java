package main.java.cls;

public class UserDTO {
	private String name;
	private String gender;
	private String nation;
	private int height;
	private int weight;
	private int age;
	private String bloodType;
	private String mbti;
	
	private CarDTO carDTO = new CarDTO(); // 차량정보
	private PropertyDTO propertyDTO = new PropertyDTO(); // 재산(집) 정보
	private JopDTO JopDTO = new JopDTO(); // 직업정보
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getMbti() {
		return mbti;
	}
	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	public CarDTO getCarDTO() {
		return carDTO;
	}
	public void setCarDTO(CarDTO carDTO) {
		this.carDTO = carDTO;
	}
	public PropertyDTO getPropertyDTO() {
		return propertyDTO;
	}
	public void setPropertyDTO(PropertyDTO propertyDTO) {
		this.propertyDTO = propertyDTO;
	}
	public JopDTO getJopDTO() {
		return JopDTO;
	}
	public void setJopDTO(JopDTO jopDTO) {
		JopDTO = jopDTO;
	}
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", gender=" + gender + ", nation=" + nation + ", height=" + height
				+ ", weight=" + weight + ", age=" + age + ", bloodType=" + bloodType + ", mbti=" + mbti + ", carDTO="
				+ carDTO + ", propertyDTO=" + propertyDTO + ", JopDTO=" + JopDTO + "]";
	}
}
