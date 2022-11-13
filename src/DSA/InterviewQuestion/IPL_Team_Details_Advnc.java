package DSA.InterviewQuestion;

import java.util.Scanner;
class IPL {
    String team;
    int match, win, lose, tied, nr, points; double runRate;
    int total, against;
    IPL (String team, int match, int win, int lose, int tied, int nr, int points, double runRate, int total, int against) {
        this.team = team;
        this.match = match;
        this.win = win;
        this.lose = lose;
        this.tied = tied;
        this.nr = nr;
        this.points = points;
        this.runRate = runRate;
        this.total = total;
        this.against = against;
    }
}

public class IPL_Team_Details_Advnc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter total team no :-");
        int teamCount = sc.nextInt();
        System.out.println("Please enter team details :-");
        IPL[] obb = new IPL[teamCount];

        for (int i = 0; i < teamCount; i++) {
            IPL details = new IPL(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
            obb[i] = details;
        }

        System.out.println("Please enter team no which details you want to see :-");
        int teamNo = sc.nextInt();

        for (int i = 0; i < obb.length; i++) {
            if (i == teamNo - 1) {
                IPL tList = obb[i];
                System.out.println("Team:- " + tList.team + " " + "Total:- " + tList.total + " " + "Against:- " + tList.against + " " + "Difference:- " + Math.abs(tList.total - tList.against));
            }
        }
    }
}
