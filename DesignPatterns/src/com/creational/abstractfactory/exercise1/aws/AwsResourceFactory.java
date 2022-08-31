package com.creational.abstractfactory.exercise1.aws;


import com.creational.abstractfactory.exercise1.Instance;
import com.creational.abstractfactory.exercise1.ResourceFactory;
import com.creational.abstractfactory.exercise1.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
