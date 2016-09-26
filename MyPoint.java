package 作业;

public class MyPoint {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public MyPoint(){
		x = 0;
		y = 0;
	}
	
	public MyPoint(int x){
		this.x = x;
		this.y = 0;
	}
	
	public MyPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public static double distance(MyPoint onePoint,MyPoint anotherPoint){
		double dis = 0;
		dis = Math.sqrt((onePoint.x - anotherPoint.x)*(onePoint.x - anotherPoint.x) + (onePoint.y - anotherPoint.y) * (onePoint.y - anotherPoint.y));
		return dis;
	}
}