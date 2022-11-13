package DSA.String;

public class ExpandRange {
    private static void printRangeOfString(String str) {
        StringBuilder sb = new StringBuilder();

        String [] sArray = str.split(", ");

        for (int i = 0; i < sArray.length; i++) {
            String [] nArray = sArray[i].split("-");

            if (nArray.length == 2) {
                int low = Integer.parseInt(nArray[0]);
                int max = Integer.parseInt(nArray[1]);

                while (low <= max) {
                    sb.append(low + " ");
                    low ++;
                }
            }
            else {
                sb.append(sArray[i] + " ");
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {

        String str = "1-5, 8, 10, 12-15, 18, 20, 23, 24-30";

        printRangeOfString(str);
    }
}
