package base;

public class TextNote extends Note{
	private String content;
	public TextNote(String title){
		super(title);
	}
	public TextNote(String title,String content){
		super(title);
		this.content=content;
	}
	@Override
	public boolean contains(String s){
		if(super.contains(s)||content.toLowerCase().contains(s)){
			return true;
		}
		return false;
	}

}
