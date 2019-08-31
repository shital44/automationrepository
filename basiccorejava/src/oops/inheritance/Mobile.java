package oops.inheritance;

public class Mobile extends Telephone
{
 public void texting()
 {
	 System.out.println("Text Messaging");
 }
 public void calling()//when we have same methods and same parameters in two classes is callesd method overriding
                      //when we have same methods with different parameters it is called as method overloading,e.g.here calling(int i) is method overloading
 {
	 System.out.println("calling from mobile");
 }
}
