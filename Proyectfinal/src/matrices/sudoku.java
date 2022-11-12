
package matrices;


public class sudoku {
    private int sudoku[][];
    public sudoku(){
        int matriz[][]={
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,5,0,0,6,0,4,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,1,0,0,2,0,8,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,0,9},
        };
        sudoku=matriz;
    }
    
    
    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
    
    
    
    /*
    
    
    
    for (int i = 0; i < sudoku.length;i++){
        for (int j = 0;j<sudoku[0].length;j++){
            if (sudoku[i][j] == 0){
                for (int valor = 1;valor <= 9; valor++){
                    if(comprobarfila(i,valor) && comprobarcolumna(j,valor) && comprobarcuadrane(i,j,valor)){
                        sudoku[i][j] = valor;
                        if (realizarsudoku()){
                            reurn true;
                        }
                        sudoku[i][j] = 0;
    
    }
    
    }
    return false;
    }
    
    }
    
    }
    return false;
    */

}
