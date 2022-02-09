#!/bin/bash

DESTINATION=/usr/local/bin/musicrosterapp

install() {
	echo "Installing to $DESTINATION..."
	cp musicrosterapp $DESTINATION
}

uninstall() {
	echo "Uninstalling to $DESTINATION..."
	rm $DESTINATION
}

test() {
	echo "Testing..."
	#create test variables so they are udpadted for each install
	./musicrosterapp ListRoster producer > listRoster.actual
	cmp listRoster.actual listRoster.expected || echo "listRoster test failed..."

}
#Puts src code in bin folder
build(){ 
	echo "Compiling Java program to ./bin"
	javac -d /Users/keythageniuz/musicrosterapp/bin src/MusicRoster.java
}
#pulls file being used for app
run(){
	build
	echo "Running..."
	java -cp bin MusicRoster /Users/keythageniuz/musicrosterapp/src/topsongs0.csv
}
"$@"
