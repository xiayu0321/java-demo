package xy;

class Trangle  
{  
   double sideA,sideB,sideC,area,length;
   boolean boo;
  
   public  Trangle(double a,double b,double c) 
   { 
    //参数a,b,c分别赋值给sideA,sideB,sideC
	 setABC(a,b,c);
	 
     if((a + b >= c) && (a + c >= b) && (b + c >= a)) //a,b,c构成三角形的条件表达式
     { 
        //给boo赋值。
    	 boo = true;
     }    
    else
     { 
        //给boo赋值。
    	boo = false;
     }
   }
   double getLength() 
   {   
      //方法体，要求计算出length的值并返回
	   if(boo){
		   length = sideA + sideB + sideC;
		   return length;
	   }else{
		   System.out.println("该三角形不存在");
		   return 0;
	   }
	
  }
   public double getSideA() {
	   return sideA;
   }
   
   public double getSideB() {
	   return sideB;
   }
   
   public double getSideC() {
	   return sideC;
   }
   public double  getArea() 
   {  
      if(boo)
        { 
          double p=(sideA+sideB+sideC)/2.0;
          area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
          return area;
        }
      else
        { 
          System.out.println("不是一个三角形,不能计算面积");
          return 0;
        }
   } 
   public void setABC(double a,double b,double c)
   { 
    //参数a,b,c分别赋值给sideA,sideB,sideC
	   sideA = a;
	   sideB = b;
	   sideC = c;
     if((a + b >= c) && (a + c >= b) && (b + c >= a)) //a,b,c构成三角形的条件表达式
     { 
       //给boo赋值。
    	 boo = true;
     }    
    else
     { 
        //给boo赋值。
    	boo = false;
     }
   }
}
class Lader 
{   
    double above,bottom,height,area; 
    Lader(double a,double b,double h)
    {
      //方法体，将参数a,b,c分别赋值给above,bottom,height
    	above = a;
    	bottom = b;
    	height = h;
    }
    double getArea()
    {
      //方法体，,要求计算出area返回
    	area = (above + bottom) * height / 2;
    	return area;
    }
}

class Circle 
{  
    double radius,area;
    Circle(double r)
    { 
        //方法体
    	radius = r;
    }
    double getArea() 
    {  
       //方法体，要求计算出area返回
    	area = Math.PI * radius * radius;
    	return area;
    }
    double getLength() 
    {  
      //getArea方法体的代码,要求计算出length返回
    	double length;
    	length = 2 * Math.PI * radius;
    	return length;
    }
    void setRadius(double newRadius)
    {  
       radius=newRadius;
    }
    double getRadius() 
    { 
        return radius;
    }
}
public class AreaAndLength 
{  
    public static void main(String args[])
    { 
       double length,area;
       Circle circle=null;
       Trangle trangle;
       Lader lader;
       //创建对象circle
       Circle c = new Circle(2.0);
       //创建对象trangle。
       Trangle t = new Trangle(3,4,5);
       //创建对象lader
       Lader l = new Lader(3,6,9);
       // circle调用方法返回周长并赋值给length
       length = c.getLength();
        System.out.println("圆的周长:"+length); 
       // circle调用方法返回面积并赋值给area
        area = c.getArea();
        System.out.println("圆的面积:"+area); 
       // trangle调用方法返回周长并赋值给length
        length = t.getLength();
        System.out.println("三角形的周长:"+length); 
       // trangle调用方法返回面积并赋值给area
        area = t.getArea();
        System.out.println("三角形的面积:"+area); 
       // lader调用方法返回面积并赋值给area
		area = l.getArea();
		System.out.println("梯形的面积:"+area); 
	// trangle调用方法设置三个边，要求将三个边修改为12,34,1。
		t.setABC(12, 34, 1);
       // trangle调用方法返回面积并赋值给area
		area = t.getArea();
		System.out.println("三角形的面积:"+area); 
        // trangle调用方法返回周长并赋值给length
		length = t.getLength();
		System.out.println("三角形的周长:"+length);
		
		c.setRadius(5.0);
	       // circle调用方法返回周长并赋值给length
	       length = c.getLength();
	        System.out.println("圆的周长:"+length); 
	       // circle调用方法返回面积并赋值给area
	        area = c.getArea();
	        System.out.println("圆的面积:"+area);
    }
}

