open class Book(var nr: Int, var name: String, var author: String) {
    fun get():String{
        return "$nr $name $author"
    }

    open fun isSearchedBook(param:String):Boolean{
        println("Checking Book " + this.get())
        var isBook = (nr.toString() == param ||name == param || author == param)
        return isBook
    }
}
class AdventureBook(nr: Int, name: String, author: String, val isForKids:Boolean): Book(nr, name, author) {
    override fun isSearchedBook(param: String): Boolean {
        println("Checking Adventure Book " + this.get())
        return (nr.toString() == param || name == param || author == param || isForKids.toString() == param)
    }
}

    class RomanceBook(nr: Int, name: String, author: String, val rating:String): Book(nr, name, author){
        override fun isSearchedBook(param: String): Boolean {
            println("Checking Romance Book " + this.get())
            return (nr.toString() == param || name == param || author == param|| rating == param)
        }
}