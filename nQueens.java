import java.util.*;

public class nQueens {

    public static boolean isSafe(int row, int col, char[][] board){
        
        for(int x = 0; x<board.length; x++){
            if(board[row][x] == 'Q') return false;
        }

        for(int x=0; x<board.length; x++){
            if(board[x][col] == 'Q') return false;
        }

        int r = row;
        for(int c = col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q') return false;
        }
        
        r = row;
        for(int c=col; c<board.length && r>=0; c++, r--) 
            if(board[r][c] == 'Q') return false;

        r = row;
        for(int c = col; c>=0 && r<board.length; c--, r++){
            if(board[r][c] == 'Q') return false;
        }
        r = row;
        for(int c = col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q') return false;
        }

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        
        
        String newString = "";
        List<String> newBoard = new ArrayList<>();
        for(int x=0; x<board.length; x++){
            newString="";
            for(int y=0; y<board[0].length; y++){
                if(board[x][y] == 'Q') newString += 'Q';
                else newString += '.';
            }
            newBoard.add(newString);
            
        }
        allBoards.add(newBoard);

    }
    public static void helper(char[][] board, List<List<String>> allBoards, int col){

        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row=0; row<board.length; row++){

            if(isSafe(row, col, board)){

                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solvenQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        List<List<String>> boardsConfig = solvenQueens(n);

        for(List<String> x: boardsConfig){
            for(String y:x){
                System.out.println(y);
            }
            count++;
            System.out.println();
        }
        System.out.println(count);

    }
}
