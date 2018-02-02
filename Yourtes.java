/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author velkumar.l
 */
import java.util.*;
public class Yourtes {
    public static void main(String[] args)
    {
    int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int sum = 10;
    int n = a.length;
    System.out.println("ToTAL LENGTH :" + n);
    for(int i=0; i<=n-1; i++)
    {
        for(int j=i+1; j<n;j++ )
        {
        	if (a[i] + a[j] == sum)
				{
					System.out.println("Pair found at index " + i + " and " + j);
					return;
				}
        }
    }
    
    }
}
