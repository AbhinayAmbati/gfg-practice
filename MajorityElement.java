import java.util.Arrays;

public class MajorityElement{
    int majorityElement(int arr[]) {
        Arrays.sort(arr);
        int len = arr.length;
        int maj = arr[len/2];
        int count = 0;
        for(int n : arr){
            if(n == maj){
                count++;
            }
        }
        return (count > len/2) ? maj : -1;
    }
}