/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ari Kamiski
 * @version Sept 20 2021
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int numPages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
    }

    // Add the methods here ...
    // GETTERS
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getPages(){
        return numPages;
    }
    public String getRefNumber(){
        return refNumber;
    }
    
    //Refnumber Methods
    public void setRefNumber(String ref){
        if(ref.length()<=3){
            refNumber = ref;
    }   else{
            System.out.println("Error- reference number must be 3 characters");
    }
    }
    
    
    //PRINT METHODS
    public void printAuthor(){
        System.out.print(author);
    }
    public void printTitle(){
        System.out.print(title);
    }
    public void printDetails(){
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("Pages " + numPages);
        System.out.println("Ref Number = " + refNumber);
        
        if(refNumber.length() > 0)
            System.out.println("Reference Number = " + refNumber);
        else
            System.out.println("Reference Number = ZZZ ");
    }
}
