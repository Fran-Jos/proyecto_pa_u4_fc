package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaConsumerImpl implements IPersonaConsumer<String> {

	private static final Logger LOG = LoggerFactory.getLogger(PersonaConsumerImpl.class);
	
	@Override
	public void accept(String arg1) {
		// TODO Auto-generated method stub
		LOG.info("__MENSAJE__:" + arg1);
	}

}
