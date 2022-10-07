class Seller(lib: Librarian) {
    var ts = TransactionSystem()
    var librarian : Librarian = lib


    private fun searchLibrary(book:String):Book?{
        var b = librarian.searchBookcase(book)
        if (b != null) return b
        return null

    }

    fun sell(book: String){
        var b = searchLibrary(book)
        if(b !=null) {
            ts.createTransaction(b)
        }
    }

//    fun returnBook(nr:Int, book:Book){
//        if (ts.tryCancelTransaction(nr, book)) {
//            librarian.putBook(book)
//        }
//    }
}