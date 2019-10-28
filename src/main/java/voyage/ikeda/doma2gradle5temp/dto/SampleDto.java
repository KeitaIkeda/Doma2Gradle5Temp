package voyage.ikeda.doma2gradle5temp.dto;

import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
public class SampleDto {

    public String userId;

    public String userNameE;

    public String emailAddr;
}
