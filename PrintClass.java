public class PrintClass {

    public int toPrint = 10;

    public void print(){
        String.format("\"---<%d>---\"%n", toPrint);

        System.out.printf("\"---<%d>---\"%n", toPrint);
    }



}