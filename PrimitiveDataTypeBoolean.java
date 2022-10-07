import java.util.List;
public class PrimitiveDataTypeBoolean {
private boolean done;
public boolean isDone() {
return done;
}
public void setDone(boolean done) {
this.done = done;
}
   public static void main(String []args) {

PrimitiveDataTypeBoolean cp = new PrimitiveDataTypeBoolean();
System.out.println("Default value = " + cp.isDone());
System.out.println("The boolean type is not compatible with any other primitive type, assigning a boolean value to an int variable by simple assignment(using =) is not possible. Explicit conversion is not possible either");
}
}