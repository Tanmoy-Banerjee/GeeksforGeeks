package GFG.SDESheet;

import java.util.Collections;
import java.util.List;

public class MinimizeSumOfProduct {

    public long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here

        Collections.sort(arr1);
        Collections.sort(arr2, Collections.reverseOrder());

        Long product = 1L;Long sumOfProduct = 0L;
        for(int i  = 0; i < arr1.size(); i++){
            product =  (long) (arr1.get(i) * arr2.get(i));
            sumOfProduct = sumOfProduct + product;
        }

        return sumOfProduct;
    }
}
