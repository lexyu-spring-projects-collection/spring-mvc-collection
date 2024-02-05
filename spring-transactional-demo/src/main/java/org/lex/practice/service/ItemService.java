package org.lex.practice.service;

import org.lex.practice.entity.Item;
import org.lex.practice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * @author : Lex Yu
 */
@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Transactional(propagation = Propagation.REQUIRED,
			noRollbackFor = RuntimeException.class, rollbackFor = SQLException.class)
	public void saveItemInfo() throws SQLException {

		for (long i = 1; i < 10; i++) {
			Item item = new Item(i, "Item-" + i);

			itemRepository.saveItem(item);

			if (i == 7) {
				throw new SQLException("Some Error Occur...");
			}
		}
	}
}
