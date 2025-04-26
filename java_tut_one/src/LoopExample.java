public class LoopExample {
    public static void main (String arr[]){

        int[] array = {1,2,32,23,4};
//        this is for each loop in java
        int sum= 0;
        for(int num : array){
            sum += num;
        }
        System.out.println(sum);

//        now we will learn break and continue in loop

        int number = 100;

        for(int i=0; i<=100; i++ ){
            System.out.println(i);

            if(i==50){
                continue;
            }

//            if we want to terminate the loop after 50 then
            if(i==50){
                break;
            }

            System.out.println("end");
        }

    }
}
