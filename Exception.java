import java.util.List;
public class MyFirstJavaProgram  {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
     Performer p = null;//PerformerGenerator.get("John");
try {
System.out.println("TTL: " + p.getTimeToLive());
} catch (Exception e) {
System.out.println("The performer was not initialised properly
because of: " + e.getMessage() );
}

}
}