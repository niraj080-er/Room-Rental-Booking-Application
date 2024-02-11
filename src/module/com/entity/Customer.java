package module.com.entity;

public class Customer {
	private int cId;
	private String cNmae;
	private String email;
	private long phoneNo;
	private Address a;
	private int age;
	private double cAmount;
	private String roomType;
	public Customer(int cId, String cNmae, String email, long phoneNo, Address address, int age, double cAmount,
			String roomType) {
		super();
		this.cId = cId;
		this.cNmae = cNmae;
		this.email = email;
		this.phoneNo = phoneNo;
		this.a = address;
		this.age = age;
		this.cAmount = cAmount;
		this.roomType = roomType;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcNmae() {
		return cNmae;
	}
	public void setcNmae(String cNmae) {
		this.cNmae = cNmae;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Address getAddress() {
		return a;
	}
	public void setAddress(Address address) {
		this.a = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getcAmount() {
		return cAmount;
	}
	public void setcAmount(double cAmount) {
		this.cAmount = cAmount;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cNmae=" + cNmae + ", email=" + email + ", phoneNo=" + phoneNo + ", address="
				+ a + ", age=" + age + ", cAmount=" + cAmount + ", roomType=" + roomType + "]";
	}
	
	
	}

