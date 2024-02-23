package edu.sru.group7.roomallocation.domain;

public enum InterWhiteBoards {
	
	//Used chatGPT to figure out this - as users would not want to see underscores in options
    VIEW_BOARDS("View Boards"), 
    SMART_PODIUM("Smart Podium"),
    SHORT_THROW("Short Throw");
    
    private final String displayName;

    InterWhiteBoards(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
