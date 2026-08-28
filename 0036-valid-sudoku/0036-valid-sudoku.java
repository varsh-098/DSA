class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean valid=true;
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rows = new HashSet<>();

            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rows.contains(board[i][j])) {
                    valid=false;
                }

                rows.add(board[i][j]);
            }

        }

        for (int j = 0; j < board.length; j++) {
            HashSet<Character> cols = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (cols.contains(board[i][j])) {
                    valid=false;
                }

                cols.add(board[i][j]);
            }

        }


        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> box = new HashSet<>();

                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        if (board[x][y] == '.') {
                            continue;
                        }
                        if(box.contains(board[x][y])){
                            valid=false;
                        }
                        box.add(board[x][y]);
                    }
                }
            }
        }
        return valid;
    }
}