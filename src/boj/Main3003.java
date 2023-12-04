package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Boj3003
체스는 총 16개의 피스를 사용하며,
킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하시오
입력
첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
*/
public class Main3003 {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // readLine을 통해 한줄 입력 받기
        String input = reader.readLine();

        // 주어진 인자를 (정규 표현식을 활용해서) 기준으로 삼아
        // 문자열을 나눈 배열로 반환한다.
        String[] splitString = input.split(" ");
//        for (String split : splitString) {
//            System.out.println(split);
//        }

        // 3003 문제 풀어보기
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] needChess = new int[chess.length];
        for (int i = 0; i < chess.length; i++) {
            needChess[i] = chess[i] - Integer.parseInt(splitString[i]);
        }

        for (int i: needChess) {
            System.out.print(i + " ");
        }

        /*
        //강사님 코드
        //1. 기준이 되는 페스 말을 정수 배열로 저장
        int[] rightPieces = {1, 1, 2, 2, 2, 8};

        // 2. 입력받은 각각의 체스말을 살펴본다.
        // 어떤 말인지를 보기 위해 fori 반복을 한다.
        for(int i=0; i<6; i++){
            // 3. 이번 말을 확인한다.
            String pieceRaw = splitString[i];
            // 4. 동일한 말에서, 기준 갯수와 다른 만큼 빼준다.
            rightPieces[i] -= Integer.parseInt(pieceRaw);
        }

        Systeml.out.println(String.format(
                "%d %d %d %d %d %d",
                rightPieces[0],
                rightPieces[1],
                rightPieces[2],
                rightPieces[3],
                rightPieces[4],
                rightPieces[5]
         ));
        */
    }
}
