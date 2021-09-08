package az.company.springbootq5.dto;

import lombok.Data;

import java.util.List;

@Data
public class Response {
    public int objectId;
    public String name;
    public String nameEn;
    public String typeAz;
    public Shape shape;
    public List<Path> paths;
}
