package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	//private final ItemVisitor v= new PrintCatalogVisitor();
	//private final ItemVisitor vCD= new PrintCDVisitor();
	//private final ItemVisitor vBook= new PrintBookVisitor();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
		for (Item i : items){
			if (i instanceof Book){
				System.out.println(i);
			}
		}
	}

	public void printOnlyCDs() {
		for (Item i : items){
			if (i instanceof CD){
				System.out.println(i);
			}
		}
	}

}
