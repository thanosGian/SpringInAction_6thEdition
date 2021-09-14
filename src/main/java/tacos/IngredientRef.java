package tacos;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
//not necessary to annotate  IngredientRef class
@Table
@Data
public class IngredientRef {

    private final String ingredient;

}
