package co.grandcircus.authdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.authdemo.entity.User;
import co.grandcircus.authdemo.entity.Word;

@Repository
@Transactional
public class WordDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Word> findAll() {
		return em.createQuery("FROM Word", Word.class).getResultList();
	}
	
	public List<Word> findForUser(User user) {
		return em.createQuery("FROM Word WHERE user = :user", Word.class)
				.setParameter("user", user)
				.getResultList();
	}
	
	public List<Word> findForUserId(Long userId) {
		return em.createQuery("FROM Word WHERE user.id = :userId", Word.class)
				.setParameter("userId", userId)
				.getResultList();
	}

	public Word findById(Long id) {
		return em.find(Word.class, id);
	}
	
	public void create(Word user) {
		em.persist(user);
	}
	
	public void update(Word user) {
		em.merge(user);
	}
	
	public void delete(Long id) {
		Word word = em.getReference(Word.class, id);
		em.remove(word);
	}

}
