class ArmStrongNumber {

   
    public static int xPower(int x, int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result =result * x;
        }
        return result;
    }

    
    public static int countNumber(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 25;
        int temp = 25;
        int sum = 0;
        int count = countNumber(num);

        while(num != 0) {
            int ld = num % 10;
            sum = sum + xPower(ld, count);
            count--;
            num = num / 10;
        }

        if(temp == sum) {
            System.out.println(temp + " is an Armstrong Number");
        } else {
            System.out.println(temp + " is not an Armstrong Number");
        }
    }
}
