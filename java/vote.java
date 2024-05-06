//  public class vote
// {
//     public static void main(String[] args)
//     {
//        int arr[] = new int[4];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;

//        for (int i=0; i<4; i++)
//        {
//            System.out.println(arr[i]);
//        }
      
//     }

// }


public class vote
{
    public static void main(String[] args)
    {
        int arr[][] = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                
                arr[i][j] = (int)(Math.random() * 10); // for converting random(doubles) into integer : 100-two digit,10:1 didit
            }
        }
        

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}