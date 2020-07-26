
import java.util.function.Predicate;
import java.util.*;
class Pal
{
public static boolean isPalindrome(String inputStr)
{
    StringBuffer reverseStr=new StringBuffer("");
    for(int i=inputStr.length()-1;i>=0;i--){
      reverseStr.append(inputStr.charAt(i));
    }
    if(inputStr.equalsIgnoreCase(reverseStr.toString())){
      return true;
    }
    return false;
  }
}
public class Lambda
{
public static void main(String args[])
{
String strArray[]={"madam","malayalam","ace","aed"};
                                          
List<Integer> list1=new ArrayList<>();
List<String> list = Arrays.asList(strArray);
                                          
list1.add(1);
list1.add(2);
list1.add(3);
list1.add(4);
                    
list1.add(5);
   
                    
average(list1);
                     
System.out.println(lowercase_a(list,(String str) -> str.startsWith("a") && str.length()==3 ));
                                   
                                          
System.out.println(lower(list ,Pal::isPalindrome));
}


                                         
public static void average(List<Integer> list1)
{
                                              
int sum=0;
                                              
for(int i:list1)
                                                     
sum+=i;
                   
                                              
System.out.println(sum/(list1.size()));  
}

public static List<String> lowercase_a(List<String> list,Predicate<String> predicate)
{
     List<String> list2=new ArrayList<String>();
     for(String str:list)
     {
         if(predicate.test(str))
         list2.add(str);
     }
      return (list2);  
}

                                        
public static List<String> lower(List<String> list,Predicate<String> predicate)
{
     List<String> list2=new ArrayList<>();

     for(String str:list)
     {
         if(predicate.test(str))
         list2.add(str);
     }
      return (list2);        
}

}   
