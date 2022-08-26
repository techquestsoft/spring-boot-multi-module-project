package sample.multimodule.repository;
import org.springframework.data.domain.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;
import sample.multimodule.domain.entity.Account;
@org.springframework.stereotype.Repository
public interface AccountRepository extends org.springframework.data.repository.CrudRepository<Account, Long>
{
Account findByNumber(String number);
}
