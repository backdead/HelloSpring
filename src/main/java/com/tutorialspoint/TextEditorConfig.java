package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}
	
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}
