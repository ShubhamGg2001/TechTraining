class CountIsland {
    public static void main(String[] args) {
        String[][] array={{"1","1","0","0","0"},{"1","1","0","0","0"},{"0","0","1","0","0"},{"0","0","0","1","1"}};
        System.out.println(islandCounter(array));
    }

    public static int islandCounter(String[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("1")) {
                    count++;
                    depthFinder(i, j, array);
                }
            }
        }
        return count;
    }

    public static void depthFinder(int i, int j, String [][]array)
{
    if (i >= array.length|| i < 0 || j < 0 || j >= array[i].length || array[i][j].equals("0"))
    {
        return;
    }
    array[i][j] = "0";
    depthFinder(i + 1, j, array);
    depthFinder(i - 1, j, array);
    depthFinder(i, j + 1, array);
    depthFinder(i, j - 1, array);
}
}

// #include <bits/stdc++.h>
// using namespace std;
// int numIslands(vector<vector<char>> &array)
// {
// int count = 0;
// for (int i = 0; i < array.size(); i++)
// {
// for (int j = 0; j < array[i].size(); j++)
// {
// if (array[i][j] == '1')
// {
// count++;
// depthFinder(i, j, array);
// }
// }
// }
// return count;
// }
// void depthFinder(int i, int j, vector<vector<char>> &array)
// {
// if (i >= array.size() || i < 0 || j < 0 || j >= array[i].size() || array[i][j]
// == '0')
// {
// return;
// }
// array[i][j] = '0';
// depthFinder(i + 1, j, array);
// depthFinder(i - 1, j, array);
// depthFinder(i, j + 1, array);
// depthFinder(i, j - 1, array);
// }