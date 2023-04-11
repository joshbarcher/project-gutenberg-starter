package stats;

import java.util.ArrayList;

/**
 * Stores the lines of a book in an ArrayList
 * and calculates simple analytics on the text
 */
public class BookAnalytics
{
    private ArrayList<String> bookLines;

    /**
     * Stores the list of lines found in the book.
     * @param bookLines the list of lines
     */
    public BookAnalytics(ArrayList<String> bookLines)
    {
        this.bookLines = bookLines;
    }

    /**
     * Returns the number of words found in the lines
     * of the book.
     *
     * Note: To make this calculation simpler, you can
     * ignore punctuation when implementing the method.
     *
     * Hint: The String class has a split() method which
     * can help here...
     *
     * @return the word count
     */
    public int wordCount()
    {
        return 0;
    }

    /**
     * Returns the number of letters found in the lines
     * of the book.
     *
     * @return the letter count
     */
    public int letterCount()
    {
        return 0;
    }

    /**
     * Returns the number of lines in the book.
     *
     * @return the line count
     */
    public int lineCount()
    {
        return 0;
    }
}
