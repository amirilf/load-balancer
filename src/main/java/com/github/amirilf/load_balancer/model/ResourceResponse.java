package com.github.amirilf.load_balancer.model;

import java.util.UUID;
import org.example.model.ResourceResponseModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResourceResponse implements ResourceResponseModel {
    private UUID taskId;
    private String result;
    private boolean successful;
}
