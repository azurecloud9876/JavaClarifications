package com.creational.abstractfactory.exercise1.gcp;


import com.creational.abstractfactory.exercise1.Instance;
import com.creational.abstractfactory.exercise1.ResourceFactory;
import com.creational.abstractfactory.exercise1.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }


}
