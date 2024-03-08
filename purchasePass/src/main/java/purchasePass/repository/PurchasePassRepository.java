package purchasePass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import purchasePass.entity.PurchasePass;

@Repository
public interface PurchasePassRepository extends JpaRepository<PurchasePass, Long> {
}
