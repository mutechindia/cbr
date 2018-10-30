package test;
class Mainn
{ 
    // function to calculate median 
    static int getMedian(int ar1[], int ar2[], int n) 
    {    
        int m1=0;
        int m2=0;
        
        
        
       
        return (m1 + m2)/2; 
    } 
       
    /* Driver program to test above function */
    public static void main (String[] args) 
    { 
        int ar1[] = {1, 12, 15, 26, 38}; 
        int ar2[] = {2, 13, 17, 30, 45}; 
       
        int n1 = ar1.length; 
        int n2 = ar2.length; 
        if (n1 == n2) 
            System.out.println("Median is " + 
                        getMedian(ar1, ar2, n1)); 
        else
            System.out.println("arrays are of unequal size"); 
        
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
		int n = arr.length; 
		
		int count = 0; // Count of non-zero elements 

		// Traverse the array. If element encountered is 
		// non-zero, then replace the element at index 'count' 
		// with this element 
		for (int i = 0; i < n; i++) 
			if (arr[i] != 0) 
				arr[count++] = arr[i]; // here count is 
									// incremented 

		// Now all non-zero elements have been shifted to 
		// front and 'count' is set as index of first 0. 
		// Make all elements 0 from count to end. 
		while (count < n) 
			arr[count++] = 0; 
    }     
    }