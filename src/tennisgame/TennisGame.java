package tennisgame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int score_player1, int score_player2) {
        String score = "";
        int tempScore=0;
        if (score_player1==score_player2)
        {
            score = switch (score_player1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            };
        }
        else if (score_player1>=4 || score_player2>=4)
        {
            int minusResult = score_player1-score_player2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = score_player1;
                else { score +="-"; tempScore = score_player2;}
                switch (tempScore) {
                    case 0 -> score += "Love";
                    case 1 -> score += "Fifteen";
                    case 2 -> score += "Thirty";
                    case 3 -> score += "Forty";
                }
            }
        }
        return score;
    }
}
