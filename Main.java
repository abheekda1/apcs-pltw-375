public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // step 6
        String authorToFind = "L. Frank Baum";

        // step 7
        for (Book book : library.getChildrensBooks()) {
            if (book.getAuthor().equals(authorToFind)) System.out.println(book);
        }

        // step 8
        String bookToFind = "Sky Island";
        double minimumRating = 0.0;

        // step 9
        for (Book book : library.getChildrensBooks()) {
            if (book.getTitle().equals(bookToFind)) minimumRating = book.getRating();
        }

        // step 10
        System.out.println(minimumRating);

        // step 11
        for (Book book : library.getChildrensBooks()) {
            if (book.getRating() > minimumRating) System.out.printf("%s by %s\n", book, book.getAuthor());
        }
    }
}
