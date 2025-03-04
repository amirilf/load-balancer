package com.github.amirilf.load_balancer.model;

import java.util.UUID;
import org.example.model.ResourceTaskModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResourceTask implements ResourceTaskModel {
    private UUID id;

    public ResourceTask() {
        this.id = UUID.randomUUID();
    }
}
