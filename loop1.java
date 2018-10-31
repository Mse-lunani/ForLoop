package forloopmine;
import java.util.scanner;
public class ForLoopMine {

    public static void main(String[] args) {
        int m=0;
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
       String name = input.next();
        String y="Hello"+name+",welcome to Java";
        
        for(m=0;m<5;m++){
            System.out.println(y);
        }
    }
    
}
