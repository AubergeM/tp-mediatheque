package mediatheque;

public class PrintBookVisitor implements ItemVisitor{
    public PrintBookVisitor(){}

    public void visit(Book book){
        System.out.println(book);
    }

    public void visit(CD cd){}

}