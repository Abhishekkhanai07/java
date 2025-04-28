class PrimeNumber
       {
   public static boolean primeNumber(int num)
       {     
             int count=0;
             for(int i=1;i<=num;i++)
              {
             if(num%i==0)
               {
              count++;
               }
              }
         return count==2;
       }
   public static void main(String[] args)
       {   
             int num=20;
           for(int i=1;i<=num;i++)
              {
               if(primeNumber(i))
                {
                System.out.println(i);
                }  
              }
    }
  }
      