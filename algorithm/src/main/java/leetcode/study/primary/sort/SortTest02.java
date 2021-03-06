package leetcode.study.primary.sort;


public class SortTest02 {
    public static void main(String[] args) {

    }

    boolean isBadVersion(int version){
        return true;
    }

    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while(left <= right){
            int medium = left + (right - left) / 2;
            if(isBadVersion(medium)){
                right = medium - 1;
            }else{
                left = medium + 1;
            }
        }
        return left;
    }

}
