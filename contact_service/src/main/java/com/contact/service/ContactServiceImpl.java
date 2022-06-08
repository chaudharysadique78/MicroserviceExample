package com.contact.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list=List.of(new Contact(1L,"Amit@gmail.com","'Amit Trevedi",131L),
			new Contact(2L,"Rajesh@gmail.com","'Rajesh Trevedi",131L),
			new Contact(3L,"Sadik@gmail.com","'Sadik Chaudhary",132L),
			new Contact(4L,"Amir@gmail.com","'Amir Trevedi",132L),
			new Contact(5L,"Saurabh@gmail.com","'Saurabh Trevedi",133L),
			new Contact(6L,"Amit@gmail.com","'Amit Trevedi",133L),
			new Contact(7L,"Amiz@gmail.com","'Amiz Trevedi",134L)			
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return this.list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
