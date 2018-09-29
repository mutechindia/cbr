package test;
class Base 
{
	private void method1()
    {
        System.out.println("Parent's method1()");
    }
    public void method2()
    {
        System.out.println("Parent's method2()");
        method1();
    }
}
public class Derived extends Base
{ private static String removeChar(String str, char c) {
    if (str == null)
        return null;
    return str.replaceAll(Character.toString(c), "");
}
	public void method1()
    {
        System.out.println("Child's method1()");        
    }
    public static void main(String args[])
    {
        Base p = new Derived();
        p.method2();
        System.out.println(removeChar("gouravooo", 'o'));
    }}