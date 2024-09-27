package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[] arr = new int[people];

        for(int i = 0; i < people; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
        sc.close();
    }
    public static int solve(int[] arr){
        int answer = 0;

        // 배열 오름차순 정렬 1 2 3 ..
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i+1; j++) {
                answer += arr[j];
            }
        }
        return answer;
    }
}
