package org.ps.spring.common;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.StringUtils;

public class ExpandableCustomDateEditor extends PropertyEditorSupport{
	private final static String DEFAULT_OUTPUT_FORMAT = "dd/mm/yyyy";
	private final static String[] INPUT_FORMATS = {
			"dd/mm/yyyy hh:mm:ss",
	        "dd-mm-yyyy hh:mm:ss",
	        "dd/mm/yy hh:mm:ss",
	        "dd-mm-yy hh:mm:ss",
	        "dd/mm/yyyy",
	        "dd-mm-yyyy",
	        "dd/mm/yy",
	        "dd-mm-yy",
	        "dd-MMM-yyyy"
	};
	
	private String outputFormat;
	private String[] inputFormats;
	private boolean allowEmpty;
	
	public ExpandableCustomDateEditor(){
		this.inputFormats = INPUT_FORMATS;
		this.outputFormat = DEFAULT_OUTPUT_FORMAT;
		this.allowEmpty = false;	
	}
	
	public ExpandableCustomDateEditor(String outputFormat, String[] inputFormats) {
        this.outputFormat = outputFormat;
        this.inputFormats = inputFormats;
        allowEmpty = false;
    }

    
    public ExpandableCustomDateEditor(String outputFormat, String[] inputFormats,
            boolean allowEmpty) {
        this.outputFormat = outputFormat;
        this.inputFormats = inputFormats;
        this.allowEmpty = allowEmpty;
    }

	@Override
	public String getAsText() {
        if (allowEmpty && getValue() == null) {
            return "";
        }

        return DateFormatUtils.format((Date) getValue(), outputFormat);
    }
	@Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            if (StringUtils.hasText(text)) {
                setValue(DateUtils.parseDate(text, inputFormats));
            } else {
                if (allowEmpty) {
                    setValue(null);
                } else {
                    throw new IllegalArgumentException(
                            "The text specified for parsing is null");
                }
            }
        } catch (ParseException ex) {
            throw new IllegalArgumentException("Could not parse text ["
                    + text + "] into any available date input formats", ex);
        }
    }

}
