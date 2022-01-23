public class FindElement {
    public static void main(String[] args) {
        int element=5;
        int[][]array={{1,2,3,4},{20,40,41,42},{45,46,78,79},{80,81,82,84}};
        System.out.println(findElement(array, element));
    }

    private static boolean findElement(int[][] array, int target) {
        int i=0; int j=array.length-1;
        while(i>=0 &&i<array.length &&j>=0 && j<array[0].length){
            if(array[i][j]<target)
                i++;
            else if(array[i][j]>target)
                j--;
            else
                return true;
        }
        return false;
    }
}
