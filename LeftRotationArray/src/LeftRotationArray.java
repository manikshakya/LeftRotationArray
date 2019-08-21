import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
	A left rotation operation on an array shifts each of the array's 
	elements  unit to the left. For example, if  left rotations are performed on array, 
	then the array would become .

	Given an array a of d integers and a number, d, perform d left rotations on the array. 
	Return the updated array to be printed as a single line of space-separated integers.
*/
class LeftRotationArray{
	public static void main(String[] args) {
		String ar = "";
//		ar+="{";
		
		for(int i = 0; i < 80000; i++) {
			if(i < 79999) ar+=i + ",";
			else ar+=i;
		}
//		ar+="}";
		
		int[] test = Arrays.stream(ar.split(",")).mapToInt(Integer::parseInt).toArray();
		
//		System.out.println(ar);
		//rotateLeft(ar, 0);
//		System.out.println(Arrays.toString(rotateLeft(test, 20000)));
		System.out.println(Arrays.toString(rotateLeft(test, 60000)));
		System.out.println("Hi");
	}
	
	public static int[] rotateLeft(int[] a, int d) {
		/*
			Recursion works. But throws StackOverflow Exception if the stack is to deep.
			Depends on the Machine. In my case, if d > 10000.
		*/
//		int[] r = new int[a.length];
//		
//		for(int i = 1; i < r.length; i++) {
//			r[i - 1] = a[i];
//			
//			if(i == r.length - 1) {
//				r[i] = a[0];
//			}
//		}
//		if(d == 0) {
//			return a;
//			
//		}else {
//			return rotateLeft(r, d - 1);
//		}
		
		
		int n = a.length;

        // Create new array for rotated elements:
        int[] rotated = new int[n]; 

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(a, d, rotated, 0, n - d);
        System.arraycopy(a, 0, rotated, n - d, d);

        return rotated;
	}
}