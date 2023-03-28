package codegym.vn.repository;

import codegym.vn.bean.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@NamedQueries(
        @NamedQuery(name = "findNameAndCategory", query = "select m from Music m where m.nameMusic like :name and m.category like :nameCategory")
)
public class MusicRepository implements IMusicRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Override
    public void update(Music music) {
        entityManager.merge(music);
    }

    @Override
    public Music findById(int id) {
        return entityManager.find(Music.class, id);
    }

    @Override
    public List<Music> findAll() {
        return entityManager.createQuery("select m from Music m").getResultList();
    }

    @Override
    public List<Music> findByNameAndCategory(String name) {
        return entityManager.createNamedQuery("findNameAndCategory")
                .setParameter("name", "%" + name + "%").getResultList();
    }

    @Override
    public void deleteById(int id) {
        Music music = findById(id);
        entityManager.remove(music);
    }
}
