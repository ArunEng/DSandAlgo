package easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * 
 * Example 1:
 * Input: numRows = 5 Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 
 * Example 2:
 * Input: numRows = 1 Output: [[1]]
 * 
 * Constraints:
 * 1 <= numRows <= 30
 */

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		System.out.println(generate(numRows));
	}
	
	static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        list.add(l);
        for(int i=1;i<numRows;i++) {
        	List<Integer> temp = new ArrayList<Integer>();
        	for(int j=0;j<=list.get(i-1).size();j++) {
        		if(j==0) {
        			temp.add(1);
        		}else if(j==list.get(i-1).size()) {
        			temp.add(1);
        		}else {
        			temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
        		}
        	}
        	list.add(temp);
        }
        return list;
    }
}
