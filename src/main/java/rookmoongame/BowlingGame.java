package rookmoongame;

public class BowlingGame {

    private int[] rolls=new int[21];
    private int rollIndex=0;

    /**
     * @param pins the total number of knowledge on pins on roll
     */
    public void roll(int pins){rolls[rollIndex++]=pins;}

    /**
     * @return a total score of game
     */
    public int score()
    {

        return 0;
    }
}
