import java.util.*;

public class Crossword {


    private boolean toBeLabeled(int r, int c, boolean [][] blackSquares){
                if(blackSquares[r ][c]){
                    return false;
                }
                if(r == 0 || c == 0){
                    return true;
                }
                if(blackSquares[r-1][c] || blackSquares[r][c - 1]){
                    return true;
                }
        return false;
    }

    public Crossword(boolean[][] blackSquares){
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int num =1;
        for(int i = 0; i < puzzle.length; i++){
            for(int j = 0; j < puzzle[0].length; j++){
                if(toBeLabeled(i, j, blackSquares)){
                    puzzle[i][j] = new Square(false, num);
                    num++;
                }else{
                    puzzle[i][j] = new Square(blackSquares[i][j], 0);
                }
            }
        }
    }
}