import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4,2,1,1,1,3,4,5};
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i< arr.length;i++){
            if(mp.containsKey(arr[i])){
                int temp = mp.get(arr[i]);
                mp.put(arr[i],temp+1);
            }else{
                mp.put(arr[i] ,1);
            }
        }
        int maxFreq = -1 ;
        int maxFreqNum = -1 ;
        for(var e : mp.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                maxFreqNum = e.getKey();
            }
        }
        System.out.println(maxFreq +" "+maxFreqNum);

        System.out.println(mp.entrySet());

    }
}
