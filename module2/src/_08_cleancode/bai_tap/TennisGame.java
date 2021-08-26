package _08_cleancode.bai_tap;


public class TennisGame {

    private static final int ZERO_SCORE = 0;
    private static final int ONE_SCORE = 1;
    private static final int TWO_SCORE = 2;
    private static final int THREE_SCORE = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        boolean drawScore = player1Score == player2Score;
        if (drawScore) {
            switch (player1Score) {
                case ZERO_SCORE:
                    score = "Love-All";
                    break;
                case ONE_SCORE:
                    score = "Fifteen-All";
                    break;
                case TWO_SCORE:
                    score = "Thirty-All";
                    break;
                case THREE_SCORE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean isDrawScoreGreaterThan4 = player1Score >= 4 || player2Score >= 4;
            if (isDrawScoreGreaterThan4) {
                score = findWinner(player1Score, player2Score);
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = player1Score;
                    else {
                        score += "-";
                        tempScore = player2Score;
                    }
                    switch (tempScore) {
                        case ZERO_SCORE:
                            score += "Love";
                            break;
                        case ONE_SCORE:
                            score += "Fifteen";
                            break;
                        case TWO_SCORE:
                            score += "Thirty";
                            break;
                        case THREE_SCORE:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }

    public static String findWinner(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}

