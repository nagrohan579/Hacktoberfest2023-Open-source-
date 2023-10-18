import java.util.ArrayList;
import java.util.List;

public class E118PascalsTriangle {
    public static void main(String[] args) {
        Solution118 ob = new Solution118();
        System.out.println(ob.generate(5));
    }
}

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
        {
            List<Integer> newRow = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(i>1 && j>=1 && j<i)
                    newRow.add(pascal.get(i-1).get(j) + pascal.get(i-1).get(j-1));
                else
                    newRow.add(1);   
            }    
            pascal.add(newRow);
        }

        return pascal;
    }
}

