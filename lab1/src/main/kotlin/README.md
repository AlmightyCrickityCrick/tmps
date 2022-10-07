#Laboratory 1
The Following Program pertains to the FAF.TMPS16.1 course and shows the implementation of two SOLID principles:
Single Responsibility and Liskov Substitution Principle.

The first principle refers to the implementation of each class as being responsible for one job. The TransactionSystem creates transaction record, the TransactionPrinter prints a transaction record, Seller sells books, the Librarian searches the library for a book, the Bookcases hold books and Book
class holds information about a single book.

The Liskov substitution refers to the usage of a child class as a parent without getting errors, which has to be done by not limiting or changing drastically the behaviors of the base class in the derived classes, which is accomplished within the RomanceBook and AdventureBook classes that inherit from Book.