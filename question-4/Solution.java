
public int getPointsForRow(int targetRow){

    int sum = 0;
    int sameColor = 0; //0 true 1 false
    
    
 
    for(int c = 1; < board[targerRow]; c++){
            
        sum += board[tarGetRow][c].getPoints();

        if(board[targetRow][c].getColor().equals(board[targetRow][c-1].getColor()){
            sameColor = 1;
        }

    }

    sum += board[targerRow][0];

    if(sameColor == 1){
        return sum;
    }else{
        return sum*2;
    }
    
}
