public int moreHistoryThanMathAbsences(){

    int count = 0;

    for(int i = 0; i < historyList.size(); i++){

        for(int j = 0; j < mathList.size(); j++){

            if(historyList.get(i).getStudentID == mathList.get(j).getID){
                if(historyList.get(i).getAbsences() > mathList.get(j).getAbsences){

                    count ++;
                }
                
            }

        }

    }

    return count;
}
