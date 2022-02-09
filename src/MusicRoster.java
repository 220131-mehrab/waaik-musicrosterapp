class MusicRoster {
        public static void main(String[] args){
		if(args.length < 1){
			System.out.println("\nError: No filename provided");
			System.out.println("\tUSAGE: java MusicRoster <filename>");
		}
		//opens files
		String filename = args[0];
                System.out.println(filename);
                
        }

	public void listRoster(){
		System.out.println("Here's our roster for that role...");
	}

	public void numRoles(){
		System.out.println("Here's the number of talent for that role...");
	}


}

