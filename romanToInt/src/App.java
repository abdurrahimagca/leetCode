import java.util.*;
public class App {
    public static void romanToInt(char roman[]){
        int total = 0;
        for(int i = 0; i < roman.length; i++){
            
            if(roman[i] == 'I')
                total+=1;
            else if (roman[i]== 'V')
                {
                    total+=5;
                    if(i> 0 && roman[i-1]=='I')
                    {
                        total-= 2;
                    }
                        
                }
            else if (roman[i]== 'X')
                {
                    total+=10;
                    if(i> 0 && roman[i-1]=='I')
                    {
                        total-= 2;
                    }
                    
                        
                }
            
            else if (roman[i]== 'L')
                {
                    total+=50;
                    if(i> 0 && roman[i-1]=='X')
                    {
                        total-= 20;
                    }

                }
            else if (roman[i]== 'C')
            { 
                total+=100; 
                if(i> 0 && roman[i-1]=='X')
                {
                    total-= 20;
                }
                
            }
            else if (roman[i]== 'D')
            {
                total+=500;
                if(i> 0 && roman[i-1]=='C')
                {
                    total-= 200;
                }
            }
            else if (roman[i]== 'M')
            {
                total+=1000;
                if(i> 0 && roman[i-1]=='C')
                {
                    total-= 200;
                }
                
            }  
        
        }   
        System.out.println(total);
        
    }
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            char [] num = input.toCharArray();
            romanToInt(num);
        }

    }
}
