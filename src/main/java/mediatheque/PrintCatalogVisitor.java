package mediatheque;

public class PrintCatalogVisitor implements ItemVisitor{
    public PrintCatalogVisitor(){}

    public void visit(Book book){
        System.out.println(book);
    }

    public void visit(CD cd){
         System.out.println(cd);
    }

}