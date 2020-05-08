public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(4));
    }

    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // this is fake implementation to get the bad version
    public static boolean isBadVersion(int n) {
        return true;
    }
}
