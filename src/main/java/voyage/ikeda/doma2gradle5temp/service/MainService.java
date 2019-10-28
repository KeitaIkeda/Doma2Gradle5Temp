package voyage.ikeda.doma2gradle5temp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import voyage.ikeda.doma2gradle5temp.dao.SampleDao;
import voyage.ikeda.doma2gradle5temp.dto.SampleDto;

@Service
public class MainService {
    SampleDao sampleDao;

    @Autowired
    public MainService(SampleDao sampleDao) {
        this.sampleDao = sampleDao;
    }

    public void getUser() {
        SampleDto dto = sampleDao.getUser();

        System.out.println(dto.userId);
    }
}
