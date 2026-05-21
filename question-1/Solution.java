// part A

public Account(String requestedName){

    int i = 1;
    username = requestedName;

    while(!isAvailable(username)){

        username = requestedName + i;
        i++;
    }
}
