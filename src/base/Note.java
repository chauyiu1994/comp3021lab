package base;
import java.util.Date;

public class Note implements Comparable<Note>,java.io.Serializable{
	private Date date;
	private String title;
	private static final long serialVersionUID=1L;
	public Note(String title){
		this.title=title;
		date=new Date(System.currentTimeMillis());
	}
	public String getTitle(){
		return title;
	}
	public boolean equals(Note n){
		if(this.title==n.title){
			return true;
		}
		return false;
	}
	public boolean equals(String s){
		if(this.title.equals(s)){
			return true;
		}
		return false;
	}
	public boolean contains(String s){
		if(title.toLowerCase().contains(s)){
			return true;
		}
		return false;
		
	}
	@Override
	public int compareTo(Note o){
		if(this.date.after(o.date)){
			return -1;
		}else if(this.date.before(o.date)){
			return 1;
		}
		return 0;
	}
	public String toString(){
		return date.toString()+"\t"+title;
	}
	

}
