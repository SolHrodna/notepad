package by.hrodna.shaplyka.notepad;



import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Shaplyka
 * 
 * class Notepad with methods
 *
 */

public class Notepad {
	
	
	private List<Note> notes = new ArrayList<Note>();
	
	
	
    
    
    
    
	
    /**
     * Method add element
     * @param notes
     * @return
     */
	public void addNote(Note note){
		
		
				
		notes.add(note);
		
		
		
		
	
		
	}
	
	/**
	 * Method delete element by index
	 * @param notes
	 * @return
	 */
	public void deleteNote(Note note){
		
		
		
		notes.remove(note);
		
		
		
		
				
		
		
	}
	
	
	/**
	 * Method edit element
	 * @param notes
	 * @return
	 */
	public void editNote(Integer index, Note note){
		
		notes.set(index-1, note);
	
	}

	/**
	 * @return the notes
	 */
	public List<Note> getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}

}
