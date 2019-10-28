package voyage.ikeda.doma2gradle5temp.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import voyage.ikeda.doma2gradle5temp.dto.SampleDto;

@Dao
@ConfigAutowireable
public interface SampleDao {

    @Select
    public SampleDto getUser();
}
