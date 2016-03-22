package by.hrodna.shaplyka.notepad;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Shaplyka
 * 
 * Application Notepad. Main method.
 *
 */

public class Application {
	
	

	public static void main(String[] args) {
		
		final int SHOW_ALL_NOTES = 1;
		final int ADD_NOTE = 2;
		final int EDIT_NOTE = 3;
		final int DELETE_NOTE = 4;
		final int EXIT = 5;
		
		Date date = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
		
		
		List<Note> notes = new ArrayList<Note>();
		Notepad notepad = new Notepad();
		
		
		Integer index = null;
		Integer cursor = 0;
		
		
		
		while (cursor != 5) {
			
		
			System.out.println("1. Show all Notes.");
			System.out.println("2. Add Note.");
			System.out.println("3. Edit Note.");
			System.out.println("4. Delete Note.");
			System.out.println("5. Exit");
			
			Note note = new Note();
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input: ");
			
			
			if (scanner.hasNextInt()) {
				
				cursor = Integer.valueOf(scanner.nextLine());
				
			}
			
			switch (cursor) {
			case SHOW_ALL_NOTES:
				
				notes = notepad.getNotes();
				

				int i = 1;
				
				for (Note newNote: notes) {
					
					String dataNote = newNote.getDataNote();
					String textNote = newNote.getTextNote();
					
					String valueDate = String.format("%d. Date: %s%n",i, dataNote);
					String valueText = String.format("Note: %s%n", textNote);
					
					System.out.print(valueDate);
					System.out.println("***************************");
					System.out.print(valueText);
					System.out.println();
					
					i++;
				}
				
				break;
			case ADD_NOTE:
				
				System.out.print("Input new Note: ");
				String text = scanner.nextLine();
				
				note.setDataNote(format.format(date));
				note.setTextNote(text);
				
				notepad.addNote(note);
				
				break;
			case EDIT_NOTE:
				
				System.out.print("Input index of note: ");
			
		    	
		    	if (scanner.hasNextInt()) {
		    		
		    		index = Integer.parseInt(scanner.nextLine());
		    		
		    		if (notes.size() >= index) {
		    			
		    		
		    			System.out.print("Input new text for Note: ");
				    	note.setDataNote(format.format(date));
						note.setTextNote(scanner.nextLine());
						
						notepad.editNote(index, note);
		    			
					}
					
		    		
		    		
		    		
		    			
		    		
		    		} else break;
		    	
		    	
		    	
				
				break;
				
			case DELETE_NOTE:
				
				System.out.print("Input index of note: ");
			
		    	
		    	if (scanner.hasNextInt()) {
		    		
		    		index = Integer.parseInt(scanner.nextLine());
		    		
		    		if (notes.size() >= index) {
		    			
						
						notepad.deleteNote(notes.get(index-1));
		    			
					}
					
		    		
		    		
		    		
		    			
		    		
		    		} else break;
			
				
				break;
			case EXIT: 
				
				System.exit(0);
				
			default:
				break;
			}
			
		}
	
		
		

	}

}
