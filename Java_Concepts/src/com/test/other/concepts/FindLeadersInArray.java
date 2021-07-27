package com.test.other.concepts;

/*
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. 
 * And the rightmost element is always a leader. 
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 * 
 */
public class FindLeadersInArray {

	/*Java Function to print leaders in an array */
    void printLeaders(int arr[], int size) 
    {
        for (int i = 0; i < size; i++) 
        {
            int j;
            for (j = i + 1; j < size; j++) 
            {
                if (arr[i] <= arr[j])
                    break;
            }
            
            if (j == size) // the loop didn't break
            	{
            	  System.out.print(arr[i] + " "); //it will print leader one by one
            	}
        }
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args) 
    {
    	FindLeadersInArray lead = new FindLeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
	
}
