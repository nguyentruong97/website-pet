package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.coatTypeEntity;
import entity.sizeEntity;
import reponsitory.coatTypeReponsitory;

@Service
public class coatTypeServiceImpl implements coatTypeServices {
		@Autowired
		private coatTypeReponsitory coatTypeReponsitory;
		
		@Override
		public coatTypeEntity save(coatTypeEntity entity) {
			return coatTypeReponsitory.save(entity);
		}

		@Override
		public List<coatTypeEntity> saveAll(List<coatTypeEntity>  entities) {
			return (List<coatTypeEntity>) coatTypeReponsitory.saveAll(entities);
		}

		@Override
		public Optional<coatTypeEntity> findById(Integer id) {
			return coatTypeReponsitory.findById(id);
		}

		@Override
		public boolean existsById(Integer id) {
			return coatTypeReponsitory.existsById(id);
		}

		@Override
		public List<coatTypeEntity> findAll() {
			return (List<coatTypeEntity>) coatTypeReponsitory.findAll();
		}

		@Override
		public List<coatTypeEntity> findAllById(List<Integer> ids) {
			return (List<coatTypeEntity>) coatTypeReponsitory.findAllById(ids);
		}

		@Override
		public long count() {
			return coatTypeReponsitory.count();
		}

		@Override
		public void deleteById(Integer id) {
			coatTypeReponsitory.deleteById(id);
		}

		@Override
		public void delete(coatTypeEntity entity) {
			coatTypeReponsitory.delete(entity);
		}

		@Override
		public void deleteAll(List<coatTypeEntity> entities) {
			coatTypeReponsitory.deleteAll(entities);
		}

		@Override
		public void deleteAll() {
			coatTypeReponsitory.deleteAll();
		}
		
		
}
