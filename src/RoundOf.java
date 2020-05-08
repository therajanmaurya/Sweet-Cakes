public class RoundOf {

    public static void main(String[] args) {
        System.out.println(roundOf(-3050, 2));
    }

    public static long roundOf(int price, int n) {
        double rountPrice = ((int) (price / Math.pow(10, n))) * Math.pow(10, n);
        if(rountPrice>0) {
            if (price == rountPrice + (Math.pow(10, n)/2)) {
                rountPrice += Math.pow(10,n);
            }
        }
        return(long)(rountPrice);
    }
}
