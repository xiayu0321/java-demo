package 作业;

class Circle implements GetArea{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double area(){
		double fields = Math.PI * radius * radius;
		return fields;
	}
}
