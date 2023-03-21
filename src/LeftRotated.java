/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
public class LeftRotated {
    public static void main(String[] args) {
        int arr[]=new int[]{32,2223,22,25,547,6554,3422,432};
        for(int i=0;i<1;i++)
        {
            int p=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=p;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
