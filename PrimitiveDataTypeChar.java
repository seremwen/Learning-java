import java.util.List;
public class PrimitiveDataTypeChar {

   public static void main(String []args) {

for (int i = 0; i < 65536; ++i ) {
char c = (char) i;
System.out.println("c[" + i + "]=" + c);

}
System.out.println("he last char value the for loop statement prints is 65535. the 65536 value is used as an upper maximum value. so, if i=65336, then nothing gets printed and the execution of the statement ends");
}
}