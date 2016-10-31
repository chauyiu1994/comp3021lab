package base;

import base.NoteBook;

public class GenerateTestSer {
	
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		nb.createTextNote("COMP3021", "COMP3021 syllabus", "Be able to implement object-oriented concepts in Java.");
		nb.createTextNote("COMP3021", "course information", "Introduction to Java Programming. Fundamentals include language syntax, object-oriented programming, inheritance, interface, polymorphism, exception handling, multithreading and lambdas.");
		nb.createTextNote("COMP3021", "Lab requirement","Each lab has 2 credits, 1 for attendence and the other is based the completeness of your lab.");
		
		nb.createTextNote("Books", "The Throwback Special: A Novel","Here is the absorbing story of twenty-two men who gather every fall to painstakingly reenact what ESPN called þý¥æ¸¢he most shocking play in NFL historyþý¥ï¿½ and the Washington Redskins dubbed the þý¥æ·­hrowback Specialþý¥ï¿½: the November 1985 play in which the Redskinsþý¥ï¿½ Joe Theismann had his leg horribly broken by Lawrence Taylor of the New York Giants live on Monday Night Football. With wit and great empathy, Chris Bachelder introduces us to Charles, a psychologist whose expertise is in high demand; George, a garrulous public librarian; Fat Michael, envied and despised by the others for being exquisitely fit; Jeff, a recently divorced man who has become a theorist of marriage; and many more. Over the course of a weekend, the men reveal their secret hopes, fears, and passions as they choose roles, spend a long night of the soul preparing for the play, and finally enact their bizarre ritual for what may be the last time. Along the way, mishaps, misunderstandings, and grievances pile up, and the comforting traditions holding the group together threaten to give way. The Throwback Special is a moving and comic tale filled with pitch-perfect observations about manhood, marriage, middle age, and the rituals we all enact as part of being alive.");
		nb.createTextNote("Books", "Another Brooklyn: A Novel","The acclaimed New York Times bestselling and National Book Awardþý¥æþýinning author of Brown Girl Dreaming delivers her first adult novel in twenty years. Running into a long-ago friend sets memory from the 1970s in motion for August, transporting her to a time and a place where friendship was everythingþý¥æþýntil it wasnþý¥æþý. For August and her girls, sharing confidences as they ambled through neighborhood streets, Brooklyn was a place where they believed that they were beautiful, talented, brilliantþý¥æþý part of a future that belonged to them. But beneath the hopeful veneer, there was another Brooklyn, a dangerous place where grown men reached for innocent girls in dark hallways, where ghosts haunted the night, where mothers disappeared. A world where madness was just a sunset away and fathers found hope in religion. Like Louise Meriwetherþý¥æþý Daddy Was a Number Runner and Dorothy Allisonþý¥æþý Bastard Out of Carolina, Jacqueline Woodsonþý¥æþý Another Brooklyn heartbreakingly illuminates the formative time when childhood gives way to adulthoodþý¥æþýhe promise and peril of growing upþý¥æþýnd exquisitely renders a powerful, indelible, and fleeting friendship that united four young lives.");
		

		nb.createTextNote("Holiday", "Vietnam","What I should Bring? When I should go? Ask Romina if she wants to come");
		nb.createTextNote("Holiday", "Los Angeles","Peter said he wants to go next Agugust");
		nb.createTextNote("Holiday", "Christmas" , "Possible destinations : Home, New York or Rome");
	    nb.save("test.ser");
	}
}
