////////////////////////////
//Dana Cunningham
//September 30, 2014
//CSE2
//BoolaBoola
//
//Randomly assigns a true/false value to variables. The variables are then combined randomly

import java.util.Scanner;    //creates Scanner

public class BoolaBoola{    //creates public class
    
    public static void main(String[] args)  {   //main method required for every Java program
        
        Scanner myScanner=new Scanner(System.in);   //creates a scanner and sets it equal to user input
        
        String answer;
        
        boolean value1=Math.random()<0.5;   //generates three random true/false statements
        boolean value2=Math.random()<0.5;
        boolean value3=Math.random()<0.5;
        
        int value4=(int)((Math.random()*2)+1);  //generate numbers 1 and 2 randomly- 1=&&, 2=||
        int value5=(int)((Math.random()*2)+1);
        
        
        
        if(value4==1 && value5==1){//first if statement //with two && operators
            
            boolean result1=(value1 && value2 && value3);    //result with true/false values
            
            System.out.println("Does " +value1+ " && " +value2+ " && " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result1==true){//second if statement   //if result is true
                
                if(myScanner.hasNext()){    //if user enters a String
                    answer=myScanner.next();    //sets answer equal to user input
                
                        if(answer.equals("t") || answer.equals("T")){//third if statement     //if user enters correct answer
                            
                                System.out.println("Correct");
                                return;//leaves the program
                        }//ends third if statement
                        
                        else{//first else statement     //when user does not enter correct anwer
                              
                                System.out.println("Wrong; try again");//notifies user of wrong answer
                                return;//leaves the program
                        }//ends first else statement 
                }
        
            }//ends second if statement 
            else{
                if(myScanner.hasNext()){    //if user enters a String
                    answer=myScanner.next();    //sets answer equal to user input
                
                        if(answer.equals("f") || answer.equals("F")){//third if statement     //if user enters correct answer
                            
                                System.out.println("Correct");
                                return;//leaves the program
                        }//ends third if statement
                        
                        else{//first else statement     //when user does not enter correct anwer
                              
                                System.out.println("Wrong; try again");//notifies user of wrong answer
                                return;//leaves the program
                        }//ends first else statement 
            }
        }//ends first if statement
        }
        
        if(value4==2 && value5==2){//fourth if statement    //with two || operators
        
            boolean result2=(value1 || value2 || value3);   //result with true/false values
            
            System.out.println("Does " +value1+ " || " +value2+ " || " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result2==true){//fifth if statement   //if result is true
                
                if(myScanner.hasNext()){    //if user enters string
                    answer=myScanner.next();    //sets answer equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//sixth if statement     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//ends sixth if statement
                    
                    else{//second else statement     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//ends second else statement 
            
                    
                }    
            }//ends fifth if statement 
            else{
                if(myScanner.hasNext()){    //if user enters string
                    answer=myScanner.next();    //sets answer equal to user input
                
                    if(answer.equals("f") || answer.equals("F")){//sixth if statement     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//ends sixth if statement
                    
                    else{//second else statement     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//ends second else statement 
            
                    
                }   
            }
        }//ends fourth if statement
            
            
        if(value4==1 && value5==2){//seventh if statement    //with one && and one || operator
        
            boolean result3=(value1 && value2 || value3);   //result with true/false values
            
            System.out.println("Does " +value1+ " && " +value2+ " || " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result3==true){//eighth if statement   //if result is true
                
                if(myScanner.hasNext()){    //if user enters a string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//ninth if statement     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//ends ninth if statement
                    
                    else{//third else statement     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//ends third else statement 
                
                    
                }    
            }//ends eight if statement 
            else{
                if(myScanner.hasNext()){    //if user enters a string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("f") || answer.equals("F")){//ninth if statement     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//ends ninth if statement
                    
                    else{//third else statement     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//ends third else statement 
            }
        }//ends seventh if statement    
        }    
        
        if(value4==2 && value5==1){//tenth if statement    //with one && and one || operator
        
            boolean result4=(value1 || value2 && value3);   //result with true/false values
            
            System.out.println("Does " +value1+ " || " +value2+ " && " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result4==true){//eleventh if statement   //if result is true
                
                if(myScanner.hasNext()){    //if user equals string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//twelfth if statement     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//ends twelfth if statement
                    
                    else{//fourth else statement     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//ends fourth else statement 
                
                }
            }//ends eleventh if statement 
            else{
                if(myScanner.hasNext()){    //if user equals string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//twelfth if statement     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//ends twelfth if statement
                    
                    else{//fourth else statement     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//ends fourth else statement 
            }
        }//ends tenth if statement
        }
    }//ends main method
}//ends public class