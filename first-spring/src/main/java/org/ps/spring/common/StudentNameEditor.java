package org.ps.spring.common;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text){
		if(text.startsWith("Mr.") || text.startsWith("Mrs.")){
			setValue(text);
		} else{
			setValue("Ms. "+text );
		}
	}
}
