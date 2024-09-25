package mediatheque;

public class PrintCDVisitor implements ItemVisitor{
    public PrintCDVisitor(){}

    public void visit(Book book){}

    public void visit(CD cd){
        System.out.println(cd);
    }
}