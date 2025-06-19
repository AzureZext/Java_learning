public class Loops {
    public static void main(String[] args) {
        for(int x=0; x<11; x++){
            System.out.print(x);
        }
        System.out.println();
        int counter = 0;
        while(counter<11){
            System.out.print(counter);
            counter++;
        }
        System.out.println();

        do{
            System.out.print(counter);
            counter--;
        }
        while(counter != 0);
    }

}
