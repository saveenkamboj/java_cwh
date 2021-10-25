package com.company;

class Library{
    public String[] book = new String[100];
    public int no_of_books;
    public Library(){
        this.book = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book){
        this.book[no_of_books] = book;
        no_of_books += 1;
        System.out.println("\""+book+"\""+" has been Added !!!");
    }
    public void showBook(){
        System.out.println("Showing Available Books");
        for(String ele : this.book){
            if(ele == null){
                continue;
            }
            System.out.println("* "+ele);
        }
        System.out.println("");
    }

    public void issueBook(String book){
        for(int i = 0 ; i < this.book.length ; i++){
            if(this.book[i].equals(book)){
                System.out.println("The Book has been issued!");
                this.book[i] = null;
                return;
            }
        }
        System.out.println("This Book Doesn't Exist");
        System.out.println("");

    }
}

public class Exercise_4_Library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.showBook();
        centralLibrary.addBook("C++");
        centralLibrary.showBook();
        centralLibrary.issueBook("Saveen");
        centralLibrary.showBook();
    }
}
