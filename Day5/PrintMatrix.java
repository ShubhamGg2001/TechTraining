class PrintMatrix{
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        printArray(array);
    }
    public static void printArray(int[][] array){
        int maxRow=array.length-1;
        int minRow=0;
        int maxColumn=array[0].length-1;
        int minColumn=0;
        int count=0;
        int target=(array.length)*(array[0].length);
        while(count<target){
            //upperRow
            for(int j=minColumn;j<=maxColumn && count<target;j++)
                {System.out.print(array[minRow][j]+" ");
                count++;}
            minRow++;

             //rightColumn
             for(int i=minRow;i<=maxRow && count<target;i++)
             {System.out.print(array[i][maxColumn]+" ");
            count++;}
            maxColumn--;

            //belowRow
            for(int j=maxColumn;j>=minColumn&&count<target;j--)
           { System.out.print(array[maxRow][j]+" ");
           count++;}
            maxRow--;

            //leftColumn
            for(int i=maxRow;i>=minRow&&count<target;i--)
            {System.out.print(array[i][minColumn]+" ");
            count++;};
            minColumn++;
         
        }
        System.out.println();
        int maxRow2=array.length-1;
        int minRow2=0;
        int maxColumn2=array[0].length-1;
        int minColumn2=0;
        int count2=0;
        int target2=(array.length)*(array[0].length);
        while(count2<target2){
            //upperRow
            for(int j=maxColumn2;j>=minColumn2 && count2<target2;j--)
                {System.out.print(array[minRow2][j]+" ");
                count2++;}
            minRow2++;

             //leftColumn
             for(int i=minRow2;i<=maxRow2 && count2<target2;i++)
             {System.out.print(array[i][minColumn2]+" ");
             count2++;};
             minColumn2++;

            //belowRow
            for(int j=minColumn2;j<=maxColumn2 && count2<target2;j++)
            { System.out.print(array[maxRow2][j]+" ");
            count2++;}
             maxRow2--;

             //rightColumn
             for(int i=maxRow2;i>=minRow2 && count2<target2;i--)
             {System.out.print(array[i][maxColumn2]+" ");
            count2++;}
            maxColumn2--;

          

           
         
        }
    }
    }