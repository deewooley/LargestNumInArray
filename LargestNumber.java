public class LargestNumber {
        //given an array of numbers of any length. complete the method to find the largest number in an array of any size
        public static void main(String[] args) {
            int[] numArray = {100, 20, 200, 1000, 2};
            largestInArray(numArray);
        }
        public static void largestInArray(int[] numArray){
            int length = numArray.length;
            int largestNumber=0;
            int arrayEntries = numArray.length;
            for(int i = 0; i<arrayEntries; i++){
                if(numArray[i]>largestNumber){
                    largestNumber=numArray[i];
                }
            } System.out.println(largestNumber);
        }

    }


