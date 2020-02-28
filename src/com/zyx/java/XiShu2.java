package com.zyx.java;/*
@author zyx
@date 2019/12/28 - 21:17
*/

public class XiShu2 {
    public static int[][] Xishu(int[][]arr1){
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
                System.out.printf("%d\t",arr2[m][n]);
            }
            System.out.println();
        }
        return arr2;
    }
public static int[][] Huifu(int[][]arr2){
    int [][]arr3 = new int[arr2[0][0]][arr2[0][1]];

    for (int m = 1; m < arr2[0][2]+1 ; m++) {
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
    return arr3;
}
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];

        arr1[2][3]=1;
        arr1[4][5]=2;
        arr1[6][5]=2;
        for(int[] row : arr1){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }


        Xishu(arr1);
        System.out.println("----------------------------");
        Huifu(Xishu(arr1));

    }

//在前面的基础上，将稀疏数组保存到磁盘上，比如 map.data
//恢复原来的数组时，读取map.data
}
