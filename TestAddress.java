package 作业;

class Address {
	String name;
	String phone;
	String email;
	
	public Address(String name,String phone,String email){
		setAddress(name,phone,email);
	}
	
	private void setAddress(String name,String phone,String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
	}	
	void showMessage(){
		System.out.println("姓名："+name+",电话:"+phone+",E-mail:"+email);
	}
}

public class TestAddress{
	public static void main(String[] args){
		Address personOne = new Address("张三","15152637721","657677453@qq.com");
		Address personTwo = new Address("李四","13145632254","897658909@qq.com");
		Address personThree = new Address("王五","19028718298","901839210@qq.com");
		
		personOne.showMessage();
		personTwo.showMessage();
		personThree.showMessage();
	}
}