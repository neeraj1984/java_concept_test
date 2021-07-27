package com.test.concepts;

import java.util.ArrayList;
import java.util.List;

public class FindAlternative2 {
	
	
	public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<13; i++)
        {
            list.add(i);
        }
        int size= list.size();
        int j=0;
        
        int rowSeperator = 3;
        
        
        List< List<Integer> > splittedList = new ArrayList<List<Integer>>()  ;
        List<Integer> tempList = new ArrayList<Integer>();
        
		for (j = 0; j < size; j++) 
		{
			tempList.add(list.get(j));
			if ((j + 1) % rowSeperator == 0) 
			{
				// chunk of 25 created and clearing tempList
				splittedList.add(tempList);
				tempList = null;
				// intializing it again for new chunk
				tempList = new ArrayList<Integer>();
			}
		}
		
        if(size%rowSeperator!=0){
            //adding the remaining enteries 
            splittedList.add(tempList);
        }
        
        
        for (int k=0;k<splittedList.size(); k++){
            //(k+1) because we started from k=0
            System.out.println("Chunk number: "+(k+1)+" has elements = "+splittedList.get(k).size());
        }
    }

}
