import java.io.IOException;

public class SwitchDemo {
	public static void main (String[] args) throws IOException{
		System.out.println("招聘条件：");
		System.out.println("是否熟练掌握C和Java？ please press y/n");
		
		char i = (char) System.in.read();
		
		switch(i){
		case 'n':{
			System.out.println("你不符合公司的招聘条件1！");
		    break;
		}
		case 'y':{
			System.out.println("是否具有3年以上工作经验或重点大学毕业？ please press y/n");
			char p = (char)System.in.read();
			
			switch(p){
			case 'n':{
				System.out.println("你不符合公司的招聘条件1！");
				break;
			}
			case 'y':{
				System.out.println("年龄是否在35岁以下？ please press y/n");
				char q = (char)System.in.read();
				
				switch(q){
				case 'n':{
					System.out.println("你不符合公司的招聘条件3！");
					break;
				}
				case 'y':{
					System.out.println("你完全符合本公司条件！");
				}
				}
				
			}
			}
		}
		}
	}
}