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
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pages;
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
        return pages;
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
        System.out.println("Pages " + pages);
    }
}
