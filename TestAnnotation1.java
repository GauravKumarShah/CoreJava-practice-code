class A{  
void m(){System.out.println("hello m");}  
  
@Deprecated  
void n(){System.out.println("hello n");}  
}  
  
class TestAnnotation1{  
public static void main(String args[]){  
  
A a=new A();  
a.n();  
}}  