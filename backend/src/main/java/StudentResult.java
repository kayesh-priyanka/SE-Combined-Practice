public class StudentResult {
       public String getResult(int marks){
          if(marks >= 50){
            return "Pass";
         }else{
            return "Fail";             
         }                

       }
}