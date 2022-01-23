import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int[] a:rotate(array)){
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] rotate(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array[i].length;j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;

            }
        }
        for(int i=0;i<array.length;i++){
            int left=0;
            int right=array[i].length-1;
            while(left<right){
                int temp=array[i][left];
                array[i][left]=array[i][right];
                array[i][right]=temp;
                left++;
                right--;

            }

        }
        return array;
    }
}
