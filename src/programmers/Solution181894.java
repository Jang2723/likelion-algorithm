package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181894
// 2의 영역
public class Solution181894 {
    public int[] solution(int[] arr) {
        // 2가 모두 포함된 부분 배열이 있는 경우
        // 2의 개수에 따라 배열의 결과가 달라짐
//        List<Integer> index = new ArrayList<>(); // 2의 인덱스 저장
//        int[] answer={};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 2) index.add(i); // 2가 있는 위치 저장
//        }
//        if(index.size() == 0) return new int[]{-1}; //2가 하나도 없는 경우 -1 반환
//
//        int startIndex = index.get(0);
//        int endIndex = index.get(index.size()-1);
//        answer = Arrays.copyOfRange(arr,startIndex,endIndex+1);
//        return answer;

        // 강사님 코드
        // 앞쪽 2의 위치 저장용 변수
        int front = -1;
        // 각 원소를 앞에서부터 살펴본다.
        for (int i = 0; i < arr.length; i++) {
            // 2를 찾으면
            if (arr[i] == 2) {
                // 위치를 기록하고
                front = i;
                // 반복을 중단한다.
                break;
            }
        }
        // 만약 2를 찾지 못했다면 front는 여전히 -1일 것이다.
        if (front == -1)
            return new int[]{-1};

        int back = 0;
        // 각 원소를 뒤에서부터 살펴본다.
        for (int i = arr.length - 1; i > -1; i--) {
            // 2를 찾으면
            if (arr[i] == 2) {
                // 위치를 기록하고
                back = i;
                // 반복을 중단한다.
                break;
            }
        }

        // 필요한 길이의 배열을 만든다.
        int[] answer = new int[back - front + 1];
        // arr[front] ~ arr[back]까지 answer에 할당한다.
//        for (int i = front; i < back + 1; i++) {
//            answer[i - front] = arr[i];
//        }
//        for (int i = 0; i < back - front + 1; i++) {
//            answer[i] = arr[i + front];
//        }
        answer = Arrays.copyOfRange(arr, front, back + 1);
        return answer;
    }
}
