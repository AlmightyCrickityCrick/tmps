class Librarian(var library : ArrayList<Bookcase>) {
    fun searchBookcase(param:String):Book?{
        for (case in library){
            var book = case.getBook(param)
            if (book!= null) {
                return book
            }
        }
        return null
    }
}