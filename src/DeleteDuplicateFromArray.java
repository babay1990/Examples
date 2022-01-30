public class DeleteDuplicateFromArray {
    public int[] deleteByValue(int[] array, int val){

        int count = 0;
        int first = array.length;

        int length = array.length;

        int a = 0;

        while(a < length){
            if(array[a] == val){
                for(int j = a; j < length - 1; j++){
                    array[j] = array[j + 1];
                }
                count++;
                length--;
            } else a++;
        }
        for(int i = 0; i < length; i++){
            System.out.println(array[i]);
        }

        System.out.println("ответ -- " + (first - count));

        return array;
    }

    public void deleteDuplicate(int[] nums){

        int length = nums.length;
        int a = 1;

        while(a < length){
            if(nums[a] == nums[a - 1]){
                for(int j = a; j < length - 1; j++){
                    nums[j] = nums[j + 1];
                }
                length--;
            } else a++;
        }

        for(int i = 0; i < length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("счетчик -- " + (length));
    }
}
