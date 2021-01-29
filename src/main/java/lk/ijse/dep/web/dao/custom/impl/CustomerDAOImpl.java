package lk.ijse.dep.web.dao.custom.impl;

import lk.ijse.dep.web.dao.CrudDAOImpl;
import lk.ijse.dep.web.dao.custom.CustomerDAO;
import lk.ijse.dep.web.entity.Customer;

import java.util.List;

public class CustomerDAOImpl extends CrudDAOImpl<Customer, String> implements CustomerDAO {

    @Override
    public List<Customer> searchCustomersByName(String name) throws Exception {
        return getEntityManager().createQuery("SELECT c FROM Customer c WHERE c.name LIKE ?1")
                .setParameter(1, name + "%").getResultList();
    }
}
