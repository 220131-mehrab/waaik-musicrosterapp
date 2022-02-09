import java.io.File;
import java.util.Scanner;

class MusicRoster {

        public static void main(String[] args) throws Exception {
		if(args.length < 1){
			System.out.println("\nError: No filename provided");
			System.out.println("\tUSAGE: java MusicRoster <filename>");
		}else{
			//opens files
			String filename = args[0];
                	File musicroster = new File(filename);
			//reads file line by line
			Scanner sc = new Scanner(musicroster);
			while (sc.hasNext());
				System.out.println(sc.next());
                
        }

	public void listRoster(){
		System.out.println("Here's our roster for that role...");
	}

	public void numRoles(){
		System.out.println("Here's the number of talent for that role...");
	}


}

