import java.util.Scanner;

class Book{
    String name,author;
    double price;
    int num_pages;
    Scanner sc = new Scanner(System.in);

    Book(){

    }

    Book(String name, String author, double price, int pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = pages;
    }

    void setDetails(){
        System.out.print("Enter name of the book: ");
        this.name = sc.nextLine();
        System.out.print("Enter the author of the book: ");
        this.author = sc.nextLine();
        System.out.print("Enter the price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter the number of pages: ");
        this.num_pages = sc.nextInt();
    }

    void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Number of pages: " + num_pages);
    }

    public String toString(){
        return("Name: " + name + "\nAuthor: " + author + "\nPrice: " + price + "\nNumber of pages: " + num_pages);
    }
}


public class Labprog3{
    public static void main(String args[]) {
        int n;
        Book books[];
        Book myBook = new Book("Chamber Of Secrets", "J.K Rowling", 35.55, 367);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        n = sc.nextInt();
        books = new Book[n];

        for(int i=0;i<books.length;i++){
            System.out.println("Enter details for book " + (i+1) + ": ");
            books[i] = new Book();
            books[i].setDetails();
        }
        for(int i=0;i<books.length;i++){

            System.out.println("Details of book " + (i+1) + ": ");
            books[i].getDetails();
            System.out.println();
        }

        System.out.println(myBook);
        sc.close();
        
    }
}