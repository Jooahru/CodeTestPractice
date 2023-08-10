package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Wedding {

	public static int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for (Time ob : arr) {
			if (ob.state == 's')
				cnt++;
			else
				cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Time> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sT = Integer.parseInt(st.nextToken());
			int eT = Integer.parseInt(st.nextToken());
			arr.add(new Time(sT, 's'));
			arr.add(new Time(eT, 'e'));
		}
		System.out.println(solution(arr));
	}

	public static class Time implements Comparable<Time> {
		public int time;
		public char state;

		Time(int time, char state) {
			this.time = time;
			this.state = state;
		}

		@Override
		public int compareTo(Time ob) {
			if (this.time == ob.time)
				return this.state - ob.state;
			else
				return this.time - ob.time;
		}
	}

}
