package org.example;

public class Main {
        public static void main(String[] args) {
            int[][] tab1 = new int[][]{{0,1,2},{3,4,5}};
            for (int i = 0; i < tab1.length; i++) {
                for (int j = 0; j < tab1[i].length; j++) {
                    System.out.printf("tab[%d,%d] = %d;\n",i,j,tab1[i][j]);
                }
            }
            System.out.println("------------");
            int sum = 0;
            int[][] tab2 = new int[2][3];
            for (int i = 0; i < tab2.length; i++) {
                for (int j = 0; j < tab2[i].length; j++) {
                    System.out.printf("tab[%d,%d] = %d;\n",i,j,sum);
                    sum++;
                }
            }
        }
}