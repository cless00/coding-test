package programmers.delivery;

import java.util.Stack;

/**
 * 프로그래머스 카카오 기출
 * 택배 배달과 수거
 * https://school.programmers.co.kr/learn/courses/30/lessons/150369
 */
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        Stack<Integer> deli = new Stack<>();
        Stack<Integer> pick = new Stack<>();

        for (int i = 0; i < n; i++) {
            deli.push(deliveries[i]);
            pick.push(pickups[i]);
        }

        while (!deli.isEmpty() || !pick.isEmpty()) {
            int deliAmount = 0;
            int pickAmount = 0;
            int dis = 0;
            while (deliAmount < cap && !deli.isEmpty()) {
                int d = deli.pop();
                if (d == 0) {
                    continue;
                }
                dis = Math.max(dis, deli.size() + 1);
                deliAmount += d;
                if (deliAmount > cap) {
                    deli.push(deliAmount - cap);
                    break;
                }
            }
            while (pickAmount < cap && !pick.isEmpty()) {
                int p = pick.pop();
                if (p == 0) {
                    continue;
                }
                dis = Math.max(dis, pick.size() + 1);
                pickAmount += p;
                if (pickAmount > cap) {
                    pick.push(pickAmount - cap);
                    break;
                }
            }
            answer += dis;
        }

        return answer * 2;
    }
}
