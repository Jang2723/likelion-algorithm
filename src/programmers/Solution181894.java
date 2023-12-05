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
        List<Integer> index = new ArrayList<>(); // 2의 인덱스 저장
        int[] answer={};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) index.add(i); // 2가 있는 위치 저장
        }
        if(index.size() == 0) return new int[]{-1}; //2가 하나도 없는 경우 -1 반환

        int startIndex = index.get(0);
        int endIndex = index.get(index.size()-1);
        answer = Arrays.copyOfRange(arr,startIndex,endIndex+1);
        return answer;

    }
}
