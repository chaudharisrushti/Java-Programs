//Write a java program to check whether the given array is Mirror Inverse or not.

public class Array_Inverse {

	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {

			if (arr[arr[i]] != i)
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1,9,4,8,66 };
		if (isMirrorInverse(arr))
			System.out.println("Array is Mirror Inverse");
		else
			System.out.println("Array is Not Mirror Inverse");
	}
}
