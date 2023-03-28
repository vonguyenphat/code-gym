package codegym.vn.repository;

import codegym.vn.bean.Music;

import java.util.List;
public interface IMusicRepository {
    void create(Music music);
    void update(Music music);
    Music findById(int id);
    List<Music> findAll();
    List<Music> findByNameAndCategory(String name);
    void deleteById(int id);
}
