package lesson2;

public class Arrays {
    public static void main(String[] args) {

    }
    static void task1(){
       int[] arr =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
       for(int i = 0; i < arr.length; i++){
          if(arr[i] == 1){
              arr[i] = 0;
              System.out.println(arr[i]);
          } else {
              arr[i] = 1;
              System.out.println(arr[i]);
          }
       }
    }
    static void task2(){
        int[] arr = new int[8];
        int k = 0;
        for(int i = 0; i < arr.length; i++, k = k + 3){
            arr[i] = k;
            System.out.println(arr[i]);
        }
    }
    static void task3(){
        int[] arr = {1, 5, 3, 2 ,11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if(i < 6){
               arr[i] = arr[i] * 2;
               System.out.println(arr[i]);
            }
        }
    }
    static void task4(){
        int[][] arr = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int k = 0; k < 4; k++){
                if(i == k){
                    arr[i][k] = 1;
                    System.out.println(arr[i][k]);
                }
            }
        }
    }
}
