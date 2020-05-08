import java.util.*;

public class MergingMeetingTime {

    public static void main(String[] args) {
        /*int[][] meetings = {{3, 4}, {4, 5}, {5, 6}, {8, 9}, {12, 10}};
        for (int[] meeting : meetings) {
            System.out.print(Arrays.toString(meeting));
        }*/
    }

    private List<Meeting> mergeMeeting(List<Meeting> meetings) {

        List<Meeting> shortedMeetings = new ArrayList<>();
        for (Meeting meeting : meetings) {
            Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
            shortedMeetings.add(meetingCopy);
        }

        Collections.sort(shortedMeetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.getStartTime() - o2.getStartTime();
            }
        });

        List<Meeting> mergeMeetings = new ArrayList<>();
        mergeMeetings.add(shortedMeetings.get(0));

        for (Meeting currentMeeting : shortedMeetings) {
            Meeting lastMeetingMerged = mergeMeetings.get(mergeMeetings.size() - 1);
            if (currentMeeting.getStartTime() <= lastMeetingMerged.getEndTime()) {
                lastMeetingMerged.setEndTime(Math.max(lastMeetingMerged.getEndTime(), currentMeeting.getEndTime()));
            } else {
                mergeMeetings.add(currentMeeting);
            }
        }
        return mergeMeetings;
    }
}

class Meeting {

    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
