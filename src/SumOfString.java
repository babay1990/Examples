public class SumOfString {

    public String newSum(String str){

        int sum = 0;
        try{
            int chislo = Integer.parseInt(str);
            while(chislo > 0){
                sum = sum + (chislo % 10);
                chislo = chislo / 10;
            }
        }catch(Exception ex){
            return "Ты че ввел, казел!?!?!?!";
        }
        return String.valueOf(sum);
    }
}
