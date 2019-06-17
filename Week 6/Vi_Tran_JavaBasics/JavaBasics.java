public class JavaBasics {
    public void print1To255(){
        for(int i=1; i<=255; i++){
            System.out.println(i);
        }
    }
    public void printOdd1To255(){
        for(int i=1; i<=255; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printSum(){
        int sum = 0;
        int i = 0;
        while(i<256){
            sum+=i;
            System.out.println("New number: "+i+" Sum: "+sum);
            i++;
        }
    }
    public void interateArray(int[] arr){
        for(int num : arr){
            System.out.println(num);
        }
    }
    public void findMax(int[] arr){
        int max = arr[0];
        for(int num: arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
    public void getAvg(int[] arr){
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        System.out.println(sum/arr.length);
    }
    public ArrayList<Integer> arrayOddNum() {
        ArrayList<Integer> y= new ArrayList<Integer>();
        for(int i=1; i<=255; i++) {
            if(i%2 !=0) {
                y.add(i);
            }
        }
        return y;
    }
    public int greaterThanY(int[] arr, int y){
        int count = 0;
        for(int num : arr){
            if(num>y){
                count++;
            }
        }
        return count;
    }
    public int[] squareValues(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (arr[i]*arr[i]);
        }
        return arr;
    }
    public int[] eliminateNegNums(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public double[] maxMinAvg(int[] arr){
        double max = arr[0];
        double min = arr[0];
        double sum = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum += arr[i];
        }
        double[] newarray = {max, min, sum/arr.length};
        return newarray;
    }
    public int[] shiftArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr [i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}