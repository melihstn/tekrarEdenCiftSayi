import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

        int[] list = {2,2,8,5,71,42,8,3,13,11,11,42};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j]) && (list[i]%2 == 0)){
                    if (!isFind(dublicate , list[i])){
                        dublicate[startIndex++] = list[i];

                    }
                    break;

                }
            }
        }
        System.out.println(Arrays.toString(dublicate));

    }
}