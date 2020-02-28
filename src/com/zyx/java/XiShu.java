package com.zyx.java;/*
@author zyx
@date 2019/12/28 - 20:11
*/

public class XiShu {

    public static void main(String[] args) {

        //棋盘数组
        int[][] arr1 = {{0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,5,0,0,0,0,0},
                        {0,0,0,0,0,5,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},};
        int rowLength=arr1.length;//行长度
        int colLength=arr1[1].length;//列长度。

        int nums = 0;



        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(arr1[i][j]!=0)
                    nums ++;
                    //nums+1
                    //添加到稀疏数组中;
            }
        }

        int[][] arr2 = new int[nums+1][3];
        arr2[0][0] = rowLength;
        arr2[0][1] = colLength;
        arr2[0][2] = nums;

        int arr2TheL = 1;




        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(arr1[i][j]!=0) {
                    arr2[arr2TheL][0] = i;
                    arr2[arr2TheL][1] = j;
                    arr2[arr2TheL][2] = arr1[i][j];
                    arr2TheL++;
                }
            }
        }

        System.out.println(nums);
        System.out.println("row col val");
        for (int m = 0; m < nums+1 ; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.print(arr2[m][n]+"   ");
            }
            System.out.println();
        }
        //开始恢复
        int [][]arr3 = new int[10][10];

        for (int m = 1; m < nums+1 ; m++) {
            for (int n = 0; n < 3; n++) {
                arr3[arr2[m][0]][arr2[m][1]] = arr2[m][2];
            }
        }
        for(int[] row : arr3){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
