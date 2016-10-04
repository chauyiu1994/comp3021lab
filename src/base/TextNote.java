package base;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TextNote extends Note {
	private String content;
	private static final long serialVersionUID=1L;
	public TextNote(String title){
		super(title);
	}
	public TextNote(String title,String content){
		super(title);
		this.content=content;
	}
	public TextNote(File f){
		super(f.getName());
		this.content=getTextFromFile(f.getAbsolutePath());
		
	}
	private String getTextFromFile(String absolutePath){
		String result="";
		try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))){
			String sCurrentLine;
			while((sCurrentLine=br.readLine())!=null){
				result+=sCurrentLine;
			}
		}catch(IOException e){
			return null;
		}	
		return result;
	}
	public void exportTextToFile(String pathFolder){
		try{
			File file=null;
			if(pathFolder==""){
				file=new File(pathFolder+this.getTitle().replaceAll(" ", "_")+".txt");
			}else{
				file=new File(pathFolder+File.separator+this.getTitle().replaceAll(" ", "_")+".txt");
			}
		    if(!file.exists()){
		    	file.createNewFile();
		    }
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		}catch(IOException e){
			return;
		}
	}
	@Override
	public boolean contains(String s){
		if(super.contains(s)||content.toLowerCase().contains(s)){
			return true;
		}
		return false;
	}

}
