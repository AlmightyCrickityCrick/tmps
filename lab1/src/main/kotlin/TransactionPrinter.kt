class TransactionPrinter {
    fun printBuyToSTD(book:Book, nr:Int){
        println(book.get() + " sold as Transaction " + nr.toString())
    }
    fun printCancelToSTD(nr:Int){
        println("Transaction $nr nullified")
    }

    fun printErrorToSTD(nr: Int){
        println("Transaction $nr doesnt exist")
    }
}