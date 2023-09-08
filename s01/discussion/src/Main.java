// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //public - access modifier which simply tells the application which classes have access to this method/attribute
    //static - keyword associated with method/property that is related in class. This will allow a method to be invoked without instantiating a class.
    //void - a keyword that is used to specify a method that doesn't return any value. In Java we have to declare the data type of the method's return.
    //String[] args - accepts a single argument of type String array that contains command line argument

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}