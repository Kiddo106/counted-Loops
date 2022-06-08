class countedLoop2{
  public static void main(String []args){
    int num1;
    int solution;
    System.out.println("Please enter an integer.");
    num1=In.getInt();
    
    for (int count=1;count<=12; count = count +1){
     solution = num1*count;
      
    System.out.println(num1+ " x "+ count +" = "+ solution);
    }
  }
  
}