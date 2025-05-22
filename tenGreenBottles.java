package Java_learning;
public class tenGreenBottles {
    public static void main( String[] args){
        int bottlesNum = 10;
        String word = "bottles";

        while(bottlesNum > 0){

            
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            bottlesNum = bottlesNum -1 ;

            if(bottlesNum == 1){
                word = "bottle";
            }

            if(bottlesNum > 0){
                System.out.println("And if one green bottle should accidently fall");
                System.out.println("there'll be " + bottlesNum + " green " + word + " hanging on the wall");
            }
            else{
                System.out.println("There'll be zero green bottle hanging on the wall");
            }
            System.out.println();

        }

    }
}
