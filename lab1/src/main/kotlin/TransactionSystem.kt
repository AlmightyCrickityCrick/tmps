class TransactionSystem {
    var transactionList = ArrayList<Int>()
    fun createTransaction(book:Book){
        var transactionNumber = (1..1000).random()
        transactionList.add(transactionNumber)
        var tp = TransactionPrinter()
        tp.printBuyToSTD(book, transactionNumber)
    }

//    fun tryCancelTransaction(nr:Int,book:Book):Boolean{
//        var tp = TransactionPrinter()
//        for (i in transactionList){
//            if (i == nr) {
//                transactionList.remove(nr)
//                tp.printCancelToSTD(nr)
//                return true}
//        }
//        tp.printErrorToSTD(nr)
//        return false
//    }
}