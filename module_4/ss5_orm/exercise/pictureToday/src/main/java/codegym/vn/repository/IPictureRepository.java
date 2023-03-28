package codegym.vn.repository;

import codegym.vn.bean.Picture;

import java.util.List;

public interface IPictureRepository {
     Picture findById(int id);
    void create(Picture picture);
    void update(Picture picture);
    void deleteById(int id);
    List<Picture> findAll();
}
