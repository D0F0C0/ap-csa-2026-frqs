// part A

public Account(String requestedName){

    int i = 1;
    username = requestedName;

    while(!isAvailable(username)){

        username = requestedName + i;
        i++;
    }
}

//part B

public String getShortenedName(){

    String name = username;
    int remove = name.indexOf("-");

    for(int i = 0; i < name.length; i++){
        if(remove != -1){
            name = name.substring(0,i-1)+name(i+1);
        }
    }

    return name;
    
}
