package edu.sru.group7.roomallocation.domain;

public enum ProjModelNumber {
	
	//Used chatGPT to figure out this - as users would not want to see underscores in options
    PANASONIC_RW_330("Panasonic RW-330"), 
    SONY_VPL10("Sony VPL10"),
    EPSON_485("Epson 485"),
    EPSON_695("Espon 695"),
    TV("TV"),
    CHRISTIE_850("Christie 850"),
    NEC_NP_510("NEC NP-510"),
    NEC_NP_76("NEC NP-76"),
    VIEWSONIC_VIEWBOARD("Viewsonic Viewboard"),
    SONY_VPL290L("Sony VPL290L"),
    EPSON_595("Epson 595"),
    SONY_VPLZ90("Sony VPLZ90"),
    N_A("N/A");
    
    private final String displayName;

    ProjModelNumber(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
