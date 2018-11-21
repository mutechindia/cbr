package test;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        class Temp implements Comparable<Temp>
       {
    	   Integer id;
    	   String name;
    	   String dept;
    	   Integer salary;
    	   Temp(int id,String name,String dept,int salary)
    	   {
    		   this.id=id;
    		   this.name=name;
    		   this.dept=dept;
    		   this.salary=salary;
    	   }
    	   @Override
    	public String toString() {
    		return this.id+" "+this.name+" "+this.dept+" "+this.salary;
    	}
		@Override
		public int compareTo(Temp o) {
			return -this.id.compareTo(o.id);
		}
    	   
       }
       ArrayList<Temp> temp=new ArrayList();
       ArrayList<Temp> temp1=new ArrayList();

        	for(String s1:array)
        	{
				String[] s2=s1.split(", ");
				if(s2[2].equals("Engineering"))
		        temp.add(new Temp(Integer.parseInt(s2[0]) , s2[1], s2[2], Integer.parseInt(s2[3])));
				else
				temp1.add(new Temp(Integer.parseInt(s2[0]) , s2[1], s2[2], Integer.parseInt(s2[3])));
					
        	}
        	Collections.sort(temp);
        	Collections.sort(temp1);
        	
        Map<String,Integer> retVal = new LinkedHashMap<String,Integer>();
        retVal.put(temp.get(0).dept, temp.get(0).salary);
        retVal.put(temp1.get(0).dept, temp1.get(0).salary);
        

       return retVal;    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("D:\\output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}