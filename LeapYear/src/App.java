public class App {
    public static void main(String[] args){
    
       
      }

      public static Boolean leapYear(int year , boolean leap){
        year = 1900;
         leap = false;
    
        if (year % 4 == 0) {
    
          if (year % 100 == 0) {
    
            if (year % 400 == 0)
              leap = true;
            else
              leap = false;
          }
          
          else
            leap = true;
        }
        
        else
          leap = false;
    
        if (leap == true)
          System.out.println(year + " is a leap year.");
        else
          System.out.println(year + " is not a leap year.");
        return leap;
        

      }
      
    }

