package com.oops;

public abstract class  LibraryItem {
	private String title ;
	private int itemId;
	
	LibraryItem (String title, int itemId){
		this.title = title;
		this.itemId = itemId;
	}
	
	

	 



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public abstract void displayInfo() ;
}
