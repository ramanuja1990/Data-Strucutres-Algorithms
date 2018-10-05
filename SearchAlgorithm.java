package recursion;

public class SearchAlgorithm {

	//main function 
    public static void main(String args[]) 
    { 
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
        int n = arr.length; 
        int key = 6; 
        int i = search(arr, 0, n-1, key); 
        if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 
    } 
    
    public static int search(int[] arr, int low, int high, int key) {
    	int mid = (low + high) / 2;
    	if(arr[mid] == key)
    		return mid;
    	if(key >= arr[low] && key < arr[mid])
    		return search(arr, low, mid-1, key);
    	return search(arr, mid+1, high, key);
    }
}
