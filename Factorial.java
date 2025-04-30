class Factorial{
    public static void main(String[] args)
       {
        for(int i=1;i<=5;i++)
          {
          fact(i);
          }
       }
     public static void fact(int num)
       {
       int fact=1;
       for(int i=1;i<=num;i++)
         {
         fact=fact*i;
         }
        System.out.println(fact);
       }
 }