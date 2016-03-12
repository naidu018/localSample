package Sample;

class Stack{
	int[] array;
	int[] stackPointer;
	int size;
	Stack(int size)
	{
		this.size=size;
		array=new int[3*size];
		stackPointer=new int[3];
		for(int i=0;i<3;i++)
			stackPointer[i]=-1;
	}
	
	public void push(int sp, int data)
	{
		if(stackPointer[sp]<size)
		{
			stackPointer[sp]=stackPointer[sp]+1;
			array[sp*size+stackPointer[sp]]=data;
		}
		else
		{
			System.out.println("stack is full");
			return;
		}
	}
	public int pop(int sp)
	{
		if(stackPointer[sp]==-1)
			return -1;
		else{
			int data= array[sp*size+stackPointer[sp]];
			stackPointer[sp]=stackPointer[sp]-1;
			return data;
		}
	}
}

public class findIntegerInArray {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack(20);
		st.push(0, 1);
		st.push(1, 2);
		System.out.println(st.pop(1));

	}

}
