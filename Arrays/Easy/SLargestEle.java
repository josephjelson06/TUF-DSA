import java.util.List;

public class SLargestEle {
    class Solution {
        public int print2largest(List<Integer> arr) {
            // Code Here
            int max = arr.get(0);
            int sMax = -1;
            for (int i = 0; i < arr.size(); i++) {
                if (max < arr.get(i)) {
                    sMax = max;
                    max = arr.get(i);
                } else if (arr.get(i) < max && arr.get(i) > sMax) {
                    sMax = arr.get(i);
                }
                // if(sMax < arr.get(i) && sMax < max){
                // sMax = arr.get(i);
                // }
            }
            return sMax;
        }
    }
}
