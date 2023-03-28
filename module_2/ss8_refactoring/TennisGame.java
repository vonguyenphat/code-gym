package ss8_refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        boolean compareScore = player1Score == player2Score;
        if (compareScore)
        {
            switch (player1Score)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else {
            boolean  player1Has4Score = player1Score >= 4;
            boolean  player2Has4Score = player2Score >= 4;
            boolean playerHas4Score = player1Has4Score || player2Has4Score;

            if (playerHas4Score)
            {
                score = resultIfHas4Score(player1Score, player2Score);
            }
            else
            {
                score = resultIfNotHas4Score(player1Score, player2Score, score);
            }
        }
        return score;
    }

    private static String resultIfNotHas4Score(int player1Score, int player2Score, String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { scoreBuilder.append("-"); tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    scoreBuilder.append("Love");
                    break;
                case 1:
                    scoreBuilder.append("Fifteen");
                    break;
                case 2:
                    scoreBuilder.append("Thirty");
                    break;
                case 3:
                    scoreBuilder.append("Forty");
                    break;
            }
        }
        score = scoreBuilder.toString();
        return score;
    }

    private static String resultIfHas4Score(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}