package org.lex.practice.repository;

import org.lex.practice.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Lex Yu
 */
@Repository
public class ItemRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	@Transactional
	public void saveItem(Item item) {
		String sql = "INSERT INTO ITEM VALUES (?, ?)";

		Object[] args = {item.getId(), item.getName()};
		int update = jdbcTemplate.update(sql, args);

		if (update == 1) {
			System.out.println("Item Save Successfully...");
		} else {
			System.out.println("Item Save Failed...");
		}

//		if (item.getId() == 6){
//			throw new RuntimeException("Some Error Occur in Repository Layer...");
//		}
	}
}
