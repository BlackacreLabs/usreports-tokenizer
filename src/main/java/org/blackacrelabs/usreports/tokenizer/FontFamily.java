package org.blackacrelabs.usreports.tokenizer;

public final class FontFamily {
	/*
	 * DHLFFO+CenturyExpanded
	 * 
	 * DHLFIG+Century-Bold
	 * 
	 * DIDPLP+CenturyExpandedSC-Regular
	 * 
	 * DKJIOK+CenturyExpanded-Italic
	 * 
	 * Times-Roman
	 */
	public static final float CASES_ADJUDGED_SIZE = 11.0f;
	public static final float NORMAL_SIZE = 10.0f;
	public static final float PAGE_CODE_SIZE = 7.0f;
	public static final float FOOTNOTE_SIZE = 8.0f;
	// Used to print "Supreme Court" in fancy gothic letters
	public static final float SUPREME_COURT_SIZE = 13.0f;

	public static TokenType tokenTypeForFont(String baseFont) {
		// if (baseFont.equals("DHLFFO+CenturyExpanded"))
		if (baseFont.equals("DHLFIG+Century-Bold"))
			return TokenType.B;
		else if (baseFont.equals("DIDPLP+CenturyExpandedSC-Regular"))
			return TokenType.SC;
		else if (baseFont.equals("DKJIOK+CenturyExpanded-Italic"))
			return TokenType.EM;
		// else if (baseFont.equals("Times-Roman"))
		else
			return TokenType.RM;
	}
}
