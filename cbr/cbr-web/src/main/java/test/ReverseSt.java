package test;

public class ReverseSt {

	public static void main(String[] args) {
		String s1="gourav mohan govind hello hi";// govind mohan gourav
		
		int temp=s1.indexOf(' ', 0);
		int i=0;
		int beginIndex=0;
		long t1=System.nanoTime();
		long t2=0;
		
		while(temp!=-1)
		{   
			String s2=s1.substring(beginIndex, temp).trim();
			beginIndex=temp;
			temp=s1.indexOf(' ', temp+1);
			System.out.println(s2);
		}
		t2=System.nanoTime();
				System.out.println(t2-t1);
		for (int j = 0; j < s1.length(); j++) {
			if(s1.charAt(0)!=' ')
			{
				
			}
			
		}
	}

}
