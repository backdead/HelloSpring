package com.tutorialspoint;

import javax.annotation.Resource;

public class TextEditor {
	//@Autowired
	private SpellChecker spellChecker;
	
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor");
	}
		
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	@Resource(name= "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("setSpellCheck...");
		this.spellChecker = spellChecker;
	}
}
