var library = ArrayList<Bookcase>()
fun main(){
    library.add(Bookcase())
    library.add(Bookcase())

    library.get(0).putBook(Book(1, "Demian", "Herman Hesse"))
    library.get(0).putBook(RomanceBook(2, "Twilight", "E.L Smith", "adult"))
    library.get(1).putBook((AdventureBook(3, "Percy Jackson", "Rick Riordan", true)))

    var lib = Librarian(library)
    var seller = Seller(lib)
    seller.sell("Demian")

}