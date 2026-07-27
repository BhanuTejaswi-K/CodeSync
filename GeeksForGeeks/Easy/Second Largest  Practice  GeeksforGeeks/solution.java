class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
     int largest=Integer.MIN_VALUE;
     int seclargest=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]>largest) {
             seclargest=largest;
             largest=arr[i];
         }
         else if(arr[i]>seclargest && arr[i]!=largest) seclargest=arr[i];
         
     }
     return (seclargest==Integer.MIN_VALUE)?-1:seclargest;
        
    }
}