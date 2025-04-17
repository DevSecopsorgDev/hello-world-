// Java Program to find the largest element in 
// array using iterative approach
class Geeks 
{
    // Array declared
    static int arr[] = {20, 10, 20, 4, 100}; 
    
    // Method to find maximum in arr[] 
    static int largest() 
    {       
        // Initialize maximum element 
        int max = arr[0]; 
        
      	// Traversing and comparing max element
        for (int i = 1; i < arr.length; i++)
        
         // If current element is greater than max
            if (arr[i] > max) 
            
                // Then update max element
                max = arr[i]; 
        
        return max; 
    } 
    
    public static void main(String[] args) 
    {    
      
        System.out.println(largest()); 
