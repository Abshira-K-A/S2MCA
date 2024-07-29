import java.util.Scanner;

class negative extends RuntimeException{
    negative(String s){
        super(s);

    }
} 
class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        double sum = 0;
        System.out.println("enter"+n+"numbers");
        for (int i =0; i<n; i++){
            nums[i] = sc.nextInt();

            try{
                if(nums[i]< 0){
                    throw new negative("negative number not allowed");
                    
                } else{
                    sum = sum+nums[i];
                }
            }
            catch(negative e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
            }
            System.out.println("Average :"+String.format("%2f",sum/n ));
        sc.close();
        }   
     }     
