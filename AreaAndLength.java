package xy;

class Trangle  
{  
   double sideA,sideB,sideC,area,length;
   boolean boo;
  
   public  Trangle(double a,double b,double c) 
   { 
    //����a,b,c�ֱ�ֵ��sideA,sideB,sideC
	 setABC(a,b,c);
	 
     if((a + b >= c) && (a + c >= b) && (b + c >= a)) //a,b,c���������ε��������ʽ
     { 
        //��boo��ֵ��
    	 boo = true;
     }    
    else
     { 
        //��boo��ֵ��
    	boo = false;
     }
   }
   double getLength() 
   {   
      //�����壬Ҫ������length��ֵ������
	   if(boo){
		   length = sideA + sideB + sideC;
		   return length;
	   }else{
		   System.out.println("�������β�����");
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
          System.out.println("����һ��������,���ܼ������");
          return 0;
        }
   } 
   public void setABC(double a,double b,double c)
   { 
    //����a,b,c�ֱ�ֵ��sideA,sideB,sideC
	   sideA = a;
	   sideB = b;
	   sideC = c;
     if((a + b >= c) && (a + c >= b) && (b + c >= a)) //a,b,c���������ε��������ʽ
     { 
       //��boo��ֵ��
    	 boo = true;
     }    
    else
     { 
        //��boo��ֵ��
    	boo = false;
     }
   }
}
class Lader 
{   
    double above,bottom,height,area; 
    Lader(double a,double b,double h)
    {
      //�����壬������a,b,c�ֱ�ֵ��above,bottom,height
    	above = a;
    	bottom = b;
    	height = h;
    }
    double getArea()
    {
      //�����壬,Ҫ������area����
    	area = (above + bottom) * height / 2;
    	return area;
    }
}

class Circle 
{  
    double radius,area;
    Circle(double r)
    { 
        //������
    	radius = r;
    }
    double getArea() 
    {  
       //�����壬Ҫ������area����
    	area = Math.PI * radius * radius;
    	return area;
    }
    double getLength() 
    {  
      //getArea������Ĵ���,Ҫ������length����
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
       //��������circle
       Circle c = new Circle(2.0);
       //��������trangle��
       Trangle t = new Trangle(3,4,5);
       //��������lader
       Lader l = new Lader(3,6,9);
       // circle���÷��������ܳ�����ֵ��length
       length = c.getLength();
        System.out.println("Բ���ܳ�:"+length); 
       // circle���÷��������������ֵ��area
        area = c.getArea();
        System.out.println("Բ�����:"+area); 
       // trangle���÷��������ܳ�����ֵ��length
        length = t.getLength();
        System.out.println("�����ε��ܳ�:"+length); 
       // trangle���÷��������������ֵ��area
        area = t.getArea();
        System.out.println("�����ε����:"+area); 
       // lader���÷��������������ֵ��area
		area = l.getArea();
		System.out.println("���ε����:"+area); 
	// trangle���÷������������ߣ�Ҫ���������޸�Ϊ12,34,1��
		t.setABC(12, 34, 1);
       // trangle���÷��������������ֵ��area
		area = t.getArea();
		System.out.println("�����ε����:"+area); 
        // trangle���÷��������ܳ�����ֵ��length
		length = t.getLength();
		System.out.println("�����ε��ܳ�:"+length);
		
		c.setRadius(5.0);
	       // circle���÷��������ܳ�����ֵ��length
	       length = c.getLength();
	        System.out.println("Բ���ܳ�:"+length); 
	       // circle���÷��������������ֵ��area
	        area = c.getArea();
	        System.out.println("Բ�����:"+area);
    }
}

