package programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181904
// 세로 읽기
public class Solution181904 {
    public String solution(String my_string, int m, int c) {
        // String을 m개씩 나누고 c번째 글자를 리턴
        String answer = "";
        String[] arr = new String[my_string.length()/m];
        int start = 0;
        int end = m;
        for (int i = 0; i < my_string.length() / m ; i++) {
            arr[i] = my_string.substring(start,end);
            start +=m;
            end += m;
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i].charAt(c -1);
        }
        return answer;
    }
}
