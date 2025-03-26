package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨. -> 추후 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작하겠습니다.

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다. (혹시 while문으로 작성하고 싶다면
    그래도 됩니다)
 */
public class Array15LottoGame {
    public static void main(String[] args) {
        // 객체 생성
        Random random = new Random();
        // 생각해봐야할 점
        //Math.random()을 사용해서 1 ~ 45까지의 범위를 만들려면 어떡해야할까

        // 빈 배열 선언
        int[] lottoNumbers = new int[6];
        int round = 5;      // 얘를 이용하여 게임 횟수를 5번 반복하시오.
        int temp = 0;
        boolean duplicate;  // 자주쓰는 변수명으로 temporary의 축약어

        for(int j = 0 ; j < round ; j++) {
            for (int i = 0; i < lottoNumbers.length; i++) {
                duplicate = false;  // 얘가 여기 있어야만 하는 이유가 좀 중요함.
                temp = (int) (Math.random() * 45) + 1;
                // temp에 들어간 난수가 이전 배열의 element와 값이 겹치는지를 확인해야함.
            for(int k = 0; k < i ; k++){    // 중복을 체크하기 위해 현재 만들어져서 element가 대입된 부분까지 탐색
                if(lottoNumbers[k] == temp) {
                    duplicate = true;   // 얘가 true가 됐으면 조건문이 하나 더 필요합니다.
                }
            }
            if(!duplicate) {    // duplicate가 false라면 !duplicate가 true이므로 중복이 없다는 의미
                lottoNumbers[i] = temp;
            }else {
                //대입이 아니라 다시 뽑아야함.
                i--;
                // i =3일때 예를 들어서 얘가 실행이 됐다면
                // i = 2로 바뀌게 됩니다.
            }
            // 여기까지 내려와서 for(int i)파트의 반복문이 끝이 나게 되면
            // i++가 적용되면서 다시 3일때 temp에 난수를 대입하고,
            // 중복이 되는지를 체크하게 됩니다.
            }

            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
