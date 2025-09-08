package bt;
import java.util.Scanner;
public class Rectangle {
    int x, y;
    public Rectangle(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getPerimeter(){
        return (x+y)*2;
    }
    public int getArea(){
        return x*y;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<=0 || y<=0){
            return;
        }
        Rectangle a=new Rectangle(x, y);
        System.out.println(a.getPerimeter());
        System.out.println(a.getArea());


    }


}
