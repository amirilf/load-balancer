package com.github.amirilf.load_balancer.model;

import org.example.LimitedResource;
import org.example.model.ResourceResponseModel;
import org.example.model.ResourceTaskModel;

public class Resource implements LimitedResource {

    @Override
    public long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    @Override
    public int getMaximumTaskCapacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaximumTaskCapacity'");
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPath'");
    }

    @Override
    public boolean isAvailable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAvailable'");
    }

    @Override
    public ResourceResponseModel process(ResourceTaskModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'process'");
    }

}
