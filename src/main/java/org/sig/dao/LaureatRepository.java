package org.sig.dao;
import org.sig.Entity.Laureat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;;

public interface LaureatRepository extends JpaRepository<Laureat, Long> {
	@Query("select l from Laureat l where l.name like:x")
	public Page<Laureat> chercher(@Param("x")String mc, Pageable pageable);
}
