package com.elasticpath.rest.json.unmarshalling.impl;

public class ClassInstantiator {

	public <T> T newInstance(Class<T> resultClass) throws InstantiationException, IllegalAccessException {
		return resultClass.newInstance();
	}
}
