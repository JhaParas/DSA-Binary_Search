import java.util.*;


class Search{

    int BinarySearch(int arr[],int s,int e,int key){
       if(e>=s){
        int mid=(s+e)/2;

        if(arr[mid]==key)
        return mid;
         
        if(arr[mid]>key)
        return BinarySearch(arr, s, mid-1, key);

        
        return BinarySearch(arr, mid+1, e, key);}

         return -1;}
    }


    public class UsingRecursion{
       

        public static void main(String []args){

             System.out.print("Enter the Size of Array : ");
        
        Scanner sc =new Scanner(System.in);
       

        int n= sc.nextInt();
        System.out.print("Enter the digit you want to search : ");
        int key= sc.nextInt();
        
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        Arrays.sort(arr);
          Search s=new Search();
          if(s.BinarySearch(arr,0,n,key)==-1)
          System.out.println("There is no such element present in the given Array");
          else
          System.out.println("Your key is at "+s.BinarySearch(arr, 0, n,key) +"th Index");
           sc.close();

        }
        








    }



    






