package facade;

public class MyGUI {
	private GUIMenu  menu; 
	private GUITitleBar titleBar; 
	private GUIContent content; 
	
	public MyGUI() {
		menu = new GUIMenu();
		titleBar = new GUITitleBar();
		content = new GUIContent(); 
	}
	public void drawGUI()	{
		content.showButtons();
		content.showTextFields();
		content.setDefaultValues(); 
		menu.drawMenuButtons();
		titleBar.showTitleBar("Title of the GUI");		
		
	}
	
	
}
