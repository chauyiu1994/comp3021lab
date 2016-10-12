package base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Folder implements Comparable<Folder>,java.io.Serializable{
	private ArrayList<Note> notes;
	private String name;
	private static final long serialVersionUID=1L;
	public Folder(String name){
		this.name=name;
		notes=new ArrayList<Note>();
	}
	public void addNote(Note n){
		notes.add(n);
	}
	public String getName(){
		return name;
	}
	public ArrayList<Note> getNotes(){
		return notes;
	}
	
	@Override
	public String toString(){
		int nText=0;
		int nImage=0;
		for(Note n:notes){
			if(n instanceof TextNote){
				nText++;
			}else{
				nImage++;
			}
		}
		return name+":"+nText+":"+nImage;
	}
	public boolean equals(String n){
		if(this.name==n){
			return true;
		}
		return false;
	}
	@Override
	public int compareTo(Folder f){
		return this.name.compareTo(f.getName());
	}
	public void sortNotes(){
		Collections.sort(notes);
	}
	
	public List<Note> searchNotes(String keywords){
		List<Note> l=new ArrayList<Note>();
		String[] w1=keywords.toLowerCase().split(" ");
		
		out1:
		for(Note n:notes){
			int i=0;
			while(i<w1.length){
			    boolean found=false;
			    while(w1[i+1].equals("or")){
			    	if(n.contains(w1[i])){
			    		found=true;
			    	}
			        i+=2;
			        if(i==w1.length-1){
			        	break;
			        }
			    }
			    if(n.contains(w1[i])){
			    	found=true;
			    }
			    if(!found){
			    	continue out1;
			    }
			    i++;
			}
			l.add(n);
		}
		return l;
	}
}
