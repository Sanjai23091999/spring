package org.example;

import org.springframework.stereotype.Component;

@Component
public class Architect {
    private String ArchitectType;

    public String getArchitectType() {
        return ArchitectType;
    }

    public void setArchitectType(String architectType) {
        ArchitectType = architectType;
    }

    public void getArchitectInfo() {
        System.out.println(getArchitectType()+"Architect");
    }
}
