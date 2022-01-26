public class SqrtFromNumber {

    public void findSqrt(int number){
        int result = number;
        boolean isRUnning = true;
        long start = System.currentTimeMillis();
        do{
            if((result * result) != number){
                if((result * result) > number) result = result / 2;
                if((result * result) < number) result = result + 1;
            }
            System.out.println(result);
            if((result * result) == number){
                System.out.println("Ваше число --> " + result);
                isRUnning = false;
            }


        } while(isRUnning);

        System.out.println("Время выполнения --- " + (System.currentTimeMillis() - start));
    }
}
