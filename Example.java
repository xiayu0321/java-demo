package xy;

class A
{   
    //����һ��float��ʵ������a
	float a;
	//����һ��float�������b,
	static float b;
	
    void setA(float a)
    {  
    //������a��ֵ��ֵ����Ա����a
    	this.a = a;
    }
    void setB(float b)
    {  
      //������b��ֵ��ֵ����Ա����b
    	this.b = b;
    }
    float getA()
    {  
       return a;
    }
    float getB()
    {  
       return b;
    }
    void inputA()
    {
       System.out.println(a+b);
    }
    static void inputB()
    {
       System.out.println(a+b);
    }
}
public class Example
{   
    public static void main(String args[]) 
    { 
      //ͨ���������������b,����ֵ100
    	A.b = 100;
      //ͨ���������÷���inputB()
       A.inputB();
       A cat=new A();
       A dog=new A();
        //cat���÷���setA(int a)��cat�ĳ�Աa��ֵ����Ϊ200
       cat.setA(200);
       //cat���÷���setB(int b)��cat�ĳ�Աb��ֵ����Ϊ400
       cat.setB(400);
       //dog���÷���setA(int a)��dog�ĳ�Աa��ֵ����Ϊ150
       dog.setA(150);
       //dog���÷���setB(int b)��dog�ĳ�Աb��ֵ����Ϊ300
       dog.setB(300);
       //cat����inputA()��
       cat.inputA();
       //cat����inputB()��
       cat.inputB();
       //dog����inputA()��
       dog.inputA();
       //dog����inputB()��
       dog.inputB();
    } 
}
