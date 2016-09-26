package 作业;

class MyPoint3D extends MyPoint{
	private int x;
	private int y;
	private int z;
	
	public MyPoint3D(int x,int y){
		super(x,y);
		this.z = 0;
	}
	public MyPoint3D(int z){
		super(0,0);
		this.z = z;
	}
	public MyPoint3D(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static double distance(MyPoint3D onePoint,MyPoint3D anotherPoint){
		double dis = 0;
		if(onePoint.z == 0 && anotherPoint.z == 0){
			MyPoint p = new MyPoint(onePoint.x,onePoint.y);
			MyPoint q = new MyPoint(anotherPoint.x,anotherPoint.y);
			dis = MyPoint.distance(p, q);
		}else{
			dis = Math.sqrt(((onePoint.x - anotherPoint.x)*(onePoint.x - anotherPoint.x) + (onePoint.y - anotherPoint.y) * (onePoint.y - anotherPoint.y) +(onePoint.z - anotherPoint.z)* (onePoint.z - anotherPoint.z)));
		}
	return dis;
	} 
}

public class TestMyPoint3D {
	public static void main (String[] args){
		MyPoint3D p = new MyPoint3D(3,4,0);
		MyPoint3D q = new MyPoint3D(1,4,0);
		
		System.out.println("两点之间的距离为"+MyPoint3D.distance(p, q));
	}
}
