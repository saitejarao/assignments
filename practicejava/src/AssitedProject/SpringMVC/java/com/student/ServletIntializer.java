package com.student;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {		
		return new Class[] {ConfigStudent.class};
	}

	@Override
	protected String[] getServletMappings() {		
		return new String[] {"/"} ;
	}

}
