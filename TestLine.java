package 作业;

import java.awt.Point;

class Line {
	private Point onePoint;
	private Point anothorPoint;
	
	public Line(){
		this.onePoint = new Point(0,0); 
		this.anothorPoint = new Point(0,0);
	}
	
	public Line(Point onePoint){
		this.onePoint = onePoint;
		this.anothorPoint = new Point(0,0);
	}

	public Line(Point onePoint,Point anotherPoint){
		this.onePoint = onePoint;
		this.anothorPoint = anotherPoint;
	}
	
	public double getLineLength(){
		double len = 0;
		len = Math.sqrt((this.onePoint.getX()-this.anothorPoint.getX())*(this.onePoint.getX()-this.anothorPoint.getX())+
				(this.onePoint.getY()-this.anothorPoint.getY())*(this.onePoint.getY()-this.anothorPoint.getY()));
		return len;
	}
	public boolean isHorizontal(){
		if(this.onePoint.getY() != this.anothorPoint.getY()){
			return false;
		}
		return true;
	} 
	
	public boolean isVertical(){
		if(this.onePoint.getX() != this.anothorPoint.getX()){
			return false;
		}
		return true;
	}
	
	public double Slope(){
		double slo = (this.onePoint.getY()-this.anothorPoint.getY())/(this.onePoint.getX()-this.anothorPoint.getX());
		return slo;
	}
	
	public Point midPoint(){
		Point midPoint = new Point();
		midPoint.setLocation((this.onePoint.getX()-this.anothorPoint.getX())/2,(this.onePoint.getY()-this.anothorPoint.getY())/2);
		return midPoint;
	}
	
	public boolean isEqual(Line oneLine,Line anothorLine){
		if(oneLine.getLineLength() != anothorLine.getLineLength()){
			return false;
		}
		return true;
	}
}
public class TestLine {
	public static void main(String[] args){
		Point onePoint = new Point(4,3);
		Point anotherPoint = new Point(3,4);
		Line oneLine = new Line(onePoint,anotherPoint);
		System.out.println("the length of line is :" + oneLine.getLineLength());
		System.out.println("Whether the line is horizontal:" + oneLine.isHorizontal());
		System.out.println("Whether the line is vertical:" + oneLine.isVertical());
		System.out.println("the scope of the line is:" + oneLine.Slope());
		System.out.println("the midpoint of the line is" + oneLine.midPoint());
		
		Point secondPoint = new Point(5,6);
		Point secondAnotherPoint = new Point(3,4);
		Line anothorLine = new Line(secondPoint,secondAnotherPoint);
		
		System.out.println("Whether two lines is equal " + oneLine.isEqual(oneLine, anothorLine));
	}
}
