package SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 회의실 배정
한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들
려고 한다. 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하
면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라. 단, 회의는 한번 시작하면 중간에 중
단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
▣ 입력설명
첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다. 둘째 줄부터 n+1 줄까지 각 회의의 정
보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다.
회의 시간은 0시부터 시작된다. 
회의의 시작시간과 끝나는 시간의 조건은 (시작시간 <= 끝나는 시간)입니다.
▣ 출력설명
첫째 줄에 최대 사용할 수 있는 회의 수를 출력하여라. 
 * */
public class SelectMaxMeetingTime {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int meetingCount = Integer.parseInt(br.readLine());
		List<MeetingTime> meetingTimeList = new ArrayList<>();

		for (int i = 0; i < meetingCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			meetingTimeList.add(new MeetingTime(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		System.out.print(solution(meetingTimeList));

	}

	public static int solution(List<MeetingTime> meetingTimeList) {
		int answer = 0;
		int tempEndTime = Integer.MIN_VALUE;

		Collections.sort(meetingTimeList);

		for (MeetingTime meetingTime : meetingTimeList) {
			if (tempEndTime <= meetingTime.startTime) {
				answer++;
				tempEndTime = meetingTime.endTime;
			}
		}

		return answer;
	}
}

class MeetingTime implements Comparable<MeetingTime> {

	int startTime;
	int endTime;

	MeetingTime(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public int compareTo(MeetingTime meetingTime) {
		if (this.endTime == meetingTime.endTime) {
			return this.startTime - meetingTime.startTime; // 오름차순
		} else {
			return this.endTime - meetingTime.endTime;
		}
	}

}
