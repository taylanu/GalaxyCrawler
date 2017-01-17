//Rev. Dr. Douglas R Oberle - Washington, DC
import java.util.*;
import java.io.*;
public class scaleMutator
{          
//pre:  a and b are valid index #s of list, which is not null
//post: swaps list[a] with list[b]  - modifies the array that is sent
//i.e., given list:[1,2,3,4], a:1, b:3 -> changes list to [1,4,3,2]
   public static void swap(int[] list, int a, int b)
   {
   //*********WRITE THIS METHOD***************
      int x=list[a],y=list[b];
      list[a]=y;
      list[b]=x;
   //*****************************************
   }

//pre:  list is not null
//post: nums is sorted in ascending order - modifies the array that is sent
//i.e., given list:[4,2,7,5] -> changes list to [2,4,5,7] 
//needs to work with an array of any size             
   public static void selSort(int[] list)
   {
   //*********WRITE THIS METHOD***************
      Arrays.sort(list);
   //*****************************************
   }

//pre:   list is not null
//post:  returns a new array with the same elements of list, but scrambled (put in random order)
//needs to work with an array of any size
   public static int[] scramble(int[]list)
   {
      int[]retVal = list.clone();
      //*********WRITE THIS METHOD***************   
      for (int i=0;i<10000;i++)
      {
         int val=(int)Math.random()*(list.length);
         int val2=(int)Math.random()*(list.length);
         swap(retVal,val,val2);
         
      }   //*****************************************
      return retVal;
   }

//pre:  list is not null
//post: returns a new array with elements in list, but in reverse order
//i.e., given list:[1,2,3,4] -> returns [4,3,2,1]
//needs to work with an array of any size
   public static int[] reverse(int[]list)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[list.length];
      for (int i=0;i<list.length;i++)
      {
         retVal[list.length-1-i] = list[i];
      }
       
      return retVal; 	//temporary statement to keep us compiling
     //*****************************************
   }

//pre:  list is not null
//post: returns a new array (almost double the size of list) with the elements of list as a palindrome.
//i.e., given list:[1,2,3,4] -> returns [1,2,3,4,3,2,1]
//needs to work with an array of any size
   public static int[] makePalindrome(int[]list)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[list.length*2-1];
      int[] temp = reverse(list);
      for (int i=0;i<list.length-1;i++)
      {
         retVal[i]=list[i];
      }
      for (int x=0;x<list.length;x++)
      {
         retVal[list.length + x] = temp[x];
      }
      return retVal; 	//temporary statement to keep us compiling
     //*****************************************
   }   

//pre:  neither a nor b are null, assume a.length == b.length
//post: returns a new array with elements shuffles in from two lists,
//alternating between advancing elements of lists a and b
//[a0, b0, a1, b1, a2, b2, a3, b3, a4, b4,...]
//i.e., given a:[0,1,2,3], b:[9,8,7,6] -> returns [0,9,1,8,2,7,3,6]
//needs to work with arrays of any size
   public static int[] shuffle(int[]a, int[]b)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[a.length*2];
      for (int i=0; i<retVal.length;i=i+2)
      {
         retVal[i]=a[i];
         retVal[i+1]=b[i];
      }
     
      return retVal; 	//temporary statement to keep us compiling
     //*****************************************
   }

 //pre:  list is not null	
 //post: returns a new array with elements of list, but shuffled- 
 //alternating between elements from the beginning moving right and elements from the end moving left
 //[1st elem, Last elem, 2nd elem, 2nd to last elem, 3rd elem, 3rd to last elem, 4th elem, 4th to last elem,...]
 //i.e., given list:[0,1,2,3,4,5,6,7] -> returns [0,7,1,6,2,5,3,4]
 //needs to work with an array of any size
   public static int[] shuffle(int[]list)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[list.length];
      int a = 1;
      for (int i=0; i<list.length;i++)
      {
         if (i%2==0)
            retVal[i]=list[i];
         else
         {
            retVal[i]=list[list.length-a];
            a++;
         }
      }
      return retVal; 	//temporary statement to keep us compiling
     //*****************************************
   }

//pre:  list is not null, note is between 22 and 108
//post:  makes a new array containing each element of list, but where every other element is note
//[list0, note, list1, note, list2, note, list3, note, list4, note,...]
//if list:[2, 4, 6, 8] and note:1 -> returns [1,2,1,4,1,6,1,8]
//needs to work with an array of any size
   public static int[] mixWithNote(int[] list, int note)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[list.length*2];
      int a=0;
      for (int i=0;i<list.length*2;i=i+2)//0 2 4 
      {
         retVal[i]=note;
      
         while (a%2 != 0)
         {
            retVal[i+1]=list[a];
            
         }
         a++;
      }
      
      
      
      return retVal; 	//temporary statement to keep us compiling
      
      
     //*****************************************
   }

//pre:  list is at least of length 3
//post:  makes a new array containing triads (groups of 3 consecutive notes in the scale), each starting with successive elements of list
//[1st elem, 2nd elem, 3rd elem, 2nd elem, 3rd elem, 4th elem, 3rd elem, 4th elem, 5th elem,...]
//if list:[1,2,3,4,5,6] -> returns [1,2,3,  2,3,4,  3,4,5, 4,5,6]
   public static int[] triads(int[] list)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[3 *(list.length-2)];
     int a=0;
      for (int i=0; i<3*(list.length-2);i=i+3 )
      {
        retVal[i]=list[a];
        a++;
        
      }
     
      return retVal; 	//temporary statement to keep us compiling
     //*****************************************
   }
   
   //post:  student invents their own mutation to the scale
   public static int[] extraCredit(int[] list)
   {
     //*********WRITE THIS METHOD***************
      int[]retVal = new int[list.length*2];
      int a=0;
      for (int i=0;i<list.length*2;i=i+2)//0 2 4 
      {
         retVal[i]=list[a];
         retVal[i+1]=list[i];
         a++;
      }
      return retVal;
     
     	//temporary statement to keep us compiling
     //*****************************************
   }
} 	

