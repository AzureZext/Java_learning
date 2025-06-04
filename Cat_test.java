class Cat {
    private int height;
    private String name;
    private String color;

    public void setHeight(int h){
        if(h>10){
            height = h;
        }
    }
    public int getHeight(){
        return height;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setColor(String cl){
        color = cl;
    }
    public String getColor(){
        return color;
    }   
}

public class Cat_test{
    public void main(String[] args){
            Cat cat1 = new Cat();

            cat1.setHeight(15);
            cat1.setColor("blue");
            cat1.setName("luffy");

            System.out.println(cat1.getHeight());
            System.out.println(cat1.getColor());
            System.out.println(cat1.getName());
        }
}