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

"$@"
