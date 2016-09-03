package zhu.data;

public class UserInfo {
	private String name;
	private String location;
	private int nums;
	
	
	public UserInfo(String name, String location, int nums) {
		super();
		this.name = name;
		this.location = location;
		this.nums = nums;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	
}
