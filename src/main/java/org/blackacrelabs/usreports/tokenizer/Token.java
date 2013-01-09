package org.blackacrelabs.usreports.tokenizer;

public class Token {
	public TokenType type;
	public String text;

	public Token(TokenType type) {
		this.type = type;
	}

	public Token(TokenType type, String text) {
		this.type = type;
		this.text = text;
	}

}
