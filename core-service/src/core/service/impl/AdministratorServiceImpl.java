/**
 * 
 */
package core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import core.dao.AdministratorDao;
import core.model.Administrator;
import core.service.AdministratorService;

/**
 * @author Lee
 *
 */
@Service
public class AdministratorServiceImpl implements AdministratorService {

	/* (non-Javadoc)
	 * @see core.service.AdministratorService#selectAdministrator()
	 */
	@Resource
	private AdministratorDao administratorDao;
	@Override
	public Administrator selectAdministrator() {
		return this.administratorDao.selectAdministrator();
	}

}
