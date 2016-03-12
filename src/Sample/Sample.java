package Sample;

import java.util.Stack;

public class Sample {

	/**
	 * @param args
	 */
	public static Stack<Integer> reverseStack(Stack<Integer> stack)
	{
		Stack<Integer> newStack=new Stack<Integer>();
        while(!stack.isEmpty())
        {
            Integer element=stack.pop();
            newStack.push(element);
        }
        return newStack;
	}
	public static void areBracketsMatching(String str)
	{
		int i=0;
		int index=0;
		Stack<Character> stack=new Stack<Character>();
		for(char c:str.toCharArray())
		{
			if(c=='(')
				stack.push(c);
			
			if(c==')')
			{
				if(stack.isEmpty())
				{
					System.out.println("mismatch");
					index=1;
					break;
				}
				Character ii=stack.pop();
				if(ii!='(')
				{
					System.out.println("mismatch");
					break;
				}
			}
		}
		if(index==0){
		if(stack.isEmpty())
			System.out.println("match");
		else
			System.out.println("mismatch");
		}
	}
	public static void findNumberOfWords(String str)
	{
		int count=str.trim().split("\\s+").length;
		System.out.println(count);
	}
	public static void isStringPalindrome(String str2)
	{
		for(int i=0;i<str2.length();i++)
		{
			
		}
	}
	public static int LCSRecursive(char[] a,char[] b,int m,int n)
	{
		int[][] lcslength=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			//lcslength[0][i]=0;
			lcslength[i][0]=0;
		}
		for(int j=0;j<=n;j++)
			lcslength[0][j]=0;
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
			{
				if(a[i-1]==b[j-1])
				{
					lcslength[i][j]=lcslength[i-1][j-1]+1;
				}
				else
				{
					lcslength[i][j]=max(lcslength[i][j-1],lcslength[i-1][j]);
				}
			}
		return lcslength[m][n];
	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack=reverseStack(stack);
		System.out.println(stack.pop());
		String str="()({}(())";
		areBracketsMatching(str);
		String str1=" swetha is     girl ";
		findNumberOfWords(str1);
		String str2="abccba";
		isStringPalindrome(str2);
		String str3="adbc",str4="adbcd";
		int max=LCSRecursive(str3.toCharArray(),str4.toCharArray(),str3.length(),str4.length());
		System.out.println(max);
	}

}
