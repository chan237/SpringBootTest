package com.zeus.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.zeus.domain.Item;
import com.zeus.mapper.ItemMapper;

public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper mapper;

	@Override
	public void regist(Item item) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Item read(Integer itemId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Item item) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Integer itemId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Item> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPicture(Integer itemId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
