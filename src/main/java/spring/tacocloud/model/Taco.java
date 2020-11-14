package spring.tacocloud.model;

import java.util.List;
// end::allButValidation[]
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// tag::allButValidation[]
import lombok.Data;

@Data
public class Taco {

    private String name;
    private List<String> ingredients;

}