package com.github.amirilf.load_balancer.model;

import org.example.LimitedResource;
import org.example.model.ResourceResponseModel;
import org.example.model.ResourceTaskModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Resource implements LimitedResource {
    private long id;
    private int maximumTaskCapacity;
    private String path;
    private boolean isAvailable;

    @Override
    public ResourceResponseModel process(ResourceTaskModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'process'");
    }
}
