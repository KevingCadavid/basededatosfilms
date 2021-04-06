package co.edu.iudigital.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.service.face.GenderService;
import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.model.repository.GenderRepository;

@Service
public class GenderServiceImpl implements GenderService {

@Autowired	
private GenderRepository genderRepository;
	
@Override
public List<Gender> getAll() {
	List<Gender> genders = new ArrayList<>();
	genders = (List<Gender>) genderRepository.findAll();
	return genders;
   }

}