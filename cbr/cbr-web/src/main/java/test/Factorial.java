package test;

public class Factorial {
  public static int facto(int fect)
  {   if(fect==1)
	  return 1;
	  return fect*facto(fect-1);
	  
  }
	public static void main(String[] args) {
	System.out.println(facto(5));

	}

}
