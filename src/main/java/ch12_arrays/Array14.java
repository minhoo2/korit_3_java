package ch12_arrays;

import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int number  = 0;

        // 1부터 100까지의 숫자를 nums 배열에 순서대로 값을 넣으시오.
        for (int i = 0 ; i < nums.length ; i++) {
            for(int j = 0 ; j < nums[i].length ; j++) {
                nums[i][j] = ++number;      // 대입 전에 +1 시키고 대입하니까 1부터
            }
        }
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " / ");
            }
            System.out.println();   // 별찍기 때 사용한 실행문3
        }


        // 2차 배열의 출력 : Arrays.deepToString(배열명);
        // Arrays.toString()이 안먹힌다는 것을 확인했었습니다.
        System.out.println(Arrays.deepToString(nums));
    }
}
