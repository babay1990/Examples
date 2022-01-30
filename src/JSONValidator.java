public class JSONValidator {

    public boolean validate(String json){
        int count = 0;
        char[] massiv = json.toCharArray();

        for(int i = 0; i < massiv.length; i++){
            if(count < 0) return false;
            if(massiv[i] == '{') count++;
            if(massiv[i] == '}') count--;
        }
        return count == 0;

    }

}
