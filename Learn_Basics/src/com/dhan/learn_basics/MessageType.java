package com.dhan.learn_basics;

public enum MessageType {
	A(Priority.HIGH),B(Priority.MEDIUM),C(Priority.LOW),D(Priority.LOW);
	
	private Priority priority;
	
	private MessageType(Priority priority) {
		this.priority = priority ;
	}
	
	public Priority getPriority() {
		return this.priority;
		
	}

	

}
