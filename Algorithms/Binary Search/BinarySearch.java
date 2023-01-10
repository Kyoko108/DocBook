import java.io.*;
import java.util.*;

public class BinarySearch {// class starts
    public static int binary_search_method(ArrayList<Integer> search, int left, int right, int key) {// binary_search_method
                                                                                                     // starts

        if (right >= left) {
            int middle = left + ((right - left) / 2);
            if (search.get(middle) == key)
                return middle;
            if (search.get(middle) > key)
                return binary_search_method(search, left, middle - 1, key);
            return binary_search_method(search, middle + 1, right, key);
        }
        return -1;// if search element is not found
    }// binary_search_method ends

    public static void main(String[] args) throws IOException { // main function starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        ArrayList<Integer> binsear = new ArrayList<Integer>();
        System.out.println("Enter an array , and separate the elements by single space   : ");
        String[] s = br.readLine().split(" ");
        for (i = 0; i < s.length; i++)
            binsear.add(Integer.parseInt(s[i]));
        Collections.sort(binsear);// sorting the binsear arraylist elements
        i = 0;
        System.out.println("Check the ArrayList once ");
        while (i < binsear.size()) {// adding input to binsear arraylist starts
            System.out.print(binsear.get(i) + "\t");
            i++;
        } // adding input to binsear arraylist starts
        System.out.println("\nEnter the element to be searched: ");
        int key = Integer.parseInt(br.readLine());// storing the search element in key
        int result = binary_search_method(binsear, 0, (binsear.size() - 1), key);// storing the position
        if (result == -1)
            System.out.println(key + " is not found ");
        else
            System.out.println(key + " is found at position " + result);
    }// main function ends
}// class ends

/*>java BinarySearch
Enter an array , and separate the elements by single space   : 
1 3 2 5 6 4
Check the ArrayList once 
1       2       3       4       5       6
Enter the element to be searched:
6
6 is found at position 5
 */
    
    
