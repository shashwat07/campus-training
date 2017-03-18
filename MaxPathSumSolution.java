import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;

class MaxPathSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Integer[] array = new Integer[10000];
		int n=0;
		File file = new File("p067_triangle.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNext()){
		    array[n]=scan.nextInt();
		    n++;
		}
		scan.close();
		int x = 2*n;
		x=(int)Math.sqrt(x);
		int i=0;
		int k=0;
		
		while(x>1){
		    for(i=0;i<x-1;i++){
		        
    		    array[n-x-x+1+i]=Math.max(array[n-x+i],array[n-x+i+1])+array[n-x-x+1+i];
		    }
		    n=n-x;
		    x--;
		}
		System.out.println("Max sum path is " + array[0]);
	}
}

