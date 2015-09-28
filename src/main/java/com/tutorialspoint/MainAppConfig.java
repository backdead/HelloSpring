package com.tutorialspoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainAppConfig {
	public static void main(String[] args) {
//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWordConfig.class);
//		
//		SayToWorld sayToWorld = context.getBean(SayToWorld.class);
//		
//		//load various configuration classes as follows:
////		AbstractApplicationContext context = new AnnotationConfigApplicationContext();
////		context.register(AppConfig.class, OtherConfig.class);
////		context.register(AdditionalConfig.class);
////		context.refresh();
//		
//		sayToWorld.setMessage1("hello");
//		sayToWorld.setMessage2("kevin");
//		
//		sayToWorld.displayMessage();
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor te = context.getBean(TextEditor.class);
		te.spellCheck();
	}
}
