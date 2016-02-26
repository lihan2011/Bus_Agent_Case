/**
 * 
 */
package hk.edu.cuhk.itm.service;

import hk.edu.cuhk.itm.model.Sightseeing;

import java.util.List;
import java.time.LocalDate;

/**
 * @author Lee
 *
 */
public interface SightseeingService {
	List<Sightseeing> findAll();
	List<Sightseeing> findByTourCode(String tourCode);
	List<Sightseeing> findByReturnDate(LocalDate returnDate);
	List<Sightseeing> findByTourCodeAndReturnDate(String tourCode, LocalDate returnDate);
}
