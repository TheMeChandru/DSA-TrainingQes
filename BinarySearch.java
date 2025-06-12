public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,23,45,55,65,74};
        int right=arr.length-1;
        int l=0;
        
        int key=23;
            while(l<=right){
                int mid =(l+right)/2;
                if(arr[mid]==key){
                    System.out.println("Key Found "+mid);
                    break;
                }else if(key>arr[mid]){
                    l=mid-1;
                }else{
                    right=mid+1;
                }
            }
        }
    }

