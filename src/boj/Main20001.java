package boj;
// 고무오리 디버깅
// https://www.acmicpc.net/problem/20001
// 문제 입력 -> stack의 psuh
// 고무오리 입력 -> stack의 pop
// 문제가 해결되면 고무오리야 사랑해,
// 문제가 남으면 힝구 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // 고무오리 디버깅 시작
        String line = reader.readLine();

        // 총 들어온 문제를 꾸준히 세준다.
        int count = 0;

        // 마지막에 "고무오리 디버깅 끝" 입력 받을떄 까지 반복 한다.
        while (true){
            line = reader.readLine();
            // 종료 조건 구현
            if (line.equals("고무오리 디버깅 끝")){
                break;
            }

            // 입력이 "문제"면 count++
            if (line.equals("문제")){
                count++;
            }
            // 입력이 "고무오리"면 count--
            else if (line.equals("고무오리") && count != 0) {
                count--;
            }
            // 단 count == 0 이면 count +=2
            else{
                count += 2;
            }
        }

        if (count == 0){
            System.out.println("고무오리야 사랑해");
        }
        else{
            System.out.println("힝구");
        }

    }
}
