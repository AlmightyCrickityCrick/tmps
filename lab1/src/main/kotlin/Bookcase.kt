import java.util.*
class Bookcase {
    lateinit var genre:String
    var location: Int = 0
    var books = ArrayList<Book>()

    fun putBook(book:Book){
        this.books.add(book)
    }
    fun getBook(param:String):Book?{
        for(book in books) {
            if( book.isSearchedBook(param)) {
            books.remove(book)
            return book
        }}
        return null
    }

}