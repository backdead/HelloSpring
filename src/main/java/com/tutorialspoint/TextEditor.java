package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	/* Version annotation */
//	@Autowired
//	private SpellChecker spellChecker;
//	
//	
//	public TextEditor() {
//		System.out.println("Inside TextEditor constructor");
//	}
//		
//	public void spellCheck() {
//		spellChecker.checkSpelling();
//	}
//
//	public SpellChecker getSpellChecker() {
//		return spellChecker;
//	}
//	
//	//@Resource(name= "spellChecker")
//	public void setSpellChecker(SpellChecker spellChecker) {
//		System.out.println("setSpellCheck...");
//		this.spellChecker = spellChecker;
//	}
	
	/* Version configuration */
	private SpellChecker spellChecker;
	
	public void init() {
		System.out.println("Bean's initiation");
	}
	
	public void destroy() {
		System.out.println("Destroy the bean");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
