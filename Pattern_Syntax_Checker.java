public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
          String pattern = in.nextLine();
          testCases--;
          
          Pattern pat = null;
          try {
              pat = Pattern.compile(pattern);
          } catch (PatternSyntaxException e) {
              System.out.println("Invalid");
          }
          if (pat != null) System.out.println("Valid");
      }
   }
}
