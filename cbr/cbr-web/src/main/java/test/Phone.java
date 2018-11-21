package test;

interface ParentCompany {
	public Company setId(int id);
}

class Company {
	private int cid;
	private String cName;
	public ParentCompany setPhoneName(String phoneName) {
		return null;
	}
}

public class Phone extends Company implements ParentCompany {
	private int id;
	private String phoneName;

	public Phone() {
	}

	public Phone(int id, String phoneName) {
		super();
		this.id = id;
		this.phoneName = phoneName;
	}
	@Override
	public Company setId(int id) {
		this.id = id;
		return this;
	}
	@Override
	public ParentCompany setPhoneName(String phoneName) {
		this.phoneName = phoneName;
		return this;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneName=" + phoneName + "]";
	}

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setPhoneName("andoid").setId(1);
		System.out.println(phone);
	}

}
