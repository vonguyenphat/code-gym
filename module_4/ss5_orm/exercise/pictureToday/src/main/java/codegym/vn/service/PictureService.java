package codegym.vn.service;

import codegym.vn.bean.Picture;
import codegym.vn.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureService implements IPictureService {
    @Autowired
    IPictureRepository pictureRepository;

    @Override
    public Picture findById(int id) {
        return pictureRepository.findById(id);
    }

    @Override
    public void create(Picture picture) {
        pictureRepository.create(picture);
    }

    @Override
    public void update(Picture picture) {
        pictureRepository.update(picture);
    }

    @Override
    public void deleteById(int id) {
        pictureRepository.deleteById(id);
    }

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }
}
