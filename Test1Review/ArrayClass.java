import java.util.Arrays;
/**
 * Write a description of class ArrayClass here.
 * Anna
 * Test 1 Review
 */
public class ArrayClass
{
    //public static void main(){
    int Array[]; //declaration
    public ArrayClass (){

    }

    public void loadArray(){
        //int Array[];
        Array = new int[4];//initialization
        for(int i = 0; i<Array.length; i++){
            Array[i] = (int)(Math.random()*10 +1);
        }
    }
    //public void printArray(){
    public int getSum(){
        int sum = 0;
        for (int i = 0; i<Array.length; i++){
            sum = sum + Array[i];
        }
    
        return(sum);
    }
    
}

