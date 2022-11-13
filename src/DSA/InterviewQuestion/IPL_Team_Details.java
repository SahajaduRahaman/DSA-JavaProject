package DSA.InterviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPL_Team_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTeam = sc.nextInt();

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i <= totalTeam; i++) {
            String teamDetails = sc.nextLine();
            String[] team = teamDetails.split(" ");
            list.add(team);
        }

        for (int i = 1; i < list.size(); i++) {
            String[] ko = list.get(i);
            System.out.print("Team :- ");
            for (int j = 0; j < ko.length; j++) {
                if (j == 0) {
                    System.out.print(ko[0] + "    " + "For: ");
                }
                if (j == ko.length - 2) {
                    System.out.print(ko[ko.length - 2] + "    " + "Against: ");
                }
                if (j == ko.length - 1) {
                    System.out.print(ko[ko.length - 1] + "    " + "Difference: ");
                }
            }
            int q = Integer.parseInt(ko[ko.length - 2]);
            int w = Integer.parseInt(ko[ko.length - 1]);

            int ans = Math.abs(q - w);
            System.out.print(ans);
            System.out.println();
        }
    }
}
