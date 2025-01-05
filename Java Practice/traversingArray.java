public class traversingArray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        int sum = 0;
        int target = 9;
        for(int i = 0;i<num.length;i++){           
            //int sum =0;
                   
            sum = sum + num[i];
            System.out.println(num[i]);
            
            
        }
        System.out.println(sum);
        
        

    }
    
}
