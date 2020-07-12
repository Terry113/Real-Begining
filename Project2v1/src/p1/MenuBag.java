package p1;



public class MenuBag {
	private final String MENU_ITEM_FORMAT = "%-10s%10s%10.2f%n";
	private Book[] menuBag;
	private int nElems;
	public Book[][] getMenuBag;

	public MenuBag(int size) {
		menuBag = new Book[size];
	}

	public void insert(Book menuItems2) {
		menuBag[nElems++] = menuItems2;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.printf(MENU_ITEM_FORMAT, menuBag[i].getItemNum(),menuBag[i].getDescription(),menuBag[i].getPrice());
		}
	}

	public Book removeById(String id) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			String block = String.valueOf(menuBag[i].getItemNum());
			if (block.equals(id)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Book temp = menuBag[i];
			for (int j = i; j < nElems - 1; j++) {
				menuBag[j] = menuBag[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public Book findById(String id) {
		for (int i = 0; i < nElems; i++) {
			String block = String.valueOf(menuBag[i].getItemNum());
			if (block.equals(id)) {
				return menuBag[i];
			}
		}
		return null;
	}

	public Book getMenuBag(String num) {
		for(int i = 0; i<nElems;i++) {
			String block = String.valueOf(menuBag[i].getItemNum());
			if (block.contentEquals(num));
			return menuBag[i];
		}
		return null;
		
	}

	
	
	
}
