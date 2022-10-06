public class ArrayFunctions{
  //function to make a copy of an array:
	public static int[] returnCopy(int[]ary){
  	int[] copy = new int[ary.length];
  	for (int i = 0; i < ary.length; i++){
    	copy[i] = ary[i];
  	}
  	return copy;
	}

  //function to concatenate two arrays:
  public static int[] concatArray(int[]ary1, int[]ary2){
    int[] concat = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      concat[i] = ary1[i];
    }
    for (int j = 0; j < ary2.length; j++){
      concat[j+ary1.length] = ary2[j];
    }
    return concat;
  }

  //funciton to print out array content:
  public static String aryToString(int[]nums){
    String ans = "";
    for (int i = 0; i < nums.length; i++){
      if (i < nums.length-1)
        ans += nums[i] + ", ";
      else
        ans += nums[i];
    }
    return "{" + ans + "}";
  }

  //test cases
	public static void main(String[]args){
  	int[] a = {1,2,3};
    int[] b = {5,6,7};
    //returnCopy function test cases
  	System.out.println("Original: " + aryToString(a) + " Copy: "+ aryToString(returnCopy(a)) + " Same address?: " + (a == returnCopy(a)));
    System.out.println("Original: " + aryToString(b) + " Copy: "+ aryToString(returnCopy(b)) + " Same address?: " + (b == returnCopy(b)));
    //concatArray function test cases
    System.out.println("A: " + aryToString(a) + " B: "+ aryToString(b) + " A + B: " + aryToString(concatArray(a,b)));
    System.out.println("B: " + aryToString(b) + " A: "+ aryToString(a) + " B + A: " + aryToString(concatArray(b,a)));

	}
}
