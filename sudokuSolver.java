public class sudokuSolver {

    public static boolean isSafe(char[][] board, int row, int col, int num){

        for(int x = 0; x<board.length; x++){
            if(board[row][x] == (char)(num+'0') || board[x][col] == (char)(num+'0')) return false;
        }

        int startRow = (row/3) *3;
        int startCol = (col/3) * 3;

        for(int x = startRow; x < startRow+3; x++){
            for(int y=startCol; y<startCol+3; y++){
                if(board[x][y] == (char)(num+'0')) return false;
            }
        }
        return true;
    }
    public static boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int newRow = 0;
        int newCol = 0;

        if(col == board.length-1){
            newRow = row+1;
            newCol = 0;
        }
        else{
            newRow = row;
            newCol = col+1;
        }

        if(board[row][col] != '.'){
            if(helper(board, newRow, newCol)){
                return true;
            }
        }
        else{
            for(int x=1;x<=9;x++){
                if(isSafe(board, row, col, x)){
                    board[row][col] = (char) (x + '0');
                    if(helper(board, newRow, newCol)){
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        
        return false;
    }

    public static char[][] solveSoduku(char[][] board){

        helper(board, 0, 0);
        return board;
    }
    public static void main(String args[]){
        char[][] board = {
    {'.','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};

        char[][] answerBoard = solveSoduku(board);

        for(int x=0; x<answerBoard.length; x++){
            for(int y=0; y<answerBoard.length; y++){
                System.out.print(answerBoard[x][y] + " ");
            }
            System.out.println();
        }
    }
}
