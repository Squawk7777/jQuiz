package casa.squawk7777.jquiz.service;


import casa.squawk7777.jquiz.exception.NotExistException;
import casa.squawk7777.jquiz.model.AbstractModel;
import casa.squawk7777.jquiz.repository.GenericRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional
public class AbstractService<T extends AbstractModel> {
    protected GenericRepository<T> repo;

    public T findById(Long id) throws NotExistException {
        return repo.findById(id).orElseThrow(() -> new NotExistException());
    }

    public T save(T obj) {
        log.debug("Saving:\n{}", obj);
        return repo.save(obj);
    }

    public T update(T obj) {
        log.debug("Updating:\n{}", obj);
        return repo.save(obj);
    }

    public void delete(T obj) {
        log.debug("Deleting:\n{}", obj);
        repo.delete(obj);
    }
}
