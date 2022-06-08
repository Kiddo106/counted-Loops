class countedLoop3e {
  public static void main (String[] args){
    String userEntry; 
    char userSym = '!';
    int numSymbols = 0, maxPerLine = 0, numFullLines = 0, numRemaining = 0;
    boolean unaccepted = true;
    
   
    do{ 
      System.out.print("Enter a symbol you would like printed: ");
      try{
        
        userEntry = In.getString(); 
        
        userSym = userEntry.charAt(0);
        unaccepted = false;
        
      }catch(Exception e){
        System.out.println("Wrong entry. Must be a character. Try again...");
      }   
    }while(unaccepted);
    
    unaccepted = true; 
    
    do{ 
      System.out.print("Enter the number of symbols you would like printed: ");
      try{
        
        userEntry = In.getString(); 
        
        numSymbols = Integer.parseInt(userEntry);
        unaccepted = false;
        
      }catch(Exception e){
        System.out.println("Wrong entry. Must be an integer. Try again...");
      }   
    }while(unaccepted);
    
    unaccepted = true;    
    do{ 
      System.out.print("Enter the maximum number of symbols you would like printed per line: ");
      try{
        
        userEntry = In.getString(); 
        
        maxPerLine = Integer.parseInt(userEntry);
        unaccepted = false;
        
      }catch(Exception e){
        System.out.println("Wrong entry. Must be an integer. Try again...");
      }   
    }while(unaccepted);

    numFullLines = numSymbols/maxPerLine; 
    numRemaining = numSymbols%maxPerLine;

    for (int i = 0;i<numFullLines;i++){

      for (int j = 0; j<maxPerLine; j++)  
          System.out.print(userSym);
      System.out.println("");
    }

    for (int i = 0; i < numRemaining ; i++)
          System.out.print(userSym);
    System.out.println("");
  }
}