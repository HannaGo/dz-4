public class PrintFormatedField {

    public int toPrint = 10;

    // метод
    public String print(){
        // format field
        String formatedField = String.format("\"---<%d>---\"%n", toPrint);

        // , який друкує в консоль "---<значення поля>---"
        System.out.println(formatedField);
        
        // і повертає його
        return formatedField;
    }



}