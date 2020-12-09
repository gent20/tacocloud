package spring.tacocloud.model;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Data
@Table("tacoorders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @PrimaryKey

    private UUID id = Uuids.timeBased();

    private Date placedAt = new Date();

    @Column("user")
    private UserUDT user;
    // delivery and credit card properties omitted for brevity's sake

    @Column("tacos")
    private List<TacoUDT> tacos = new ArrayList<>();
    public void addDesign(TacoUTD design) {
        this.tacos.add(design);
    }
}
