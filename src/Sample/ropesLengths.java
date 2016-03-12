package Sample;

import java.util.ArrayList;

public class ropesLengths {

	/**
	 * @param args
	 */
	public static void sort(int[] array)
	{
		int temp;
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
	}
	public static void findMinConcatLength(int[] array)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		sort(array);
		int value=array[0]+array[1],sum=0;
		list.add(value);
		for(int i=2;i<array.length;i++)
		{
			value=value+array[i];
			list.add(value);
		}
		for(int i=0;i<list.size();i++)
			sum=sum+list.get(i);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={5,4,3};
		findMinConcatLength(array);

	}

}
