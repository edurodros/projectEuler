public class ProjectEuler1 {
    public static void main (String args []){
       problem1(1000); 
        
        
    }
    
    public static void problem1 (int max){
        int sum = 0;
        for (int i=1; i<max;i++){
            if (i%3==0 || i%5==0)
                sum=sum+i;
        }
        
        System.out.println("Total Sum is:  "+sum);
        
        
    }
    
}